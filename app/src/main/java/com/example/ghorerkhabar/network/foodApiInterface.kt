package com.example.ghorerkhabar.network

import com.example.ghorerkhabar.model.food
import retrofit2.Call
import retrofit2.http.GET

interface foodApiInterface {
    @GET("shajidAnam/assignment7/master/data.json")
    fun getFoodList(): Call<MutableList<food>>
}