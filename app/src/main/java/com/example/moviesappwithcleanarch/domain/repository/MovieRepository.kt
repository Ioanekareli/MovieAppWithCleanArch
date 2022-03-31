package com.example.moviesappwithcleanarch.domain.repository

import com.example.moviesappwithcleanarch.data.remote.dto.MoviesDto

interface MovieRepository {

    suspend fun getMovies():List<MoviesDto>

}