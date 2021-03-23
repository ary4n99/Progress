package com.aryanagrawal.progress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonCounter = 0
        button.setOnClickListener() {
            buttonCounter += 1
            textView.text = buttonCounter.toString()
            Toast.makeText(this@MainActivity, "Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}