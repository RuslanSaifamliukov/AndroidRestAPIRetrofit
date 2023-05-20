package com.example.saifapp4

import retrofit2.http.GET
import retrofit2.Call
import com.example.saifapp4.data
import com.example.saifapp4.data_movie

interface RetrofitServieces {
    @GET("feelings")
    fun getImage():Call<data>
}