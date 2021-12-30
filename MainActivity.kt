package com.example.randomnumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onNextIntent(view: View) {
        val intent = Intent(applicationContext, GameActivity::class.java)
        intent.putExtra("min", Integer.parseInt(findViewById<EditText>(R.id.min).text.toString()))
        intent.putExtra("max", Integer.parseInt(findViewById<EditText>(R.id.max).text.toString()))
        startActivity(intent)
    }
}
