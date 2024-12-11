package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val signInActText = findViewById<TextView>(R.id.signUptext)
        signInActText.setOnClickListener {
            val Intent = Intent(this, activity_registration::class.java)
            startActivity(Intent)
        }

        val SignInActButton = findViewById<Button>(R.id.nextButton)
        SignInActButton.setOnClickListener {
            val Intent = Intent(this, Dashboard::class.java)
            startActivity(Intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val value = intent.getStringExtra("key")
    }
}