package ro.pub.cs.systems.eim.Colocviu1_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Colocviu1_1SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_colocviu1_1_secondary)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonRegister = findViewById<Button>(R.id.button_REGISTER)
        val buttonCancel = findViewById<Button>(R.id.button_Cancel)
        val editText2 = findViewById<EditText>(R.id.text_act_2)




        val editText = findViewById<EditText>(R.id.text_act_2)


        val textFromMain = intent.getStringExtra("text") ?: ""
        editText.setText(textFromMain)


        buttonRegister.setOnClickListener {
            Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        buttonCancel.setOnClickListener {
            Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val countFromMain = intent.getIntExtra("count", 0)

        
        editText.setText("$textFromMain\nNumăr apăsări: $countFromMain")

    }
}