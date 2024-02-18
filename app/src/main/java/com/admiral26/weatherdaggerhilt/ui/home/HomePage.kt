package com.admiral26.weatherdaggerhilt.ui.home


import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.weatherdaggerhilt.R
import com.admiral26.weatherdaggerhilt.core.base.BaseFragment
import com.admiral26.weatherdaggerhilt.databinding.PageHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomePage : BaseFragment(R.layout.page_home) {

    private val binding by viewBinding(PageHomeBinding::bind)
    private val homeVM: HomeViewModel by viewModels()
    override fun onCreated(view: View, savedInstanceState: Bundle?) {


        homeVM.getCurrentWeather("Tashkent")
        setUpUi()
    }

    private fun setUpUi() {
        homeVM.weatherCurrentLiveData.observe(viewLifecycleOwner) {
            it.let { data ->
                binding.tvCityName.text = data!!.location.region
                binding.tvTemp.text = data.current.tempC.toString()
                binding.tvWeatherCondition.text = data.current.condition.text


            }
        }
    }
}