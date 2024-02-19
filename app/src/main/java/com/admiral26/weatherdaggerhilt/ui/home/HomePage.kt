package com.admiral26.weatherdaggerhilt.ui.home


import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.weatherdaggerhilt.R
import com.admiral26.weatherdaggerhilt.core.base.BaseFragment
import com.admiral26.weatherdaggerhilt.databinding.PageHomeBinding
import com.admiral26.weatherdaggerhilt.util.iconWeather
import com.admiral26.weatherdaggerhilt.util.unixTimestampToTimeString
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomePage : BaseFragment(R.layout.page_home) {

    private val binding by viewBinding(PageHomeBinding::bind)
    private val homeVM: HomeViewModel by viewModels()
    override fun onCreated(view: View, savedInstanceState: Bundle?) {


        homeVM.getCurrentWeather("Tashkent")
        setUpUi()
    }

    @SuppressLint("SetTextI18n")
    private fun setUpUi() {
        homeVM.weatherCurrentLiveData.observe(viewLifecycleOwner) {
            it.let { data ->
                binding.tvCityName.text = data!!.location.region
                binding.lastUpdateTime.text =
                    data.current.lastUpdatedEpoch.unixTimestampToTimeString()
                Log.d("lastUp", "setUpUi: ${data.current.lastUpdated}")
                Log.d("lastUp", "setUpUi: ${data.current.lastUpdatedEpoch}")
                binding.tvTemp.text = data.current.tempC.toString()
                binding.tvWeatherCondition.text = data.current.condition.text
                binding.imageTemp.iconWeather(data.current.condition.icon)
                binding.realFeel.text =
                    "${data.current.feelslikeC}°C"
                binding.cloudiness.text = "${data.current.cloud}%"
                binding.windspeed.text = "${data.current.windKph}km/h"
                binding.humidity.text = "${data.current.humidity}%"
                binding.pressure.text = "${data.current.pressureIn}hPa"
                binding.visiblity.text = "${data.current.visKm}KM"
            }
        }
    }
}