package com.example.coffi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        supportActionBar?.hide()

        val btn_back = findViewById<Button>(R.id.su_btn_back)

        btn_back.setOnClickListener {
            val _intentBack =
                Intent(this, MainActivity::class.java)

            startActivity(_intentBack)
        }

        val btn_masuk = findViewById<Button>(R.id.signupButton)
        btn_masuk.setOnClickListener {
            val _intentLogin =
                Intent(this, MenuActivity::class.java)

            startActivity(_intentLogin)
        }
    }
}