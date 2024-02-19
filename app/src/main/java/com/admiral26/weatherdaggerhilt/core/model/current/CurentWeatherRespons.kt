package com.admiral26.weatherdaggerhilt.core.model.current


import com.google.gson.annotations.SerializedName

data class CurentWeatherRespons(
    @SerializedName("current")
    val current: Current,
    @SerializedName("location")
    val location: Location
)