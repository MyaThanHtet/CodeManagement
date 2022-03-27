package com.mth.data.api.response

import com.mth.data.models.TrailerDTO
import com.squareup.moshi.Json

data class TrailersResponse(
    @Json(name = "id")
    val id: Int,
    @Json(name = "results")
    val results: List<TrailerDTO>
)