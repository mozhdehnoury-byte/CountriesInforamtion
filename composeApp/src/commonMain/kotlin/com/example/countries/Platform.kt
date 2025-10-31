package com.example.countries

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform