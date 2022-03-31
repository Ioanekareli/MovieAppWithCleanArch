package com.example.moviesappwithcleanarch.presentation.HomeFragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesappwithcleanarch.common.Resource
import com.example.moviesappwithcleanarch.data.repository.MoviesRepositoryImpl
import com.example.moviesappwithcleanarch.domain.use_case.GetMoviesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeFragmentViewModel @Inject constructor(
    private val getMoviesUseCase : GetMoviesUseCase
): ViewModel() {

    init {
        getMovies()
    }

    private fun getMovies(){
        getMoviesUseCase().onEach { result ->
            when(result){
                is Resource.Success ->{

                }
                is Resource.Loading ->{

                }
                is Resource.Error ->{

                }

            }
        }.launchIn(viewModelScope)
    }

}