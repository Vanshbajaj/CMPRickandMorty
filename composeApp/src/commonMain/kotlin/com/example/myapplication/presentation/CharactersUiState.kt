package com.example.myapplication.presentation

import com.example.myapplication.domain.model.Character



sealed class CharactersUiState {
    object Loading : CharactersUiState()
    data class Success(val characters: List<Character>) : CharactersUiState()
    data class Error(val message: String) : CharactersUiState()
}