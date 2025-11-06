package ro.pub.cs.systems.eim.Colocviu1_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var buttons_activity_number = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_colocviu1_1_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val buttonNorth = findViewById<Button>(R.id.button_NORTH)
        val buttonSouth = findViewById<Button>(R.id.button_SOUTH)
        val buttonEast = findViewById<Button>(R.id.button_EAST)
        val buttonWest = findViewById<Button>(R.id.button_WEST)

        val camp1 = findViewById<EditText>(R.id.camp_text)

        buttonNorth.setOnClickListener {
            camp1.setText(camp1.text.toString() + "NORTH" + " ")
            buttons_activity_number++;
        }

        buttonSouth.setOnClickListener {
            camp1.setText(camp1.text.toString() + "SOUTH" + " ")
            buttons_activity_number++;
        }

        buttonWest.setOnClickListener {
            camp1.setText(camp1.text.toString() + "WEST" + " ")
            buttons_activity_number++;
        }

        buttonEast.setOnClickListener {
            camp1.setText(camp1.text.toString() + "EAST" + " ")
            buttons_activity_number++;

        }


    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("nr_puncte", buttons_activity_number)
        android.util.Log.d("DBG", "onSaveInstanceState: nr_puncte = $buttons_activity_number")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        buttons_activity_number = savedInstanceState.getInt("nr_puncte")
        android.util.Log.d("DBG", "onRestoreInstanceState: nr_puncte = $buttons_activity_number")
    }


}