package com.example.ghorerkhabar.feature

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ghorerkhabar.R
import kotlinx.android.synthetic.main.item_food.view.*

class FoodViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {
    val iv_foodImage:AppCompatImageView=itemview.findViewById(R.id.iv_food)
    val tv_foodName:AppCompatTextView=itemview.findViewById(R.id.tv_food_name)
    val tv_foodPrice:AppCompatTextView=itemview.findViewById(R.id.tv_price_value)
}