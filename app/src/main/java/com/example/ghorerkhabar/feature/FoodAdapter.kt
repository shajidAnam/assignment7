package com.example.ghorerkhabar.feature

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ghorerkhabar.ClickListener.onItemClickListener
import com.example.ghorerkhabar.R
import com.example.ghorerkhabar.model.food

class FoodAdapter(val foodlist:MutableList<food>,val itemClickListener:onItemClickListener):RecyclerView.Adapter<FoodViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_food,parent,false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food=foodlist[position]
        holder.tv_foodName.text=food.name
        holder.tv_foodPrice.text=food.price
        Glide.with(holder.iv_foodImage)
            .load(food.imageUrl)
            .into(holder.iv_foodImage)

        holder.itemView.setOnClickListener {
            itemClickListener.onItemClickListener(position)
        }
    }

    override fun getItemCount(): Int {
        return foodlist.size
    }
}