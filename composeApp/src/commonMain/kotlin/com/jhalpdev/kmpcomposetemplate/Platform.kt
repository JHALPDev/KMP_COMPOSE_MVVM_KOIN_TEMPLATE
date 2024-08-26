package com.jhalpdev.kmpcomposetemplate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform