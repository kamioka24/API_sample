package com.example.api_sample

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class WeatherData (val weather: Weather, val main: Main) {
    @JsonClass(generateAdapter = true)
    data class Weather(
        val id: Int,
        val main: String,
        val description: String,
    )
    @JsonClass(generateAdapter = true)
    data class Main(
        @Json(name = "feels_like")
        val feelsLike: Double
    )
}