package com.mth.codemanagement.ui.home

import com.mth.domain.models.Movie

sealed class HomeViewState {

    data class Presenting( val results: List<Movie>) : HomeViewState()

    object Error : HomeViewState()

    object Loading : HomeViewState()
}