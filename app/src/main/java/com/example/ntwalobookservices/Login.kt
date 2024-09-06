package com.example.ntwalobookservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email: EditText = findViewById(R.id.email)
        val password: EditText = findViewById(R.id.password)
        val LoginBtn: Button = findViewById(R.id.loginButton)
        val googleButton: Button = findViewById(R.id.googleButton)
        val facebookButton: Button = findViewById(R.id.facebookButton)
        val SignUpText: TextView = findViewById<TextView>(R.id.SignUpText)

        LoginBtn.setOnClickListener {
            val emailText = email.text.toString()
            val passwordText = password.text.toString()

            if (emailText.isEmpty() || passwordText.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Handle login logic here
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Dashboard::class.java)
                startActivity(intent)
            }
        }

        googleButton.setOnClickListener {
            // Handle Google login logic here
            Toast.makeText(this, "Google login", Toast.LENGTH_SHORT).show()
        }

        facebookButton.setOnClickListener {
            // Handle Facebook login logic here
            Toast.makeText(this, "Facebook login", Toast.LENGTH_SHORT).show()
        }

        SignUpText.setOnClickListener {
            // Navigate to sign-up activity
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
    }
}