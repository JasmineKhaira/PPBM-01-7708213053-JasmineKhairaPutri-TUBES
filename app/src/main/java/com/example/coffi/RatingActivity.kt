package com.example.coffi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class RatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)
        supportActionBar?.hide()

        val btn_back = findViewById<Button>(R.id.rate_btn_back)

        btn_back.setOnClickListener {
            val _intentBack =
                Intent(this, MenuActivity::class.java)

            startActivity(_intentBack)
        }

        val ratingBar = findViewById<RatingBar>(R.id.rate_bar)
        val btnRate = findViewById<Button>(R.id.btn_rate)
        val ratingScale = findViewById<TextView>(R.id.txt_rate)

        ratingBar.setOnRatingBarChangeListener { rateBar, fl, b ->
            ratingScale.text = fl.toString()
            when (rateBar.rating.toInt()){
                1 -> ratingScale.text = "Very Bad"
                2 -> ratingScale.text = "Bad"
                3 -> ratingScale.text = "Good"
                4 -> ratingScale.text = "Great"
                5 -> ratingScale.text = "Awesome"
                else -> ratingScale.text = " "
            }
        }

        btnRate.setOnClickListener {
            val message = ratingBar.rating.toString()
            Toast.makeText(this, "Rating is: "+message, Toast.LENGTH_SHORT).show()
        }
    }
}