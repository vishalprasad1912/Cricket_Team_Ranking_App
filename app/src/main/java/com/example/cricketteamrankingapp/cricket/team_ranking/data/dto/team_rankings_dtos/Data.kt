package com.example.cricketteamrankingapp.cricket.team_ranking.data.dto.team_rankings_dtos

data class Data(
    val gender: String,
    val points: Any,
    val position: Any,
    val rating: Any,
    val resource: String,
    val team: List<Team>,
    val type: String,
    val updated_at: String
)