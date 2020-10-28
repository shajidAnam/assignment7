package com.example.ghorerkhabar.feature

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ghorerkhabar.ClickListener.onItemClickListener
import com.example.ghorerkhabar.R
import com.example.ghorerkhabar.core.BaseActivity
import com.example.ghorerkhabar.model.FoodCallBack
import com.example.ghorerkhabar.model.food
import com.example.ghorerkhabar.model.foodModel
import com.example.ghorerkhabar.model.foodModelImpl
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : BaseActivity() {
    lateinit var foodModel: foodModel
    override fun setToolbar(): Toolbar {
        toolbar.setTitle("Ghorer Khabar")
        return toolbar
    }

    override fun setLayoutId(): Int {
        return R.layout.activity_main
    }

    override val isHomeButtonEnabled: Boolean
        get() = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showFoodList()
    }

    private fun showFoodList() {
        foodModel=foodModelImpl()
        foodModel.getFoodList(object:FoodCallBack{
            override fun onResponse(foodlist: MutableList<food>) {
                initFooodAdapter(foodlist)

            }

            override fun onError(errorMessage: Throwable) {
                showShortToast(errorMessage.localizedMessage)
            }

        })

    }

    private fun initFooodAdapter(foodlist: MutableList<food>) {
        val adapter=FoodAdapter(foodlist,object :onItemClickListener{
            override fun onItemClickListener(position: Int) {
                showShortToast("success")
            }

        })
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter=adapter

    }
}