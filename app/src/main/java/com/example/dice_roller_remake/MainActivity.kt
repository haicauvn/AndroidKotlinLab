package com.example.dice_roller_remake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import timber.log.Timber

const val NUM1_KEY = "num1_key"
const val NUM2_KEY = "num2_key"
class MainActivity : AppCompatActivity() {
    private var a = 0
    private var b = 0
    private fun ShowResult(a: Int, b: Int){
        result_textview.text = (a+b).toString()
        val draw1 = when(a){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val draw2 = when(b){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        image1.setImageResource(draw1)
        image2.setImageResource(draw2)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll_button:Button = findViewById(R.id.roll_button)
        val result_text:TextView = findViewById(R.id.result_textview)
        val image1:ImageView = findViewById(R.id.image1)
        val image2:ImageView = findViewById(R.id.image2)
        if (savedInstanceState != null) {
            a = savedInstanceState.getInt(NUM1_KEY, 0)
            b = savedInstanceState.getInt(NUM2_KEY, 0)
            ShowResult(a,b)
        }
        roll_button.setOnClickListener(){
            a = (1..6).random()
            b = (1..6).random()
            ShowResult(a,b)
        }
        Timber.i("onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart called")
    }
    override fun onResume() {
        super.onResume()
        Timber.i("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart Called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Timber.i("onSaveInstanceState Called")
        outState.putInt(NUM1_KEY, a)
        outState.putInt(NUM2_KEY, b)

    }
}
