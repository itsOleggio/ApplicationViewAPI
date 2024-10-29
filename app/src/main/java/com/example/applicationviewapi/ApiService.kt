package com.example.applicationviewapi

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("comments")
    fun getComments(): Call<List<Comment>>
}
