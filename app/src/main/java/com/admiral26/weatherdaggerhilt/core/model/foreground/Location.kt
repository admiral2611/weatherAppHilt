package com.admiral26.weatherdaggerhilt.core.model.foreground


import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("country")
    val country: String, // United Kingdom
    @SerializedName("lat")
    val lat: Double, // 51.52
    @SerializedName("localtime")
    val localtime: String, // 2024-02-18 20:31
    @SerializedName("localtime_epoch")
    val localtimeEpoch: Int, // 1708288266
    @SerializedName("lon")
    val lon: Double, // -0.11
    @SerializedName("name")
    val name: String, // London
    @SerializedName("region")
    val region: String, // City of London, Greater London
    @SerializedName("tz_id")
    val tzId: String // Europe/London
)