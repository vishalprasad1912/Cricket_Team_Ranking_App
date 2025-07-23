package com.example.cricketteamrankingapp.cricket.team_ranking.data.remote.apis.cricket_api

import com.example.cricketteamrankingapp.core.util.CRICKET_API_KEY
import com.example.cricketteamrankingapp.cricket.team_ranking.data.dto.team_rankings_dtos.TeamRankingsDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CricketApiService {
    //it is used to get the team ranking by type and gender
    @GET("team-rankings")
    fun getTeamRankingByTypeAndGender(
        @Query("api_token") cricketApiToken : String = CRICKET_API_KEY,
        @Query("filter[type]") type : String,
        @Query("filter[gender]") gender : String,
    ) : Call<TeamRankingsDTO>
    //return type for the api call is TeamRankingsDTO
}