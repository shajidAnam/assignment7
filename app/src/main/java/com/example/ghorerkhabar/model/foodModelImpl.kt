package com.example.ghorerkhabar.model

import com.example.ghorerkhabar.network.foodApiInterface
import com.example.ghorerkhabar.network.retrofitClient
import retrofit2.Call
import retrofit2.Response

class foodModelImpl:foodModel {
    private val apiInterface= retrofitClient.getClient().create(foodApiInterface::class.java)
    private val call=apiInterface.getFoodList()
    override fun getFoodList(foodCallBack: FoodCallBack) {
        call.enqueue(object :retrofit2.Callback<MutableList<food>>{
            override fun onResponse(
                call: Call<MutableList<food>>,
                response: Response<MutableList<food>>
            ) {
                response.body()?.let { foodCallBack.onResponse(it) }
            }

            override fun onFailure(call: Call<MutableList<food>>, t: Throwable) {
                foodCallBack.onError(t)
            }
        })
    }
}