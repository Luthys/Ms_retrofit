package com.example.ms_my_app.Interface

import com.example.ms_my_app.Model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<Movie>>
}