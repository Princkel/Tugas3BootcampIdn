package com.bootcamp.tugas3_bootcampidn

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {
    const val baseUrl = "https://newsapi.org/v2/"

    private fun retrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun service(): ApiService{
        return retrofit().create(ApiService::class.java)
    }
}