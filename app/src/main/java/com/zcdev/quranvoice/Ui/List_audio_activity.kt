package com.zcdev.quranvoice.Ui

import android.content.Context
import android.content.DialogInterface
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.HorizontalScrollView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.zcdev.quranvoice.R
import com.zcdev.quranvoice.adapters.SurahAdapters
import com.zcdev.quranvoice.data.entities.Surah
import kotlinx.android.synthetic.main.activity_list_audio.*
import java.util.*
import kotlin.collections.ArrayList

class List_audio_activity : AppCompatActivity() {
    var surahList:ArrayList<Surah>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_audio)
        surahList=ArrayList<Surah>()
        getSurah()
        myRec.layoutManager= StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        myRec.adapter=SurahAdapters(surahList!!)

        loadLocal()
    }


    fun getSurah(){
        var s0=Surah(0,"سورة الفاتحة",R.raw.fatiha,"")
        var s1=Surah(0,"ما تيسر من سورة المائدة",R.raw.maida,"")
        var s2=Surah(0,"ما تيسر من سورة آل عمران",R.raw.ali3imran,"")
        var s3=Surah(0,"ما تيسر من سورة التوبة",R.raw.tawba,"")
        var s4=Surah(0,"ما تيسر من سورة هود",R.raw.hood,"")
        var s5=Surah(0,"ما تيسر من سورة هود",R.raw.hood2,"")
        var s6=Surah(0,"بداية سورة يوسف",R.raw.introyoucef,"")
        var s7=Surah(0,"ما تيسر من سورة يوسف",R.raw.youcef1,"")
        var s8=Surah(0,"ما تيسر من سورة يوسف",R.raw.youcef2,"")
        var s9=Surah(0,"ما تيسر من سورة المومنون",R.raw.moiminin,"")
        var s10=Surah(0,"ما تيسر من سورة طه",R.raw.taha,"")
        var s11=Surah(0,"ما تيسر من سورة يونس",R.raw.younes1,"")
        var s12=Surah(0,"ما تيسر من سورة النور",R.raw.noor,"")
        var s13=Surah(0,"ما تيسر من سورة النور",R.raw.noor1,"")
        var s14=Surah(0,"ما تيسر من سورة الفرقان",R.raw.for9an,"")
        var s15=Surah(0,"ما تيسر من سورة الشعراء",R.raw.shoaraaa,"")
        var s16=Surah(0,"ما تيسر من سورة البقرة",R.raw.baqarra,"")
        var s17=Surah(0,"ما تيسر من سورة النمل",R.raw.naml,"")
        var s18=Surah(0,"ما تيسر من سورة القصص",R.raw.kissas,"")
        var s19=Surah(0,"ما تيسر من سورة العنكبوت",R.raw.aankaboot,"")
        var s20=Surah(0,"ما تيسر من سورة الزمر",R.raw.zomor,"")
        var s21=Surah(0,"سورة سبأ كاملة",R.raw.sabaa,"")
        var s22=Surah(0,"ما تيسر من سورة النساء",R.raw.nissa,"")
        var s23=Surah(0,"سورة القلم كاملة",R.raw.kalam,"")
        var s24=Surah(0,"ما تيسر من سورة مريم",R.raw.mariem,"")
        var s25=Surah(0,"ما تيسر من سورة الرعد",R.raw.ra3d,"")
        var s26=Surah(0,"سورة القيامة كاملة",R.raw.kiyama,"")
        var s27=Surah(0,"ما تيسر من سورة آل عمران",R.raw.ali3imran,"")
        var s28=Surah(0,"سورة النبأ كاملة",R.raw.nabaa,"")
        var s29=Surah(0,"سورة النازعات كاملة",R.raw.nazi3at,"")
        var s30=Surah(0,"سورة الأعلى كاملة",R.raw.a3la,"")


        //add surah's
        surahList!!.add(s0)
        surahList!!.add(s1)
        surahList!!.add(s2)
        surahList!!.add(s3)
        surahList!!.add(s4)
        surahList!!.add(s5)
        surahList!!.add(s6)
        surahList!!.add(s7)
        surahList!!.add(s8)
        surahList!!.add(s9)
        surahList!!.add(s10)
        surahList!!.add(s11)
        surahList!!.add(s12)
        surahList!!.add(s13)
        surahList!!.add(s14)
        surahList!!.add(s15)
        surahList!!.add(s16)
        surahList!!.add(s17)
        surahList!!.add(s18)
        surahList!!.add(s19)
        surahList!!.add(s20)
        surahList!!.add(s21)
        surahList!!.add(s22)
        surahList!!.add(s23)
        surahList!!.add(s24)
        surahList!!.add(s25)
        surahList!!.add(s26)
        surahList!!.add(s27)
        surahList!!.add(s28)
        surahList!!.add(s29)
        surahList!!.add(s30)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_add ->showChangeLanguageDialog()
        }
        return super.onOptionsItemSelected(item)
    }


    private fun setLocal(lang:String){
        val local= Locale(lang)
        Locale.setDefault(local)
        val conf= Configuration()
        conf.locale=local
        resources.updateConfiguration(conf,resources.displayMetrics)
        //save data shared preferences
        val preferences = getSharedPreferences("Settings", Context.MODE_PRIVATE).edit()
        preferences.putString("My_Lang",lang)
        preferences.apply()

    }
// load language

    private fun loadLocal(){
        val preferences = getSharedPreferences("Settings", Context.MODE_PRIVATE)
        val lang=preferences.getString("My_Lang","")
        setLocal(lang!!)
    }

    private fun showChangeLanguageDialog(){
        // Set up the checklist
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.select_dialog_singlechoice)
        arrayAdapter.add("العربية")
        arrayAdapter.add("English")




        AlertDialog.Builder(this)
            .setTitle("Choose the language")
            .setSingleChoiceItems(arrayAdapter,-1,object : DialogInterface.OnClickListener{
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    if (p1==0){
                        // Arabic
                        setLocal("ar")
                        this@List_audio_activity.recreate()
                    }
                    else if (p1==1){
                        // English
                        setLocal("en")
                        this@List_audio_activity.recreate()
                    }
                    //dimisss alert dialog when language selected
                    p0!!.dismiss()
                }
            }).show()
    }
}