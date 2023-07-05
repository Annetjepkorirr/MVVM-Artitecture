package com.example.myshop.models

import android.media.Rating

data class Products(
    var id:Int,
    var title: String,
    var description: String,
    var price:Double,
    var rating: Double,
    var stock:Int,
    var brand:String,
    var category: String,
    var thumbnails: String
)
