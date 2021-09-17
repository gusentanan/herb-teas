package com.example.herb_teas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    private lateinit var dteaName: TextView
    private  lateinit var dteaDetail: TextView
    private  lateinit var dteaImg: ImageView

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionBar = supportActionBar
        actionBar!!.title = "Detail Tea"
        actionBar.setDisplayHomeAsUpEnabled(true)


        dteaName = findViewById(R.id.dtv_tea_name)
        dteaDetail = findViewById(R.id.dtv_tea_detail)
        dteaImg = findViewById(R.id.img_tea_detail)

        val teaName = intent.getStringExtra(EXTRA_NAME)
        val teaDetail = intent.getStringExtra(EXTRA_DETAIL)
        val teaImg = intent.getIntExtra(EXTRA_IMAGE, 0)

        dteaName.text = teaName
        dteaDetail.text = teaDetail
        dteaImg.setImageResource(teaImg)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}