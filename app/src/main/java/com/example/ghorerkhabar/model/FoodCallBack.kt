package com.example.ghorerkhabar.model

interface FoodCallBack {
    fun onResponse(foodlist:MutableList<food>)
    fun onError(errorMessage:Throwable)
}