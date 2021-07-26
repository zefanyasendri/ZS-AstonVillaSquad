package com.dicoding.picodiploma.zs_astonvillasquad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailPlayerActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_POSITION = "extra_position"
        const val EXTRA_NUMBER = "extra_number"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_player)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Player"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvName: TextView = findViewById(R.id.tv_player_name)
        val imgPhoto: ImageView = findViewById(R.id.img_player_photo)
        val tvDetail: TextView = findViewById(R.id.tv_player_detail)
        val tvPosition: TextView = findViewById(R.id.tv_player_position)
        val tvNumber: TextView = findViewById(R.id.tv_nomor_punggung)

        val tImage = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tPosition = intent.getStringExtra(EXTRA_POSITION)
        val tNumber = intent.getStringExtra(EXTRA_NUMBER)

        tvName.text = tName
        Glide.with(this)
            .load(tImage)
            .apply(RequestOptions())
            .into(imgPhoto)
        tvDetail.text = tDetail
        tvPosition.text = tPosition
        tvNumber.text = tNumber
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}