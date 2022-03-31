package com.example.moviesappwithcleanarch.di

import com.example.moviesappwithcleanarch.common.Constants.BASE_URL
import com.example.moviesappwithcleanarch.data.remote.MoviesApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(Singleton::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMovieApi():MoviesApi{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MoviesApi::class.java )
    }

}