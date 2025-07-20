package com.example.myapplication.domain.repository

import com.example.myapplication.domain.model.Character


interface CharacterRepository {
    suspend fun fetchCharacters(): List<Character>
}