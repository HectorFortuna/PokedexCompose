package com.hectorfortuna.pokedexcompose.di

import com.hectorfortuna.pokedexcompose.di.qualifiers.Default
import com.hectorfortuna.pokedexcompose.di.qualifiers.Io
import com.hectorfortuna.pokedexcompose.di.qualifiers.Main
import com.hectorfortuna.pokedexcompose.di.qualifiers.Unconfined
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DispatchersModule {

    @Singleton
    @Provides
    @Io
    fun ioDispatcher(): CoroutineDispatcher = Dispatchers.IO

    @Singleton
    @Provides
    @Default
    fun defaultDispatcher(): CoroutineDispatcher = Dispatchers.Default

    @Singleton
    @Provides
    @Main
    fun mainDispatcher(): CoroutineDispatcher = Dispatchers.Main

    @Singleton
    @Provides
    @Unconfined
    fun unconfinedDispatcher(): CoroutineDispatcher = Dispatchers.Unconfined


}