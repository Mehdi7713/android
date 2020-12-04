package com.ismin.android

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StationAdapter(private val stations: ArrayList<Station>, var clickListner: OnStationItemClickListner) : RecyclerView.Adapter<StationViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StationViewHolder {
        val row = LayoutInflater.from(parent.context).inflate(R.layout.row_book, parent, false)
        return StationViewHolder(row)
    }

    override fun onBindViewHolder(holder: StationViewHolder, position: Int) {
        val (name, zone, typeRATP) = this.stations[position]

       // holder.txvName.text = name
      //  holder.txvZone.text = zone
       // holder.txvTypeRATP.text = typeRATP
        holder.initialize(this.stations.get(position), clickListner)

    }

    override fun getItemCount(): Int {
        return this.stations.size
    }

    fun updateItem(stationsToDisplay: List<Station>) {
        stations.clear();
        stations.addAll(stationsToDisplay)
        notifyDataSetChanged();
    }
}

interface OnStationItemClickListner{
    fun onItemClick(item: Station, position: Int)
}
