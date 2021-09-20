package com.example.herb_teas.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.herb_teas.R
import com.example.herb_teas.model.Teas

class DetailActivity : AppCompatActivity() {
    private lateinit var dteaName: TextView
    private  lateinit var dteaDetail: TextView
    private  lateinit var dteaImg: ImageView

    companion object {
        const val EXTRA_TEA = "extra_tea"
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

        val tea = intent.getParcelableExtra<Teas>(EXTRA_TEA) as Teas

        dteaName.text = tea.name
        dteaDetail.text = tea.detail
        dteaImg.setImageResource(tea.img)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}