package com.ismin.android

import java.io.Serializable

class Stationlist : Serializable {
    private val storage = HashMap<String, Station>()

    fun addStation(station: Station) {
        this.storage[station.name] = station
    }

    fun getStation(name: String): Station? {
        return this.storage[name]
    }

    fun getAllStations(): List<Station> {
        return ArrayList(this.storage.values).sortedBy { station -> station.name }
    }

    fun getStationOf(zone: String): List<Station> {
        val filteredStorage = this.storage.filter { it.value.zone == zone }
        return ArrayList(filteredStorage.values).sortedBy { station -> station.zone }
    }

    fun getTotalNumberOfStations(): Int {
        return this.storage.size
    }
}
