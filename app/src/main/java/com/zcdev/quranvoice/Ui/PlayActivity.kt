package com.zcdev.quranvoice.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zcdev.quranvoice.R

class PlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        supportActionBar!!.hide()
    }
}