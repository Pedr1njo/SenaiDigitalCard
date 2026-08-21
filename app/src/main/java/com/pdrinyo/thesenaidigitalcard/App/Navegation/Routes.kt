package com.pdrinyo.thesenaidigitalcard.App.Navegation

sealed class Routes(val route: String) {
    object Login : Routes("login")

    // Aluno
    object HomeAluno : Routes("home_aluno")
    object Carteirinha : Routes("carteirinha")
    object UnidadeCurricularAluno : Routes("unidade_curricular_aluno")

    // Professor
    object HomeProfessor : Routes("home_professor")
    object Turmas : Routes("turmas")
    object UnidadeCurricular : Routes("unidade_curricular")
}