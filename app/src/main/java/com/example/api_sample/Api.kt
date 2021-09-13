package com.example.api_sample

import retrofit2.Response
import retrofit2.http.GET

interface Api {
    companion object {
        const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
        const val WEATHERINFO_URL = "weather?lang=ja&q=wako&appid=81bee461624dcdbd3d18f881a1f2764d"
    }
    @GET("weather?lang=ja&q=wako&appid=81bee461624dcdbd3d18f881a1f2764d")
    // 必ず suspend をつける
    suspend fun getApi(): Response<WeatherData>
}