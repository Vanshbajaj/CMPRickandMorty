package com.example.myapplication.di

import com.example.myapplication.data.remote.KtorApiService
import com.example.myapplication.data.repository.CharacterRepositoryImpl
import com.example.myapplication.domain.repository.CharacterRepository
import com.example.myapplication.domain.usecase.GetCharactersUseCase
import com.example.myapplication.presentation.viewmodel.CharactersViewModel
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module


class KoinModule {
    val sharedModule = module {

        single {
            HttpClient {
                install(ContentNegotiation) {
                    json(Json { ignoreUnknownKeys = true })
                }
            }
        }

        single { KtorApiService(get()) }
        single<CharacterRepository> { CharacterRepositoryImpl(get()) }
        single { GetCharactersUseCase(get()) }
        factory { CharactersViewModel(get()) }
    }
}