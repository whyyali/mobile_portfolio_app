package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val skillBtn = findViewById<AppCompatButton>(R.id.skillButton);
        val serviceBtn = findViewById<AppCompatButton>(R.id.serviceButton);
        val educationBtn = findViewById<AppCompatButton>(R.id.educationButton);
        val contactBtn = findViewById<AppCompatButton>(R.id.contactButton);


        skillBtn.setOnClickListener{
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        serviceBtn.setOnClickListener {
            val intent = Intent(this, ServicesActivity::class.java)
            startActivity(intent)
        }

        educationBtn.setOnClickListener {
            val intent = Intent(this, EducationalActivity::class.java)
            startActivity(intent)
        }

        contactBtn.setOnClickListener{
            val intent = Intent(this , ContactActivity::class.java)
            startActivity(intent)
        }
    }
}