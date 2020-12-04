package com.ismin.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_station.*

class StationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_station)

        station_name.text = getIntent().getStringExtra("NAME")
        station_description.text = getIntent().getStringExtra("DESCRIPTION")
    }
}