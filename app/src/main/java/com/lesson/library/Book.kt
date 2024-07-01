package com.lesson.library

var bookList = mutableListOf<Book>()

class Book
//cover here represents the image we are going to use, they are represented by an integer number
    (var cover:Int,
    var author:String,
    var title:String,
    var description:String,
    val id:Int? = bookList.size)