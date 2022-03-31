package com.example.moviesappwithcleanarch.domain.model

import com.example.moviesappwithcleanarch.data.remote.dto.MoviesDto
import com.example.moviesappwithcleanarch.data.remote.dto.Result

data class Movie(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)

fun MoviesDto.toMovie():Movie{
    return Movie(
        page = page,
        results = results,
        total_pages = total_pages,
        total_results = total_results
    )
}