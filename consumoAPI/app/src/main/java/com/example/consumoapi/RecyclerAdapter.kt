package com.example.consumoapi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.consumoapi.model.ResultExImg

class RecyclerAdapter(
    private val list: List<ResultExImg>,
    private val context: Context
): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(context).inflate(
                R.layout.cardview,
                parent,
                false
            )

        return ViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {
            return list.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val exerciseImg = list.elementAt(position)
        Glide.with(holder.itemImage).load(exerciseImg.image).into(holder.itemImage)
    }



     inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val itemImage by lazy { itemView.findViewById<ImageView>(R.id.imageView) }
    }
}