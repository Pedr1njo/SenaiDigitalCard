package com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.data

import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.domain.model.UnidadeCurricularAluno

fun dataSource(): List<UnidadeCurricularAluno> {
    return listOf(
        UnidadeCurricularAluno(id = "1", materia = "Matemática", nota = 8.5, media = 7.75, faltas = 2),
        UnidadeCurricularAluno(id = "2", materia = "Português", nota = 8.5, media = 7.75, faltas = 2),
        UnidadeCurricularAluno(id = "3", materia = "Banco de Dados", nota = 8.5, media = 7.75, faltas = 2),
        UnidadeCurricularAluno(id = "4", materia = "Ciências", nota = 8.5, media = 7.75, faltas = 2),
        UnidadeCurricularAluno(id = "5", materia = "Física", nota = 8.5, media = 7.75, faltas = 2),
        UnidadeCurricularAluno(id = "6", materia = "Biologia", nota = 8.5, media = 7.75, faltas = 2),
        UnidadeCurricularAluno(id = "7", materia = "Matemática 2", nota = 8.5, media = 7.75, faltas = 2),
        UnidadeCurricularAluno(id = "8", materia = "Matemática 3", nota = 8.5, media = 7.75, faltas = 2)
    )
}