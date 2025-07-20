package com.example.myapplication.data.remote

import com.example.myapplication.data.remote.dto.CharacterDto
import com.example.myapplication.data.remote.dto.CharacterListResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get


class KtorApiService(private val client: HttpClient) : ApiService {
    override suspend fun getCharacters(): List<CharacterDto> {
        val response: CharacterListResponse =
            client.get("https://rickandmortyapi.com/api/character").body()
        return response.results
    }
}