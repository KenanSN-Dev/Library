package com.lesson.library

import androidx.recyclerview.widget.RecyclerView
import com.lesson.library.databinding.CardDesignBinding

class CardViewHolder(val cardDesignBinding: CardDesignBinding,val clickListener: BookClickListener): RecyclerView.ViewHolder(cardDesignBinding.root) {

    fun bind (book : Book)//book1
    {
        cardDesignBinding.ivCover.setImageResource(book.cover)
        cardDesignBinding.tvAuthor.setText(book.author)
        cardDesignBinding.tvTitle.setText(book.title)

        cardDesignBinding.cardView.setOnClickListener{
            clickListener.onClick(book)
        }
    }
}