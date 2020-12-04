package com.ismin.android

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity(){
    private val TAG = MainActivity::class.simpleName
    private val stationlist = Stationlist()
    private lateinit var stationService: StationService;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://applicationstationidf-louaheminnouri.cleverapps.io")
            .build()

        stationService = retrofit.create(StationService::class.java)

        stationService.getAllStations().enqueue(object : Callback<ArrayList<Station>> {
            override fun onResponse(
                call: Call<ArrayList<Station>>,
                response: Response<ArrayList<Station>>
            ) {
                val allStations = response.body()
                allStations?.forEach {
                    stationlist.addStation(it)
                    print(it)
                }
                print(allStations)



               /////////////////// hadchi zedto lik mli tconneca b cleaver cloud mes7o
               /* val s1 =  Station("id_1", "Rbani station","zone ", 95, 1.10, 2.0, 1)
                val s2 =  Station("id_2", "Rbani2 station","zone2 ", 63, 1.10, 2.0, 6)

                stationlist.addStation(s1)
                stationlist.addStation(s2)
                /////////////////// */

                displayList()
            }

            override fun onFailure(call: Call<ArrayList<Station>>, t: Throwable) {
                displayErrorToast(t)

            }
        })

    }

    private fun displayErrorToast(t: Throwable) {
        Toast.makeText(
            applicationContext,
            "Network error ${t.localizedMessage}",
            Toast.LENGTH_LONG
        ).show()
    }

    private fun displayList() {
        val stationListFragment = StationListFragment.newInstance(stationlist.getAllStations())

        supportFragmentManager.beginTransaction()
            .replace(R.id.a_main_lyt_container, stationListFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .commit()
    }


    /* fun goToCreation(view: View) {
         val createBookFragment = CreateBookFragment()

         supportFragmentManager.beginTransaction()
             .add(R.id.a_main_lyt_container, createBookFragment)
             .addToBackStack("createBookFragment")
             .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
             .commit()

         a_main_btn_creation.visibility = View.GONE
     }

     override fun onBookCreated(station: Station) {
         stationService.createStation(station).enqueue {
             onResponse = {
                 Stationlist.addStation(it.body()!!)
                 closeCreateFragment()
             }
             onFailure = {
                 if (it != null) {
                     displayErrorToast(it)
                 }
             }
         }
     }*/

//    fun closeCreateFragment() {
//        displayList();
//
//        a_main_btn_creation.visibility = View.VISIBLE
//    }
}