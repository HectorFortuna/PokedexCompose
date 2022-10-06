package com.hectorfortuna.pokedexcompose.view.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hectorfortuna.pokedexcompose.data.model.Pokemon
import com.hectorfortuna.pokedexcompose.data.model.PokemonList
import com.hectorfortuna.pokedexcompose.data.network.repository.PokemonRepository
import com.hectorfortuna.pokedexcompose.di.qualifiers.Io
import com.hectorfortuna.pokedexcompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: PokemonRepository,
    @Io val ioDispatcher: CoroutineDispatcher
): ViewModel() {

    private val _response = MutableLiveData<Resource<PokemonList>>()
    val response: LiveData<Resource<PokemonList>>
        get() = _response

    private val _responseInfo = MutableLiveData<Resource<Pokemon>>()
    val responseInfo: LiveData<Resource<Pokemon>>
        get() = _responseInfo

    fun getPokemonList(limit: Int, offset: Int){

    }
}