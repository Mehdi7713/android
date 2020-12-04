package com.ismin.android

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var txvName = itemView.findViewById<TextView>(R.id.r_book_txv_Name)
    var txvZone: TextView = itemView.findViewById(R.id.r_book_txv_Zone)
    var txvTypeRATP: TextView = itemView.findViewById(R.id.r_book_txv_TypeRATP)

    fun initialize(item: Station, action:OnStationItemClickListner){
        txvName.text = item.name
        txvZone.text = item.zone
        txvTypeRATP.text = item.typeRATP

        itemView.setOnClickListener{
            action.onItemClick(item,adapterPosition)
        }

    }
}