package com.lesson.library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lesson.library.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bookID = intent.getIntExtra(Constant.BOOK_ID_EXTRA, -1)//0
        val book = bookFromId(bookID)
        if (book != null) {
            binding.ivCover.setImageResource(book.cover)
            binding.tvTitle.text = book.title
            binding.tvDescription.text = book.description
            binding.tvAuthor.text = book.author
        }
    }

    private fun bookFromId(bookID: Int): Book? {
        for (book in bookList) {
            if (book.id == bookID)
                return book
        }
        return null
    }
}