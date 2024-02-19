package com.admiral26.weatherdaggerhilt.core.model.foreground


import com.google.gson.annotations.SerializedName

data class Day(
    @SerializedName("avghumidity")
    val avghumidity: Int, // 88
    @SerializedName("avgtemp_c")
    val avgtempC: Double, // 11.3
    @SerializedName("avgtemp_f")
    val avgtempF: Double, // 52.3
    @SerializedName("avgvis_km")
    val avgvisKm: Double, // 8.0
    @SerializedName("avgvis_miles")
    val avgvisMiles: Double, // 4.0
    @SerializedName("condition")
    val condition: ConditionX,
    @SerializedName("daily_chance_of_rain")
    val dailyChanceOfRain: Int, // 99
    @SerializedName("daily_chance_of_snow")
    val dailyChanceOfSnow: Int, // 0
    @SerializedName("daily_will_it_rain")
    val dailyWillItRain: Int, // 1
    @SerializedName("daily_will_it_snow")
    val dailyWillItSnow: Int, // 0
    @SerializedName("maxtemp_c")
    val maxtempC: Double, // 13.8
    @SerializedName("maxtemp_f")
    val maxtempF: Double, // 56.9
    @SerializedName("maxwind_kph")
    val maxwindKph: Double, // 22.3
    @SerializedName("maxwind_mph")
    val maxwindMph: Double, // 13.9
    @SerializedName("mintemp_c")
    val mintempC: Double, // 9.1
    @SerializedName("mintemp_f")
    val mintempF: Double, // 48.4
    @SerializedName("totalprecip_in")
    val totalprecipIn: Double, // 0.58
    @SerializedName("totalprecip_mm")
    val totalprecipMm: Double, // 14.7
    @SerializedName("totalsnow_cm")
    val totalsnowCm: Double, // 0.0
    @SerializedName("uv")
    val uv: Double // 1.0
)