package com.example.affirmations.adaptor

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation
import java.util.ArrayList

public class AdaptorList(private val data : ArrayList<Affirmation>, val context: Context) : RecyclerView.Adapter<AdaptorList.ItemViewHolder>() {
    class ItemViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val root = itemView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutInFlater = LayoutInflater.from(parent.context)
        val view = layoutInFlater.inflate(R.layout.card, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = data[position]
        val textview = holder.root.findViewById<TextView>(R.id.item)
        val imageview = holder.root.findViewById<ImageView>(R.id.image_item)
        imageview.setImageResource(item.imgId)
        val text = context.resources.getString(item.resId)
        textview.text = text
    }

    override fun getItemCount(): Int {
        return data.size
    }

}