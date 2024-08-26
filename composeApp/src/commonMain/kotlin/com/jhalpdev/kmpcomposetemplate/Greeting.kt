package com.jhalpdev.kmpcomposetemplate

import com.jhalpdev.kmpcomposetemplate.repositories.getPlatform

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}