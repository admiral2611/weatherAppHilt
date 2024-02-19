package com.admiral26.weatherdaggerhilt.core.model.foreground


import com.google.gson.annotations.SerializedName

data class ConditionX(
    @SerializedName("code")
    val code: Int, // 1189
    @SerializedName("icon")
    val icon: String, // //cdn.weatherapi.com/weather/64x64/day/302.png
    @SerializedName("text")
    val text: String // Moderate rain
)