package com.example.herb_teas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutMe : AppCompatActivity() {
    private lateinit var myImage: ImageView

    companion object{
        const val MY_IMAGE = "my_image"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        var actionBar = supportActionBar
        actionBar!!.title = "About Me"
        actionBar.setDisplayHomeAsUpEnabled(true)

        myImage = findViewById(R.id.my_img)
        val img = intent.getIntExtra(MY_IMAGE,0)
        myImage.setImageResource(img)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}