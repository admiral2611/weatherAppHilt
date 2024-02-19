package com.admiral26.weatherdaggerhilt.core.model.foreground


import com.google.gson.annotations.SerializedName

data class Hour(
    @SerializedName("chance_of_rain")
    val chanceOfRain: Int, // 100
    @SerializedName("chance_of_snow")
    val chanceOfSnow: Int, // 0
    @SerializedName("cloud")
    val cloud: Int, // 100
    @SerializedName("condition")
    val condition: ConditionXX,
    @SerializedName("dewpoint_c")
    val dewpointC: Double, // 9.6
    @SerializedName("dewpoint_f")
    val dewpointF: Double, // 49.2
    @SerializedName("diff_rad")
    val diffRad: Double, // 0.0
    @SerializedName("feelslike_c")
    val feelslikeC: Double, // 8.3
    @SerializedName("feelslike_f")
    val feelslikeF: Double, // 46.9
    @SerializedName("gust_kph")
    val gustKph: Double, // 32.7
    @SerializedName("gust_mph")
    val gustMph: Double, // 20.3
    @SerializedName("heatindex_c")
    val heatindexC: Double, // 10.8
    @SerializedName("heatindex_f")
    val heatindexF: Double, // 51.5
    @SerializedName("humidity")
    val humidity: Int, // 92
    @SerializedName("is_day")
    val isDay: Int, // 0
    @SerializedName("precip_in")
    val precipIn: Double, // 0.01
    @SerializedName("precip_mm")
    val precipMm: Double, // 0.25
    @SerializedName("pressure_in")
    val pressureIn: Double, // 30.3
    @SerializedName("pressure_mb")
    val pressureMb: Double, // 1026.0
    @SerializedName("short_rad")
    val shortRad: Double, // 0.0
    @SerializedName("snow_cm")
    val snowCm: Double, // 0.0
    @SerializedName("temp_c")
    val tempC: Double, // 10.8
    @SerializedName("temp_f")
    val tempF: Double, // 51.5
    @SerializedName("time")
    val time: String, // 2024-02-18 00:00
    @SerializedName("time_epoch")
    val timeEpoch: Int, // 1708214400
    @SerializedName("uv")
    val uv: Double, // 1.0
    @SerializedName("vis_km")
    val visKm: Double, // 2.0
    @SerializedName("vis_miles")
    val visMiles: Double, // 1.0
    @SerializedName("will_it_rain")
    val willItRain: Int, // 1
    @SerializedName("will_it_snow")
    val willItSnow: Int, // 0
    @SerializedName("wind_degree")
    val windDegree: Int, // 204
    @SerializedName("wind_dir")
    val windDir: String, // SSW
    @SerializedName("wind_kph")
    val windKph: Double, // 22.0
    @SerializedName("wind_mph")
    val windMph: Double, // 13.6
    @SerializedName("windchill_c")
    val windchillC: Double, // 8.3
    @SerializedName("windchill_f")
    val windchillF: Double // 46.9
)