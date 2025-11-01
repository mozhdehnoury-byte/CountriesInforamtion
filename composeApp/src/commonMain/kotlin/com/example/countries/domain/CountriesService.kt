package com.example.countries.domain

import com.example.countries.data.remote.model.CountriesNetworkResponseModel
import com.example.countries.utils.RequestState
import io.ktor.http.cio.Request

interface CountriesService {
    suspend fun getAllCountries(): RequestState<CountriesNetworkResponseModel>
}