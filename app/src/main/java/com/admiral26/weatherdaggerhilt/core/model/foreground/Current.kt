package com.admiral26.weatherdaggerhilt.core.model.foreground


import com.google.gson.annotations.SerializedName

data class Current(
    @SerializedName("cloud")
    val cloud: Int, // 100
    @SerializedName("condition")
    val condition: Condition,
    @SerializedName("feelslike_c")
    val feelslikeC: Double, // 8.2
    @SerializedName("feelslike_f")
    val feelslikeF: Double, // 46.8
    @SerializedName("gust_kph")
    val gustKph: Double, // 20.9
    @SerializedName("gust_mph")
    val gustMph: Double, // 13.0
    @SerializedName("humidity")
    val humidity: Int, // 87
    @SerializedName("is_day")
    val isDay: Int, // 0
    @SerializedName("last_updated")
    val lastUpdated: String, // 2024-02-18 20:30
    @SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: Int, // 1708288200
    @SerializedName("precip_in")
    val precipIn: Double, // 0.0
    @SerializedName("precip_mm")
    val precipMm: Double, // 0.0
    @SerializedName("pressure_in")
    val pressureIn: Double, // 30.36
    @SerializedName("pressure_mb")
    val pressureMb: Double, // 1028.0
    @SerializedName("temp_c")
    val tempC: Double, // 10.0
    @SerializedName("temp_f")
    val tempF: Double, // 50.0
    @SerializedName("uv")
    val uv: Double, // 1.0
    @SerializedName("vis_km")
    val visKm: Double, // 10.0
    @SerializedName("vis_miles")
    val visMiles: Double, // 6.0
    @SerializedName("wind_degree")
    val windDegree: Int, // 300
    @SerializedName("wind_dir")
    val windDir: String, // WNW
    @SerializedName("wind_kph")
    val windKph: Double, // 6.8
    @SerializedName("wind_mph")
    val windMph: Double // 4.3
)