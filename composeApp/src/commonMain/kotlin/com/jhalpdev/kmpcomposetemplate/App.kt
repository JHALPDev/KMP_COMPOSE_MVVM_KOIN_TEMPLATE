package com.jhalpdev.kmpcomposetemplate

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.jhalpdev.kmpcomposetemplate.ui.MainScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        MainScreen()
    }
}