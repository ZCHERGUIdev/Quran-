package com.zcdev.quranvoice.Ui

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.zcdev.quranvoice.R
import kotlinx.android.synthetic.main.activity_splash.*
import java.util.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar!!.hide()

        logo.animation= AnimationUtils.loadAnimation(this,R.anim.anim)
        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity,List_audio_activity::class.java))
            finish()
        },3000)


    }




}