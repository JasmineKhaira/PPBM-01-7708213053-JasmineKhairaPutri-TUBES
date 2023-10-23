package com.example.coffi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btn_pindah = findViewById<Button>(R.id.main_login_btn)
        btn_pindah.setOnClickListener {
            val _intentLogin =
                Intent(this, LoginActivity::class.java)

            startActivity(_intentLogin)
        }

        val btn_pindah2 = findViewById<Button>(R.id.main_signup_btn)
        btn_pindah2.setOnClickListener {
            val _intentSignup =
                Intent(this, SignupActivity::class.java)
            startActivity(_intentSignup)
        }
    }
}