package com.example.coffi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        supportActionBar?.hide()
        clickListener();
    }

    public fun clickListener(){
        var btn_home = findViewById<CardView>(R.id.menu_home)
        var btn_explore = findViewById<CardView>(R.id.menu_explore)
        var btn_profile = findViewById<CardView>(R.id.menu_profile)
        var btn_rate = findViewById<CardView>(R.id.menu_rate)
        var btn_info = findViewById<CardView>(R.id.menu_info)
        var btn_logout = findViewById<CardView>(R.id.menu_logout)

        btn_home.setOnClickListener {
            openHomeActivity()
        }
        btn_explore.setOnClickListener {
            openExploreActivity()
        }
        btn_profile.setOnClickListener {
            openProfileActivity()
        }
        btn_rate.setOnClickListener {
            openRateActivity()
        }
        btn_info.setOnClickListener {
            openInfoActivity()
        }
        btn_logout.setOnClickListener {
            openLoginActivity()
        }
    }

    public fun openHomeActivity(){
        startActivity(Intent(this, HomeActivity::class.java))
    }

    public fun openExploreActivity(){
        startActivity(Intent(this, ExploreActivity::class.java))
    }

    public fun openProfileActivity(){
        startActivity(Intent(this, ProfileActivity::class.java))
    }

    public fun openRateActivity(){
        startActivity(Intent(this, RatingActivity::class.java))
    }

    public fun openInfoActivity(){
        startActivity(Intent(this, DeveloperActivity::class.java))
    }

    public fun openLoginActivity(){
        startActivity(Intent(this, LoginActivity::class.java))
    }

}