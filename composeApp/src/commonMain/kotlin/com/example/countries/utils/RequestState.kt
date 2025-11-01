package com.example.countries.utils

sealed class RequestState<out T> {
    data object Idle : RequestState<Nothing>()
    data object Loading : RequestState<Nothing>()
    data class Success<out T>(val data: T) : RequestState<T>()
    data class Error(val message: String) : RequestState<Nothing>()

    fun isLoading() = this is Loading
    fun  isError() = this is Error
    fun  isSuccess() = this is Success



    fun getSuccessData()= (this as Success).data
    fun getErrorMessage() = (this as Error).message

}