package com.example.myapplication.data.remote

import com.example.myapplication.data.remote.dto.CharacterDto



interface ApiService {
    suspend fun getCharacters(): List<CharacterDto>
}