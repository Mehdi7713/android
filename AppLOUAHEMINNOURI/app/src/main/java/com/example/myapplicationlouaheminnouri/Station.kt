package com.ismin.android

import java.io.Serializable

data class Station(val name: String,  val zone: String, val typeRATP: String, val id: Int, val lat: Double, val lon: Double, val favorite:Int) : Serializable