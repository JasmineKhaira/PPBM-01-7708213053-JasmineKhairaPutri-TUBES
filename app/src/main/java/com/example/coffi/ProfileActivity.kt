package com.example.coffi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.hide()

        val btn_back = findViewById<Button>(R.id.prof_btn_back)

        btn_back.setOnClickListener {
            val _intentBack =
                Intent(this, MenuActivity::class.java)

            startActivity(_intentBack)
        }
    }
}