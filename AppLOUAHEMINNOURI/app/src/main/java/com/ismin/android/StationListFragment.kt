package com.ismin.android

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val ARG_BOOKS = "ARG_BOOKS"

class StationListFragment : Fragment() , OnStationItemClickListner {
    private lateinit var stations: ArrayList<Station>
    private lateinit var rcvstations: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            stations = it.getSerializable(ARG_BOOKS) as ArrayList<Station>
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_station_list, container, false)

        this.rcvstations = rootView.findViewById(R.id.f_station_list_rcv_stations)
        this.rcvstations.adapter = StationAdapter(stations, this)
        val linearLayoutManager = LinearLayoutManager(context)
        this.rcvstations.layoutManager = linearLayoutManager

        val dividerItemDecoration = DividerItemDecoration(context, linearLayoutManager.orientation)
        this.rcvstations.addItemDecoration(dividerItemDecoration)

        return rootView;
    }

    companion object {
        @JvmStatic
        fun newInstance(stations: List<Station>) =
            StationListFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_BOOKS, ArrayList(stations))
                }
            }
    }

    override fun onItemClick(item: Station, position: Int) {
        Toast.makeText(this.context, item.name, Toast.LENGTH_SHORT).show()

        val intent = Intent(this.context, StationActivity::class.java)
        intent.putExtra("NAME", item.name)
        intent.putExtra("DESCRIPTION", "Zone: " + item.zone + "\nType RATP: " + item.typeRATP + "\nLongitude: " + item.lon + "\nLatitude: " + item.lat)
        startActivity(intent)

    }
}