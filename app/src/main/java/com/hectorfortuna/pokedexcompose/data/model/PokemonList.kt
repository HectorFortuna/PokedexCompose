package com.hectorfortuna.pokedexcompose.data.model

import com.google.gson.annotations.SerializedName

data class PokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)