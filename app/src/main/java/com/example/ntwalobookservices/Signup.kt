package com.example.ntwalobookservices

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Signup : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email: EditText = findViewById(R.id.email)
        val password: EditText = findViewById(R.id.password)
        val repeatPassword: EditText = findViewById(R.id.repeatPassword)
        val signupButton: Button = findViewById(R.id.signupButton)
        val googleButton: Button = findViewById(R.id.googleButton)
        val facebookButton: Button = findViewById(R.id.facebookButton)
        val loginText: TextView = findViewById<TextView>(R.id.loginText)


        signupButton.setOnClickListener {
            val emailText = email.text.toString()
            val passwordText = password.text.toString()
            val repeatPasswordText = repeatPassword.text.toString()

            if (emailText.isEmpty() || passwordText.isEmpty() || repeatPasswordText.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else if (passwordText != repeatPasswordText) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            } else {
                // Handle sign-up logic here
                Toast.makeText(this, "Sign-up successful", Toast.LENGTH_SHORT).show()
            }
        }

        googleButton.setOnClickListener {
            // Handle Google sign-up logic here
            Toast.makeText(this, "Google sign-up", Toast.LENGTH_SHORT).show()
        }

        facebookButton.setOnClickListener {
            // Handle Facebook sign-up logic here
            Toast.makeText(this, "Facebook sign-up", Toast.LENGTH_SHORT).show()
        }

        loginText.setOnClickListener {
            // Navigate to login activity
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }


    }
}