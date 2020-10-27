package com.example.ghorerkhabar.feature

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ghorerkhabar.R
import kotlinx.android.synthetic.main.item_food.view.*

class FoodViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    val iv_foodImage:AppCompatImageView=itemView.findViewById(R.id.iv_food)
    val tv_foodName:AppCompatTextView=itemView.findViewById(R.id.tv_food_name)
    val tv_foodPrice:AppCompatTextView=itemView.findViewById(R.id.tv_price_value)
}