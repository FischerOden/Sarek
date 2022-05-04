package com.caspian.sareknationalpark

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

const val EXTRA_MESSAGE = "com.caspian.sareknationalpark.MESSAGE"
const val EXTRA_IMAGE_SOURCE = "com.caspian.sareknationalpark.IMAGE_SOURCE"
const val EXTRA_HEADING = "com.caspian.sareknationalpark.HEADING"
const val EXTRA_IMAGE_SOURCE_READ_MORE = "com.caspian.sareknationalpark.IMAGE_SOURCE_READ_MORE"
const val EXTRA_TEXT_READ_MORE = "com.caspian.sareknationalpark.TEXT_READ_MORE"

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun textBear(view: View) {
        var imageSource = "bear"
        var imageSourceReadMore = "greenerylapland"
        var articleTextContent = getString(R.string.bear_text)
        var articleHeading = getString(R.string.bear_heading)
        var readMoreText = getString(R.string.read_more_green)
        var clickAction = "textGreen"
        var intent = Intent(this, TestActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, articleTextContent)
            putExtra(EXTRA_IMAGE_SOURCE, imageSource)
            putExtra(EXTRA_HEADING, articleHeading)
            putExtra(EXTRA_IMAGE_SOURCE_READ_MORE, imageSourceReadMore)
            putExtra(EXTRA_TEXT_READ_MORE, readMoreText)
        }
        startActivity(intent)
    }

    fun textGeo(view: View) {
        var imageSource = "sareklandscape"
        var articleTextContent = getString(R.string.geo_text)
        var articleHeading = getString(R.string.geo_heading)
        var intent = Intent(this, TestActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, articleTextContent)
            putExtra(EXTRA_IMAGE_SOURCE, imageSource)
            putExtra(EXTRA_HEADING, articleHeading)
        }
        startActivity(intent)
    }

    fun textGreen(view: View) {
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

    fun textNature(view: View) {
        var imageSource = "children"
        var articleTextContent = getString(R.string.nature_text)
        var articleHeading = getString(R.string.nature_heading)
        var intent = Intent(this, TestActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, articleTextContent)
            putExtra(EXTRA_IMAGE_SOURCE, imageSource)
            putExtra(EXTRA_HEADING, articleHeading)
        }
        startActivity(intent)
    }

    fun textSapmi(view: View) {
        var imageSource = "flag"
        var articleTextContent = getString(R.string.sapmi_text)
        var articleHeading = getString(R.string.sami_heading)
        var intent = Intent(this, TestActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, articleTextContent)
            putExtra(EXTRA_IMAGE_SOURCE, imageSource)
            putExtra(EXTRA_HEADING, articleHeading)
        }
        startActivity(intent)
    }
}
