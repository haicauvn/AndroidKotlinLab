package com.example.dice_rolller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private fun RollDice(){
        val randInt1 = (1..6).random()
        val randInt2 = (1..6).random()
        result_text.text = (randInt1+ randInt2).toString()
        val draw1 = when(randInt1){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val draw2 = when(randInt2){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        dice_image1.setImageResource(draw1)
        dice_image2.setImageResource(draw2)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button= findViewById(R.id.roll_button)
        val resultText:TextView = findViewById(R.id.result_text)
        val diceImage1:ImageView = findViewById(R.id.dice_image1)
        val diceImage2:ImageView = findViewById(R.id.dice_image2)

        rollButton.setOnClickListener(){
            RollDice()
        }

    }

}
