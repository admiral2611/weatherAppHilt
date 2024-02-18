package com.admiral26.weatherdaggerhilt.ui

import android.os.Bundle
import android.view.View
import com.admiral26.weatherdaggerhilt.R
import com.admiral26.weatherdaggerhilt.core.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomePage : BaseFragment(R.layout.page_home) {
    override fun onCreated(view: View, savedInstanceState: Bundle?) {

    }
}