package com.example.moviesappwithcleanarch.domain.use_case


import com.bumptech.glide.load.HttpException
import com.example.moviesappwithcleanarch.common.Resource
import com.example.moviesappwithcleanarch.domain.model.Movie
import com.example.moviesappwithcleanarch.domain.model.toMovie
import com.example.moviesappwithcleanarch.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class GetMoviesUseCase @Inject constructor(
    private val repository:MovieRepository
){

    operator  fun invoke(): Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            val movies = repository.getMovies().map {
                it.toMovie()
            }
            emit(Resource.Success(movies))
        }
        catch (e: HttpException){
            emit(Resource.Error(message = "An Unexpected Error"))
        }
        catch (e: IOException){
            emit(Resource.Error(message = "Check Your Internet Connection"))
        }
    }

}