package com.admiral26.weatherdaggerhilt.core.model.foreground


import com.google.gson.annotations.SerializedName

data class Astro(
    @SerializedName("is_moon_up")
    val isMoonUp: Int, // 1
    @SerializedName("is_sun_up")
    val isSunUp: Int, // 0
    @SerializedName("moon_illumination")
    val moonIllumination: Int, // 64
    @SerializedName("moon_phase")
    val moonPhase: String, // Waxing Gibbous
    @SerializedName("moonrise")
    val moonrise: String, // 10:44 AM
    @SerializedName("moonset")
    val moonset: String, // 03:55 AM
    @SerializedName("sunrise")
    val sunrise: String, // 07:10 AM
    @SerializedName("sunset")
    val sunset: String // 05:20 PM
)