package com.example.s215718lykkehjul

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter (val data:List<Guess>): RecyclerView.Adapter<Adapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType : Int): Adapter.ViewHolder{
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(adapterLayout)
    }
    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int){
        holder.tvItem.text = data[position].char.toString()
    }

    override fun getItemCount(): Int {
        return data.size
    }
    inner class ViewHolder
    internal constructor(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvItem: TextView = itemView.findViewById(R.id.tvItem)
    }
}