package com.jhalpdev.kmpcomposetemplate

import androidx.compose.ui.window.ComposeUIViewController
import com.jhalpdev.kmpcomposetemplate.di.initKoin

fun MainViewController() = ComposeUIViewController(configure = {
    initKoin()
}) {
    App()
}