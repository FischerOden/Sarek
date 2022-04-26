package com.caspian.sareknationalpark

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

const val EXTRA_MESSAGE = "com.caspian.sareknationalpark.MESSAGE"

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun textTest(view: View) {
        val articleTextContent = getString(R.string.bear_text)
        val intent = Intent(this, TestActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, articleTextContent)
        }
        startActivity(intent)
    }
}