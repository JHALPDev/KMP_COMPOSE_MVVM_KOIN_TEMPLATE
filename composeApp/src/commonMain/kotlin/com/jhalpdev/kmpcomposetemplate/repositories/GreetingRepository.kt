package com.jhalpdev.kmpcomposetemplate.repositories

class GreetingRepository {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}