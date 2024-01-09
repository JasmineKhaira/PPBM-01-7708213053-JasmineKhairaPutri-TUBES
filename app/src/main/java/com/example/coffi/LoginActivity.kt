package com.example.coffi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

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


//        val btn_masuk = findViewById<Button>(R.id.btn_login)
//        btn_masuk.setOnClickListener {
//            val _intentLogin =
//                Intent(this, MenuActivity::class.java)
//
//            startActivity(_intentLogin)
//        }

//        var inputusername = findViewById<EditText>(R.id.input_username)
//        var inputpassword = findViewById<EditText>(R.id.input_password)
//        var btnLogin = findViewById<Button>(R.id.btn_login)
//
//        inputusername.setTextSize(25f)
//
//        btnLogin.setOnClickListener {
//            var isiusername = inputusername.text.toString()
//            var isipassword = inputpassword.text.toString()
//
//            if (isiusername != "" &&
//                isipassword != ""
//            ) {
//                //A = lanjut ke pengecekan selanjutnya 9username - password match)
//                if (isiusername.equals("jasmine") &&
//                    isipassword.equals("123")) {
//                    // password + username cocok
//                    val _intentLogin =
//                    Intent(this, MenuActivity::class.java)
//                    startActivity(_intentLogin)
//
//                } else {
//                    //B = username dan password salah
//                    Toast.makeText(
//                        this,
//                        "Username or Password Incorrect",
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//            }
//
//
//        }

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