package com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.domain.model

data class UnidadeCurricularAluno(
    val id: String,
    val materia: String,
    val nota: Double,
    val media: Double,
    val faltas: Int
)