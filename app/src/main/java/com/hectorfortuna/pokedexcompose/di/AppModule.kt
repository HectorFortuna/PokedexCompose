package com.hectorfortuna.pokedexcompose.di

import com.hectorfortuna.pokedexcompose.data.network.repository.PokemonRepository
import com.hectorfortuna.pokedexcompose.data.network.repository.PokemonRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Singleton
    @Binds
    abstract fun bindPokemonRepository(
        pokemonRepository: PokemonRepositoryImpl
    ): PokemonRepository
}