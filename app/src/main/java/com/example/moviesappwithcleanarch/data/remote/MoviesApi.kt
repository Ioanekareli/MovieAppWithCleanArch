package com.example.moviesappwithcleanarch.data.remote

import com.example.moviesappwithcleanarch.data.remote.dto.MoviesDto
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApi {

    @GET("/3/movie/popular")
    suspend fun getMovies(
        @Query("api_key")
        api_key:String
    ):List<MoviesDto>



}