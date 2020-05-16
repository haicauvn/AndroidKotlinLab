package com.example.constraintlayouttest

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private fun makeColored(view: View){
        val rand = Random()
        val color = Color.argb(255,rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
        view.setBackgroundColor(color)
    }
    private fun makeColoredAll(list: List<View>, view: View){
        for(item in list){
            when(view.id){
                R.id.button_red -> item.setBackgroundColor(Color.RED)
                R.id.button_yellow -> item.setBackgroundColor(Color.YELLOW)
                R.id.button_green -> item.setBackgroundColor(Color.GREEN)
            }
        }
    }
    private fun setListeners(){
        val boxOneText = findViewById<TextView>(R.id.box_one)
        val boxTwoText = findViewById<TextView>(R.id.box_two)
        val boxThreeText = findViewById<TextView>(R.id.box_three)
        val boxFourText = findViewById<TextView>(R.id.box_four)
        val boxFiveText = findViewById<TextView>(R.id.box_five)
        val rootLayout = findViewById<View>(R.id.parentRoot)
        val clickableView: List<View> = listOf(boxOneText, boxTwoText,boxThreeText,
            boxFourText, boxFiveText, rootLayout)
        for( item in clickableView){
            item.setOnClickListener{
                makeColored(it)
            }
        }
        val button_red = findViewById<Button>(R.id.button_red)
        val button_yellow = findViewById<Button>(R.id.button_yellow)
        val button_green = findViewById<Button>(R.id.button_green)
        val clickColorView: List<View> = listOf(button_red, button_yellow, button_green)
        for(item in clickColorView){
            item.setOnClickListener {
                makeColoredAll(clickableView, it)
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
}
