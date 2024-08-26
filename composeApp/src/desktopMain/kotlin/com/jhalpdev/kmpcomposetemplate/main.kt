package com.jhalpdev.kmpcomposetemplate

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.jhalpdev.kmpcomposetemplate.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "KmpComposeTemplate",
        ) {
            App()
        }
    }
}