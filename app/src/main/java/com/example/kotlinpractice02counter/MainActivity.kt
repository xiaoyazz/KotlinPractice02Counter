package com.example.kotlinpractice02counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize variables
        val welcomeText : TextView = findViewById(R.id.welcome_text)
        val btn: Button = findViewById(R.id.btn)
        // Add functionalities
        btn.setOnClickListener{ increaseCounter() }
    }

    // Create a function
    private fun increaseCounter() {
        val counterText : TextView = findViewById(R.id.counter_text)
        var counter = counterText.text.toString().toInt()
        counter++
        counterText.text = counter.toString()
    }
}