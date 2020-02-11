package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countUpButton: Button = findViewById(R.id.countUp_button)
        val resetButton: Button = findViewById(R.id.reset_button)
        val resultText: TextView = findViewById(R.id.result_textView)

        resultText.text = "Dice Rolled!!"

        resetButton.setOnClickListener {
            resultText.text = "0"
        }

        rollButton.setOnClickListener {
            val randomInt = (1..6).random()
            result_textView.text = randomInt.toString()
            rollDice()
        }

        countUpButton.setOnClickListener {
            if (result_textView.text.toString() == "Dice Rolled!!"){
                result_textView.text = "1"
            }
            if (result_textView.text.toString().toInt() < 6 ){
                result_textView.text = (result_textView.text.toString().toInt() + 1).toString()
            }
        }


    }

    private fun rollDice(){

        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

    }
}
