package com.admiral26.weatherdaggerhilt.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.admiral26.weatherappmvvm.util.ResultWrapper
import com.admiral26.weatherdaggerhilt.core.model.current.CurentWeatherRespons
import com.admiral26.weatherdaggerhilt.core.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(val repository: WeatherRepository) : ViewModel() {
    val weatherCurrentLiveData: MutableLiveData<CurentWeatherRespons?> = MutableLiveData()
    val errorLiveData: MutableLiveData<String?> = MutableLiveData()

    fun getCurrentWeather(city: String) {
        viewModelScope.launch {
            val result = repository.getCurrentWeather(city)
            when (result) {
                is ResultWrapper.Success -> {
                    weatherCurrentLiveData.value = result.response
                }

                is ResultWrapper.ErrorResponse -> {
                    errorLiveData.value = "Error"
                }

                is ResultWrapper.NetworkError -> {
                    errorLiveData.value = "NETWORK_ERROR"
                }

                else -> {
                    errorLiveData.value = "Error"
                }
            }
        }
    }
}