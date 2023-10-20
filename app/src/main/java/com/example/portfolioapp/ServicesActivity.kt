package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ServicesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)

        val homeButton = findViewById<ImageView>(R.id.backHomebtn)
        homeButton.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }
    }
}