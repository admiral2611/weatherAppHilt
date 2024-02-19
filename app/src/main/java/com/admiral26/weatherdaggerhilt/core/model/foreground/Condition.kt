package com.admiral26.weatherdaggerhilt.core.model.foreground


import com.google.gson.annotations.SerializedName

data class Condition(
    @SerializedName("code")
    val code: Int, // 1009
    @SerializedName("icon")
    val icon: String, // //cdn.weatherapi.com/weather/64x64/night/122.png
    @SerializedName("text")
    val text: String // Overcast
)