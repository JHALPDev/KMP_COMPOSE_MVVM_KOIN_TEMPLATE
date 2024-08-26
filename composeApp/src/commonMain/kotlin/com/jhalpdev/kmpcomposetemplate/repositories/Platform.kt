package com.jhalpdev.kmpcomposetemplate.repositories

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform