package com.hectorfortuna.pokedexcompose.data.network.repository

import com.hectorfortuna.pokedexcompose.data.model.Pokemon
import com.hectorfortuna.pokedexcompose.data.model.PokemonList
import com.hectorfortuna.pokedexcompose.data.network.PokeApi
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(private val api: PokeApi): PokemonRepository{
    override suspend fun getPokemonList(limit: Int, offset: Int): PokemonList =
        api.getPokemonList(limit, offset)

    override suspend fun getPokemonInfo(name: String): Pokemon =
        api.getPokemonInfo(name)

}