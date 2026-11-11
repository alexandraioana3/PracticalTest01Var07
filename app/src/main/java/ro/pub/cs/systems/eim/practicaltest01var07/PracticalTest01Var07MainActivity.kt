package ro.pub.cs.systems.eim.practicaltest01var07

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticalTest01Var07MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var07_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val firstEditText = findViewById<EditText>(R.id.first_edit_text)
        val secondEditText = findViewById<EditText>(R.id.second_edit_text)
        val thirdEditText = findViewById<EditText>(R.id.third_edit_text)
        val fourthEditText = findViewById<EditText>(R.id.fourth_edit_text)
        val randomButton = findViewById<Button>(R.id.random_button)

        randomButton.setOnClickListener {
            val first = firstEditText.text.toString().toIntOrNull()
            val second = secondEditText.text.toString().toIntOrNull()
            val third = thirdEditText.text.toString().toIntOrNull()
            val fourth = fourthEditText.text.toString().toIntOrNull()
            if (first == null) {
                val num = (0..10).random();
                firstEditText.setText(num.toString())
            }
            if (second == null) {
                val num = (0..10).random();
                secondEditText.setText(num.toString())
            }
            if (third == null) {
                val num = (0..10).random();
                thirdEditText.setText(num.toString())
            }
            if (fourth == null) {
                val num = (0..10).random();
                fourthEditText.setText(num.toString())
            }
            return@setOnClickListener

        }
    }
}