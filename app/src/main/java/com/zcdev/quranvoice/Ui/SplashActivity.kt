package com.zcdev.quranvoice.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.HandlerCompat.postDelayed
import androidx.core.os.postDelayed
import com.zcdev.quranvoice.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity,DashboardActivity::class.java))
        },3000)
    }
}