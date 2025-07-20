package com.example.myapplication.data.repository

import com.example.myapplication.data.remote.ApiService
import com.example.myapplication.domain.model.Character
import com.example.myapplication.domain.repository.CharacterRepository


class CharacterRepositoryImpl(private val apiService: ApiService) : CharacterRepository {
    override suspend fun fetchCharacters(): List<Character> {
        return apiService.getCharacters().map {
            Character(id = it.id, name = it.name, imageUrl = it.image)
        }
    }
}
