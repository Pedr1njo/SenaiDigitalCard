package com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.domain.model

data class Aluno(
    val id: String,
    val nome: String,
    val faltas: Int = 0
)