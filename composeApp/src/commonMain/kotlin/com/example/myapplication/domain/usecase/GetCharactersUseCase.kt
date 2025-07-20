package com.example.myapplication.domain.usecase

import com.example.myapplication.domain.model.Character
import com.example.myapplication.domain.repository.CharacterRepository


class GetCharactersUseCase(private val repository: CharacterRepository) {
    suspend operator fun invoke(): List<Character> {
        return repository.fetchCharacters()
    }
}