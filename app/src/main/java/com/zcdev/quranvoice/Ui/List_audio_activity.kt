package com.zcdev.quranvoice.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import com.zcdev.quranvoice.R
import com.zcdev.quranvoice.adapters.SurahAdapters
import com.zcdev.quranvoice.data.entities.Surah
import kotlinx.android.synthetic.main.activity_list_audio.*

class List_audio_activity : AppCompatActivity() {
    var surahList:ArrayList<Surah>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_audio)
        surahList=ArrayList<Surah>()
        getSurah()

       myRec.layoutManager=LinearLayoutManager(this)
        myRec.adapter=SurahAdapters(surahList!!)



    }


    fun getSurah(){
        var s0=Surah(0,"Fatiha",R.raw.al_adiyat)
        var s1=Surah(1,"Kahf",R.raw.al_alaq)
        var s2=Surah(2,"Baqara",R.raw.al_facl)
        var s3=Surah(3,"AliEmran",R.raw.al_kauthar)
        var s4=Surah(4,"Tawwba",R.raw.al_humaza)
        //add surah's
        surahList!!.add(s0)
        surahList!!.add(s1)
        surahList!!.add(s2)
        surahList!!.add(s3)
        surahList!!.add(s4)
    }
}