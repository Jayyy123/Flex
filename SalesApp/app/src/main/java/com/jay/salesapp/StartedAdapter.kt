package com.jay.salesapp

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StartedAdapter: RecyclerView.Adapter<StartedAdapter.SGViewHolder>() {
    var list = arrayListOf<lists>()
    inner class SGViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var description = itemView.findViewById<TextView>(R.id.des)
        var img = itemView.findViewById<ImageView>(R.id.info)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SGViewHolder {
        val a = LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        return SGViewHolder(a)
    }

    override fun onBindViewHolder(holder: SGViewHolder, position: Int) {
        val location = list[position]
        holder.description.text = location.description
        holder.img.setImageResource(location.images)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}