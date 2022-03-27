package com.mth.domain.repositories

import com.mth.domain.models.Movie
import com.mth.domain.models.Trailer
import io.reactivex.Single

interface MovieRepo {

    fun getTopRatedMovies(sort: String): Single<List<Movie>>

    fun getTrailers(id: Int): Single<List<Trailer>>

}