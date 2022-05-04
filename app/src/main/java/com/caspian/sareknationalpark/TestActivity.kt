package com.caspian.sareknationalpark

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        var articleTextContent = intent.getStringExtra(EXTRA_MESSAGE)
        var articleHeading = intent.getStringExtra(EXTRA_HEADING)
        var imageSource = intent.getStringExtra(EXTRA_IMAGE_SOURCE)
        var imageSourceReadMore = intent.getStringExtra(EXTRA_IMAGE_SOURCE_READ_MORE)
        var readMoreText = intent.getStringExtra(EXTRA_TEXT_READ_MORE)

        var textView = findViewById<TextView>(R.id.textView2).apply {
            text = articleTextContent
        }

        var textViewSecond = findViewById<TextView>(R.id.textView3).apply {
            text = articleHeading
        }

        var textViewThird = findViewById<TextView>(R.id.textView4).apply {
            text = readMoreText
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

        var imageViewSecond = findViewById<ImageView>(R.id.img).apply {
            if (imageSourceReadMore == "greenerylapland") {
                setImageResource(R.drawable.greenerylapland)
            }
        }

        var cardView = findViewById<CardView>(R.id.cardView7).apply {
            if (readMoreText != getString(R.string.read_more_green)) {
                layoutParams.height = 0
            }
        }
    }

    fun cardReadMore(view: View) {
        var imageSource = "greenerylapland"
        var articleTextContent = getString(R.string.greenery_text)
        var articleHeading = getString(R.string.green_heading)
        var intent = Intent(this, TestActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, articleTextContent)
            putExtra(EXTRA_IMAGE_SOURCE, imageSource)
            putExtra(EXTRA_HEADING, articleHeading)
        }
        startActivity(intent)
    }
}