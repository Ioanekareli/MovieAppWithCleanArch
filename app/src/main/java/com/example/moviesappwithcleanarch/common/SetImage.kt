package com.example.moviesappwithcleanarch.common

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.moviesappwithcleanarch.R

fun ImageView.setImage(url: String?) {

    if (!url.isNullOrEmpty()) {
        Glide.with(this).load("$url").placeholder(R.mipmap.ic_launcher)
            .into(this)
    } else {
        setImageResource(R.mipmap.ic_launcher)
    }
}