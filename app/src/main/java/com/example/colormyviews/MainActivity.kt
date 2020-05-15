package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun makeColored(view:View){
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.boxTwo_text -> view.setBackgroundColor(Color.GRAY)
            R.id.boxThree_text -> view.setBackgroundColor(Color.BLUE)
            R.id.boxFour_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.boxFive_text -> view.setBackgroundColor(Color.BLUE)
            R.id.button_red -> boxThree_text.setBackgroundResource(R.color.my_red)
            R.id.button_yellow -> boxFour_text.setBackgroundResource(R.color.my_yellow)
            R.id.button_green -> boxFive_text.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boxOne = findViewById<TextView>(R.id.box_one_text)
        val boxTwo = findViewById<TextView>(R.id.boxTwo_text)
        val boxThree = findViewById<TextView>(R.id.boxThree_text)
        val boxFour = findViewById<TextView>(R.id.boxFour_text)
        val boxFive = findViewById<TextView>(R.id.boxFive_text)
        val rootConstraintsLayout = findViewById<View>(R.id.contraintsLayout)
        val redButton = findViewById<TextView>(R.id.button_red)
        val greenButton = findViewById<TextView>(R.id.button_green)
        val yellowButton = findViewById<TextView>(R.id.button_yellow)

        val viewList: List<View> =
            listOf(boxOne, boxTwo, boxThree, boxFour, boxFive, rootConstraintsLayout, redButton, greenButton, yellowButton)
        for (item in viewList) {
            item.setOnClickListener { makeColored(it) }
        }

    }
}
