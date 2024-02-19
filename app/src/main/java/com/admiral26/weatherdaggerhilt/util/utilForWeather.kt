package com.admiral26.weatherdaggerhilt.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import java.util.TimeZone


const val API_KEY = "abc250afba9c435489b60858241702"
const val BASE_URL = "https://api.weatherapi.com/"


//for Glide
fun ImageView.iconWeather(url: String) {
    Glide.with(this.context)
        .load("https:${url}")
        .into(this)
}

//for Time Format AM/PM
fun Int.unixTimestampToTimeString(): String {

    try {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = this * 1000.toLong()

        val outputDateFormat = SimpleDateFormat("hh:mm a", Locale.ROOT)
        outputDateFormat.timeZone = TimeZone.getDefault()
        return outputDateFormat.format(calendar.time)

    } catch (e: Exception) {
        e.printStackTrace()
    }

    return this.toString()
}