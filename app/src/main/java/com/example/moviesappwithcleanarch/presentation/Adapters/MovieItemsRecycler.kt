package com.example.moviesappwithcleanarch.presentation.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesappwithcleanarch.common.setImage
import com.example.moviesappwithcleanarch.data.remote.dto.MoviesDto
import com.example.moviesappwithcleanarch.data.remote.dto.Result
import com.example.moviesappwithcleanarch.databinding.MovieItemsBinding

class MovieItemsRecycler( val items:List<Result>):RecyclerView.Adapter<MovieItemsRecycler.ViewHolder>() {

    class ViewHolder(private val binding:MovieItemsBinding):RecyclerView.ViewHolder(binding.root){
        val title = binding.movieTitle
        val icon = binding.movieIcon
        val description = binding.movieDescription
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(MovieItemsBinding.inflate(
            LayoutInflater.from(parent.context)
            ,parent
            ,false
        ))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)

        holder.title.text = item.title
        holder.icon.setImage(item.poster_path)
        holder.description.text = item.overview
    }

    override fun getItemCount() = items.size

}