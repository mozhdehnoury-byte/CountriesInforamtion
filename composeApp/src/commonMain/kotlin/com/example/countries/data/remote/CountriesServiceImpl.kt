package com.example.countries.data.remote

import com.example.countries.data.remote.model.CountriesNetworkResponseModel
import com.example.countries.domain.CountriesService
import com.example.countries.utils.RequestState
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.statement.request
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class CountriesServiceImpl : CountriesService {
    companion object {
        const val ENDPOINT = "https://restcountries.com/v3.1/"
    }

    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
        install(HttpTimeout) {
            requestTimeoutMillis = 15000
        }

    }

    override suspend fun getAllCountries(): RequestState<CountriesNetworkResponseModel> {
        return try {
            val response = httpClient.get(ENDPOINT)
            if (response.status.value == 200) {
                val apiResponse = Json.decodeFromString<CountriesNetworkResponseModel>(response.body())
                RequestState.Success(apiResponse)
            } else {
                RequestState.Error("HTTP ERROR CODE IS ${response.status.value}")
            }
        } catch (e: Exception) {
            RequestState.Error(e.message.toString())
        } }
}