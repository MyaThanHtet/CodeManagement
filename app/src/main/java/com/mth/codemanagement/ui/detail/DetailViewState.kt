package com.mth.codemanagement.ui.detail

import com.mth.domain.models.Trailer

sealed class DetailViewState {

    data class Presenting( val results: List<Trailer>) : DetailViewState()

    object Error : DetailViewState()

    object Loading : DetailViewState()
}