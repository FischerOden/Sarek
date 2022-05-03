package com.caspian.sareknationalpark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        var articleTextContent = intent.getStringExtra(EXTRA_MESSAGE)
        var articleHeading = intent.getStringExtra(EXTRA_HEADING)
        var imageSource = intent.getStringExtra(EXTRA_IMAGE_SOURCE)

        var textView = findViewById<TextView>(R.id.textView2).apply {
            text = articleTextContent
        }

        var textViewSecond = findViewById<TextView>(R.id.textView3).apply {
            text = articleHeading
        }

        var imageView = findViewById<ImageView>(R.id.imageView2).apply {
            if (imageSource == "bear") {
                setImageResource(R.drawable.bear)
            } else if (imageSource == "sareklandscape") {
                setImageResource(R.drawable.sareklandscape)
            } else if (imageSource == "greenerylapland") {
                setImageResource(R.drawable.greenerylapland)
            } else if (imageSource == "children") {
                setImageResource(R.drawable.children)
            } else if (imageSource == "flag") {
                setImageResource(R.drawable.flag)
            } else {
                layoutParams.height = 0
            }
        }
    }
}