package com.jhalpdev.kmpcomposetemplate

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.jhalpdev.kmpcomposetemplate.ui.MainScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val showContent by remember { mutableStateOf(false) }
        MainScreen(showContent)
    }
}