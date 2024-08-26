package com.jhalpdev.kmpcomposetemplate.repositories

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}