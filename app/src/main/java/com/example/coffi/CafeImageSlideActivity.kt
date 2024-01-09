package com.example.coffi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.coffi.adapters.ImageAdapter
import com.example.coffi.models.ImageItem
import com.google.android.material.slider.Slider.OnChangeListener
import java.util.UUID

class CafeImageSlideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cafe_image_slide)
        supportActionBar?.hide()
    }

}