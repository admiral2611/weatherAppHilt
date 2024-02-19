package com.admiral26.weatherdaggerhilt.core.repository

import com.admiral26.weatherappmvvm.util.ResultWrapper
import com.admiral26.weatherappmvvm.util.parseResponse
import com.admiral26.weatherdaggerhilt.core.model.current.CurentWeatherRespons
import com.admiral26.weatherdaggerhilt.core.network.WeatherService
import com.admiral26.weatherdaggerhilt.util.API_KEY
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val service: WeatherService) {

    suspend fun getCurrentWeather(q: String): ResultWrapper<CurentWeatherRespons?, Any> {
        return parseResponse(Dispatchers.IO) {
            service.getCurrentWeather(API_KEY, q = q, "no")
        }
    }
}