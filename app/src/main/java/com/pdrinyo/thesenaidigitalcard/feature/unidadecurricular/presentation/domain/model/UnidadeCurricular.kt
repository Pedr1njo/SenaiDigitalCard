package com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.domain.model

data class UnidadeCurricular(
    val id: String,
    val nome: String,
    val turma: String,
    val cargaHoraria: String,
    val totalAulas: Int,
    val diasSemana: String
)