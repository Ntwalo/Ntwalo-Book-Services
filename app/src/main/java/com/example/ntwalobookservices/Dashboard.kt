package com.example.ntwalobookservices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        val profileButton = findViewById<ImageButton>(R.id.profile_button)
        val mainPageButton = findViewById<ImageButton>(R.id.main_page_button)
        val trackingBooksButton = findViewById<ImageButton>(R.id.tracking_books_button)
        val buyingBooksButton = findViewById<ImageButton>(R.id.buying_books_button)
        val exitButton = findViewById<ImageButton>(R.id.exit_button)


        profileButton.setOnClickListener {
            // Handle profile navigation
            Toast.makeText(this, "Profile Page", Toast.LENGTH_SHORT).show()
        }

        mainPageButton.setOnClickListener {
            // Handle main page navigation
            Toast.makeText(this, "Back to Main Dashboard Page", Toast.LENGTH_SHORT).show()
        }

        trackingBooksButton.setOnClickListener {
            // Handle tracking books navigation
            Toast.makeText(this, "Tracking Books Page", Toast.LENGTH_SHORT).show()
        }

        buyingBooksButton.setOnClickListener {
            // Handle buying books navigation
            Toast.makeText(this, "Buying Books Page", Toast.LENGTH_SHORT).show()
        }

        exitButton.setOnClickListener {
            // Handle exit action
            Toast.makeText(this, "Logging Out", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}