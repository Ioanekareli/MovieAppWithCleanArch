package com.example.moviesappwithcleanarch.data.repository

import com.example.moviesappwithcleanarch.common.Constants.API_KEY
import com.example.moviesappwithcleanarch.data.remote.MoviesApi
import com.example.moviesappwithcleanarch.data.remote.dto.MoviesDto
import com.example.moviesappwithcleanarch.domain.repository.MovieRepository
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor(
    private val api:MoviesApi
    ):MovieRepository {


    override suspend fun getMovies(): List<MoviesDto> {
        return api.getMovies(api_key = API_KEY)
    }

}