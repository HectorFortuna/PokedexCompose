package com.hectorfortuna.pokedexcompose.data.network.repository

import com.hectorfortuna.pokedexcompose.data.model.Pokemon
import com.hectorfortuna.pokedexcompose.data.model.PokemonList

interface PokemonRepository {
    suspend fun getPokemonList(limit: Int, offset: Int): PokemonList
    suspend fun getPokemonInfo(name: String): Pokemon
}