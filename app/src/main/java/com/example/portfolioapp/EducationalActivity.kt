package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class EducationalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_educational)

        val backToHomeButton = findViewById<ImageView>(R.id.backButton);
        backToHomeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent);
        }

    }
}