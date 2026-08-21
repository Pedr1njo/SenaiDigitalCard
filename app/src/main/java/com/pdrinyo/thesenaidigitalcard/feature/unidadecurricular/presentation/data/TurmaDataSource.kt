package com.pdrinyo.thesenaidigitalcard.feature.turma.data

import com.pdrinyo.thesenaidigitalcard.feature.turma.domain.model.Turma

fun turmaDataSource(): List<Turma> {
    return listOf(
        Turma(id = "1", nome = "Turma 1 – Desenvolvimento de Sistemas"),
        Turma(id = "2", nome = "Turma 2 – Análise e Desenvolvimento de Sistemas"),
        Turma(id = "3", nome = "Turma 3 – Redes de Computadores"),
        Turma(id = "4", nome = "Turma 4 – Banco de Dados"),
        Turma(id = "5", nome = "Turma 5 – Programação de Aplicativos"),
        Turma(id = "6", nome = "Turma 6 – Segurança da Informação"),
        Turma(id = "7", nome = "Turma 7 – Engenharia de Software"),
        Turma(id = "8", nome = "Turma 8 – Internet das Coisas (IoT)")
    )
}