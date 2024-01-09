package com.example.coffi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()
        clickListener();

        val btn_back = findViewById<Button>(R.id.home_btn_back)
        btn_back.setOnClickListener {
            val _intentLogin =
                Intent(this, MenuActivity::class.java)

            startActivity(_intentLogin)

        }
    }

    @SuppressLint("WrongViewCast")
    public fun clickListener() {
        var btn_cafe = findViewById<CardView>(R.id.btnCafeList)

        btn_cafe.setOnClickListener {
            openCafeImageActivity()
        }

    }

    public fun openCafeImageActivity(){
        startActivity(Intent(this, CafeImageSlideActivity::class.java))
    }
}
