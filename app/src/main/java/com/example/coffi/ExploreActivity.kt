package com.example.coffi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class ExploreActivity : AppCompatActivity() {

    private lateinit var list: Spinner
    private lateinit var btnPilih: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)
        supportActionBar?.hide()

        list = findViewById(R.id.spin_categories)
        btnPilih = findViewById(R.id.btn_pilih)

        btnPilih.setOnClickListener {
            val toast = Toast.makeText(this, "you choose ${list.selectedItem}", Toast.LENGTH_SHORT)
            toast.show()
        }

        val btn_back = findViewById<Button>(R.id.exp_btn_back)
        btn_back.setOnClickListener {
            val _intentLogin =
                Intent(this, MenuActivity::class.java)

            startActivity(_intentLogin)
        }
    }
}