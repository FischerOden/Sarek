package com.caspian.sareknationalpark

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

const val EXTRA_MESSAGE = "com.caspian.sareknationalpark.MESSAGE"
const val EXTRA_IMAGE_SOURCE = "com.caspian.sareknationalpark.IMAGE_SOURCE"

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun textBear(view: View) {
        var imageSource = "bear"
        var articleTextContent = getString(R.string.bear_text)
        var intent = Intent(this, TestActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, articleTextContent)
            putExtra(EXTRA_IMAGE_SOURCE, imageSource)
        }
        startActivity(intent)
    }

    fun textGeo(view: View) {
        var imageSource = "sareklandscape"
        var articleTextContent = getString(R.string.geo_text)
        var intent = Intent(this, TestActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, articleTextContent)
            putExtra(EXTRA_IMAGE_SOURCE, imageSource)
        }
        startActivity(intent)
    }

    fun textGreen(view: View) {
        var imageSource = "greenerylapland"
        var articleTextContent = getString(R.string.greenery_text)
        var intent = Intent(this, TestActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, articleTextContent)
            putExtra(EXTRA_IMAGE_SOURCE, imageSource)
        }
        startActivity(intent)
    }

    fun textNature(view: View) {
        var imageSource = "children"
        var articleTextContent = getString(R.string.nature_text)
        var intent = Intent(this, TestActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, articleTextContent)
            putExtra(EXTRA_IMAGE_SOURCE, imageSource)
        }
        startActivity(intent)
    }

    fun textSapmi(view: View) {
        var imageSource = "flag"
        var articleTextContent = getString(R.string.sapmi_text)
        var intent = Intent(this, TestActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, articleTextContent)
            putExtra(EXTRA_IMAGE_SOURCE, imageSource)
        }
        startActivity(intent)
    }
}
