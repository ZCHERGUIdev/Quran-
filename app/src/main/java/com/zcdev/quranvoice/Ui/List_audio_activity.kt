package com.zcdev.quranvoice.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.zcdev.quranvoice.R
import com.zcdev.quranvoice.data.entities.Surah

class List_audio_activity : AppCompatActivity() {
    var surahList:ArrayList<Surah>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_audio)
        surahList=ArrayList<Surah>()
        getSurah()
        for (i in 0..surahList!!.size){
            Log.d("hello", "names ${i}:"+ surahList!![i].surahName.toString())
        }
    }


    fun getSurah(){
        var s0=Surah(0,"Fatiha",0)
        var s1=Surah(1,"Kahf",0)
        var s2=Surah(2,"Baqara",0)
        var s3=Surah(3,"AliEmran",0)
        var s4=Surah(4,"Tawwba",0)
        //add surah's
        surahList!!.add(s0)
        surahList!!.add(s1)
        surahList!!.add(s2)
        surahList!!.add(s3)
        surahList!!.add(s4)
    }
}