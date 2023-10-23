package com.example.coffi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class LoginActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityLoginBinding
//
//    lateinit var username : EditText
//    lateinit var password : EditText
//    lateinit var loginButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val btn_back = findViewById<Button>(R.id.log_btn_back)

        btn_back.setOnClickListener {
            val _intentBack =
                Intent(this, MainActivity::class.java)

            startActivity(_intentBack)
        }

        val checkBox1 = findViewById<CheckBox>(R.id.cb_login) as CheckBox

        val btn_masuk = findViewById<Button>(R.id.loginButton)
        btn_masuk.setOnClickListener {
            val _intentLogin =
                Intent(this, MenuActivity::class.java)

            startActivity(_intentLogin)
        }
    }
}

//        binding = ActivityLoginBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        binding.loginButton.setOnClickListener(View.OnClickListener {
//            if (binding.username.text.toString()== "user" && binding.password.text.toString() == "1234"){
//                Toast.makeText(this,"Login Successful", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(this,"Login Failed", Toast.LENGTH_SHORT).show()
//            }
//        })