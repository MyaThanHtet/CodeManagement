package com.mth.data.mappers

import com.mth.data.models.TrailerDTO
import com.mth.domain.common.DomainMapper
import com.mth.domain.models.Trailer
import javax.inject.Inject

class TrailerDTOMapper @Inject constructor() : DomainMapper<TrailerDTO, Trailer> {

    override fun mapToDomain(entity: TrailerDTO): Trailer {
        return Trailer(
            id = entity.id,
            key = entity.key,
            name = entity.name
        )
    }

    override fun mapToEntity(domainModel: Trailer): TrailerDTO {
        return TrailerDTO(
            id = domainModel.id,
            key = domainModel.key,
            name = domainModel.name
        )
    }

    fun mapToDomainList(trailerDTOs: List<TrailerDTO>): List<Trailer> {
        return trailerDTOs.map {
            mapToDomain(it) }
    }

    fun mapToEntityList(trailers: List<Trailer>): List<TrailerDTO> {
        return trailers.map {
            mapToEntity(it) }
    }
}