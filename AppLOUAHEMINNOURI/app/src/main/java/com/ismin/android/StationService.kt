package com.ismin.android

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface StationService {

    @GET("station")
    fun getAllStations(): Call<ArrayList<Station>>

   /* @POST("station")
    fun createStation(@Body() station: Station): Call<Station>*/
}