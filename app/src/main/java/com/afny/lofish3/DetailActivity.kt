package com.afny.lofish3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val image = intent.getParcelableExtra<Image>(MainActivity.INTENT_PARCELABLE)

        val imgSrc = findViewById<ImageView>(R.id._imageDetail)
        val imgTitle = findViewById<TextView>(R.id._imageTittle)
        val imgDesc = findViewById<TextView>(R.id._imageDesc)

        image?.imgSrc?.let { imgSrc.setImageResource(it) }
        imgTitle.text = image!!.imgTittle
        imgDesc.text = image!!.imgDesc

    }
}