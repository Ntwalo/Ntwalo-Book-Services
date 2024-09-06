package com.example.ntwalobookservices

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.startButton)
        val SignUpText = findViewById<TextView>(R.id.SignText)

        startButton.setOnClickListener {
            // Handle start button click
            // For example, navigate to a new activity
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        SignUpText.setOnClickListener {
            // Handle login button click
            // For example, navigate to a login activity
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
    }
}
