package com.example.saifapp4

data class  data(val success:Boolean, val data: List<data_movie>)
data class data_movie (val id: Int, val title:String, val image:String)