package com.example.cricketteamrankingapp.cricket.team_ranking.data.remote.apis.cricket_api

import com.example.cricketteamrankingapp.core.util.CRICKET_API_BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Best practice to make a single instance of the retrofit object
object ApiRetrofitClient {
    //it is used to create a retrofit object
    //lazy is used to create the object only when it is needed
    val cricketApiRetrofitClient by lazy {
        Retrofit.Builder()
            //it is used to base url of the api
            .baseUrl(CRICKET_API_BASE_URL)
            //it is used to convert json data into data class objects
            //it is coming from converter-gson dependency
            .addConverterFactory(GsonConverterFactory.create())
            //it is used to build the retrofit object
            .build()
            //it is used to create the api service object
            .create(CricketApiService::class.java)
    }
}



