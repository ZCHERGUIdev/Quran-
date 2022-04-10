package com.zcdev.quranvoice.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zcdev.quranvoice.R
import android.media.MediaPlayer
import android.view.View
import android.content.Intent





class PlayActivity : AppCompatActivity() {
    var surahMedia: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        var name=intent.getStringExtra("surahName")
        var mediaId=intent.getIntExtra("mediaID",1)





        supportActionBar!!.hide()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        surahMedia!!.stop()
        val gotoListActivity = Intent(baseContext, List_audio_activity::class.java)
        startActivity(gotoListActivity)
    }


    fun plays(view: View?) {
            val mediaId = intent.getIntExtra("mediaID", 1)
            surahMedia = MediaPlayer.create(baseContext, mediaId)
            surahMedia!!.start()
    }

    fun stops(view: View?) {
        surahMedia!!.pause()
    }


}