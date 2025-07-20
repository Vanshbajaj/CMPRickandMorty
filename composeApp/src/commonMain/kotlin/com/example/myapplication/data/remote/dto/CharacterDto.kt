package com.example.myapplication.data.remote.dto

import kotlinx.serialization.Serializable


@Serializable
data class CharacterDto(
    val id: Int,
    val name: String,
    val image: String
)

@Serializable
data class CharacterListResponse(val results: List<CharacterDto>)