package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice()  }

        val calButton: Button = findViewById(R.id.count_button)
        calButton.setOnClickListener { cal()  }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val randomInt3 = Random().nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
        resultText.text = randomInt.toString()
        resultText2.text = randomInt2.toString()
        resultText3.text = randomInt3.toString()
    }

    private fun cal(){
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
        val total: TextView = findViewById(R.id.result);
        val num = resultText.text.toString().toInt() + resultText2.text.toString().toInt() + resultText3.text.toString().toInt()
        total.text = num.toString()
    }
}
