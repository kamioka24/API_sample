package com.example.api_sample

import retrofit2.Response
import retrofit2.http.GET

interface Api {
    companion object {
        const val BASE_URL = "https://api.openweathermap.org/data/2.5/weather?lang=ja&q=wako&appid="
        const val WEATHERINFO_URL = "81bee461624dcdbd3d18f881a1f2764d"
    }
    @GET("81bee461624dcdbd3d18f881a1f2764d")
    // 必ず suspend をつける
    suspend fun getApi(): Response<WeatherData>
}