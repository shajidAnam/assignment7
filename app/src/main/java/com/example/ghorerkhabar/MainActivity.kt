package com.example.ghorerkhabar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.ghorerkhabar.core.BaseActivity
import com.example.ghorerkhabar.model.FoodCallBack
import com.example.ghorerkhabar.model.food
import com.example.ghorerkhabar.model.foodModel
import com.example.ghorerkhabar.model.foodModelImpl
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

    }
}