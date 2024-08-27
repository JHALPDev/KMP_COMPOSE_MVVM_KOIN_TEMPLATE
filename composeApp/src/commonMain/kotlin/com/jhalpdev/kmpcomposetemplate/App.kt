package com.jhalpdev.kmpcomposetemplate

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.jhalpdev.kmpcomposetemplate.repositories.GreetingRepository
import com.jhalpdev.kmpcomposetemplate.ui.MainScreen
import com.jhalpdev.kmpcomposetemplate.ui.MainViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext

@Composable
@Preview
fun App() {
    KoinContext {
        val repository = GreetingRepository()
        val viewModel = MainViewModel(repository)
        val state by viewModel.state.collectAsState()
        MainScreen(state)
    }

}