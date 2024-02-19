package com.admiral26.weatherdaggerhilt.ui.splash

import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.admiral26.weatherdaggerhilt.R
import com.admiral26.weatherdaggerhilt.core.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class Splash : BaseFragment(R.layout.splash) {
    override fun onCreated(view: View, savedInstanceState: Bundle?) {
        lifecycleScope.launch {
            delay(4000)
            findNavController().navigate(
                SplashDirections.actionSplashToHomePage()
            )
        }
    }
}
