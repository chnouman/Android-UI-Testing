package com.mnouman.myapplication.datasource

interface MoviesDataSource {

    fun getMovie(movieId: Int): Movie?
}