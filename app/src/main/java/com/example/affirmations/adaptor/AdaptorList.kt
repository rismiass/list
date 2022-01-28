package com.example.affirmations.adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation
import java.util.ArrayList

public class AdaptorList(private val data : ArrayList<Int>, val context: Context) : RecyclerView.Adapter<AdaptorList.ItemViewHolder>() {
    class ItemViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val root = itemView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutInFlater = LayoutInflater.from(parent.context)
        val view = layoutInFlater.inflate(R.layout.item_list, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = data[position]
        val textview = holder.root.findViewById<TextView>(R.id.item)
        val text = context.resources.getString(item)
        textview.text = text
    }

    override fun getItemCount(): Int {
        return data.size
    }

}