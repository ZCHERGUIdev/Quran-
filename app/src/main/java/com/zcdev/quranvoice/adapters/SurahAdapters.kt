package com.zcdev.quranvoice.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zcdev.quranvoice.R
import com.zcdev.quranvoice.Ui.PlayActivity
import com.zcdev.quranvoice.data.entities.Surah
import java.util.*
import kotlin.collections.ArrayList

class SurahAdapters (var listAudios:ArrayList<Surah>): RecyclerView.Adapter<SurahAdapters.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, viewType: Int): SurahAdapters.ViewHolder {
        val view = LayoutInflater.from(p0?.context).inflate(R.layout.viewcelll, p0, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: SurahAdapters.ViewHolder, position: Int) {

        holder.name.text=listAudios[position].surahName
        holder.time.text= "4m:30s"

        holder.itemView.setOnClickListener {
                var i =Intent(holder.itemView.context,PlayActivity::class.java)
                i.putExtra("surahName",listAudios[position].surahName)
                i.putExtra("mediaID",listAudios[position].surahMediaFile)
                holder.itemView.context.startActivity(i)
        }

    }

    override fun getItemCount(): Int {
        return listAudios.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var s:Surah?=null
        var name=itemView.findViewById<TextView>(R.id.txtName)
        var time=itemView.findViewById<TextView>(R.id.txtTime)

    }
}