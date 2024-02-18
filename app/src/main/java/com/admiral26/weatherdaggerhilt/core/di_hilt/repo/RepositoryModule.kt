package com.admiral26.weatherdaggerhilt.core.di_hilt.repo

import com.admiral26.weatherdaggerhilt.core.network.WeatherService
import com.admiral26.weatherdaggerhilt.core.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {


    @[Provides Singleton]
    fun provideNewsRepository(service: WeatherService): WeatherRepository {
        return WeatherRepository(service)
    }
}