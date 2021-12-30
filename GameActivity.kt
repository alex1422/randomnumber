package com.example.randomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class GameActivity : AppCompatActivity() {
    var min:Int = 0
    var max:Int = 0
    var m:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        min = intent.getIntExtra("min", 0)
        max = intent.getIntExtra("max", 100)
        Solving()
    }

    fun Solving(){
        var l = max - min + 1
        m = (l/2).toInt() + min - 1

        findViewById<TextView>(R.id.text_1).text = "Это число больше " + m.toString() + "?"
        if (l == 1){
            finishFunc()
        }
    }
    fun finishFunc() {
        findViewById<TextView>(R.id.text_1).text = "Это  " + min.toString()
        findViewById<Button>(R.id.text_2).isEnabled = false
        findViewById<Button>(R.id.text_3).isEnabled = false
    }

    fun onYesNoClick(view: android.view.View) {
        when (view.id) {
            R.id.text_2 -> {
                min = m + 1
            }
            R.id.text_3 -> {
                max = m
            }
        }
        Solving()
    }
}
