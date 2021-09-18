package com.example.applists.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.applists.R
import com.example.applists.model.Nation

class ItemAdapter(private val context: Context, private val dataSet: List<Nation>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val nationText : TextView = view.findViewById(R.id.item_title)
        val nationImage: ImageView= view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.lists_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val item = dataSet[position]
        holder.nationText.text = context.resources.getString(item.stringResourceId)
        holder.nationImage.setImageResource(item.imageResourceId)
    }

    override fun getItemCount()= dataSet.size
}