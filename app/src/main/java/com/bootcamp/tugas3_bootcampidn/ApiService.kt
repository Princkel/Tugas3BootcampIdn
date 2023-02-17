package com.bootcamp.tugas3_bootcampidn

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("top-headlines?country=id&apiKey=203cb422ec5c4ae48daef93edd817ad0")
    fun getNews(): Call<ResponseNews>
}