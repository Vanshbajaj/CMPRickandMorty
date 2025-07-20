package com.example.myapplication.presentation.viewmodel

import com.example.myapplication.domain.usecase.GetCharactersUseCase
import com.example.myapplication.presentation.CharactersUiState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class CharactersViewModel(
    private val getCharactersUseCase: GetCharactersUseCase
) {
    private val viewModelScope = CoroutineScope(Dispatchers.Default + SupervisorJob())

    private val _uiState = MutableStateFlow<CharactersUiState>(CharactersUiState.Loading)
    val uiState: StateFlow<CharactersUiState> = _uiState

    init {
        fetchCharacters()
    }

    private fun fetchCharacters() {
        viewModelScope.launch {
            runCatching { getCharactersUseCase() }
                .onSuccess { characters ->
                    _uiState.value = CharactersUiState.Success(characters)
                }
                .onFailure { exception ->
                    _uiState.value = CharactersUiState.Error(exception.message ?: "Unknown error")
                }
        }
    }
}


