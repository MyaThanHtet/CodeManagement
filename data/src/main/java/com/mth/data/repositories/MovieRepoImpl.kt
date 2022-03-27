package com.mth.data.repositories

import com.mth.data.api.MovieApi
import com.mth.data.mappers.MovieDTOMapper
import com.mth.data.mappers.TrailerDTOMapper
import com.mth.data.util.Constants.API_KEY
import com.mth.domain.models.Movie
import com.mth.domain.models.Trailer
import com.mth.domain.repositories.MovieRepo
import io.reactivex.Single
import javax.inject.Inject

class MovieRepoImpl@Inject constructor(
    private val movieApi: MovieApi,
    private val movieMapper: MovieDTOMapper,
    private val trailerMapper: TrailerDTOMapper,
    ) : MovieRepo {

    override fun getTopRatedMovies(sortBy: String): Single<List<Movie>> {

        return movieApi.getTopRatedMovies(API_KEY, "en-us", sortBy,
        "false", "false", 1)
            .map {
                movieMapper.mapToDomainList(it.results)
            }
    }

    override fun getTrailers(id: Int): Single<List<Trailer>> {

        return movieApi.getTrailers(id, API_KEY, "en-us")
            .map {
                trailerMapper.mapToDomainList(it.results)
            }
    }
}

