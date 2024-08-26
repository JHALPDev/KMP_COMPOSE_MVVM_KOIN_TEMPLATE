package com.jhalpdev.kmpcomposetemplate.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jhalpdev.kmpcomposetemplate.repositories.GreetingRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel(private val greetingRepository: GreetingRepository) : ViewModel() {

    private val _state = MutableStateFlow(MainScreenState())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.emit(MainScreenState(greetingRepository.greet()))
        }
    }
}