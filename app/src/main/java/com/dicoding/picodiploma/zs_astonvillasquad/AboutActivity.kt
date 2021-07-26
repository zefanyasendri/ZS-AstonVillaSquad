package com.dicoding.picodiploma.zs_astonvillasquad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import com.dicoding.picodiploma.zs_astonvillasquad.R

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val actionbar = supportActionBar
        actionbar!!.title = "About Me"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val myImage: ImageView = findViewById(R.id.img_item_photo)

        val tImage = "https://d17ivq9b7rppb3.cloudfront.net/small/avatar/202107262332019a7a7dd7906dbc8bd6d8c99e7b6900fc.png"

        Glide.with(this)
            .load(tImage)
            .placeholder(R.drawable.zefa)
            .into(myImage)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}