package com.zcdev.quranvoice.data.entities

class Surah {
    //declare all variables
    var id:Int?=null
     var surahName: String? = null
     var surahMediaFile = 0
    var time:String?=null
    constructor(){

    }
    constructor(id:Int,name:String,file:Int,t:String){
        this.id=id
        this.surahName=name
        this.surahMediaFile=file
        this.time=t
    }
}