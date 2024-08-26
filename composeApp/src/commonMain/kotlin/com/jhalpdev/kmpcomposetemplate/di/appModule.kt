package com.jhalpdev.kmpcomposetemplate.di

import androidx.lifecycle.viewmodel.compose.viewModel
import com.jhalpdev.kmpcomposetemplate.repositories.GreetingRepository
import com.jhalpdev.kmpcomposetemplate.ui.MainViewModel
import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single {
        GreetingRepository()
    }

    viewModel {
        MainViewModel(get())
    }
}

