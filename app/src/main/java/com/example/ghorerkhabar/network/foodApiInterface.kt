package com.example.ghorerkhabar.network

import com.example.ghorerkhabar.model.food
import retrofit2.Call
import retrofit2.http.GET

interface foodApiInterface {
    @GET("shajidAnam/Assignment5-6/main/data/instituteDetails.json")
    fun getFoodList(): Call<MutableList<food>>
}