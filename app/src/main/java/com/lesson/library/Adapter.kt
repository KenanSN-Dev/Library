package com.lesson.library

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lesson.library.databinding.CardDesignBinding

class Adapter(val list:List<Book>,val clickListener: BookClickListener): RecyclerView.Adapter<CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardDesignBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)

    }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bind(list[position])//position=0 1 2
    }
}