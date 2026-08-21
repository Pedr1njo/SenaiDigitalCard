package com.pdrinyo.thesenaidigitalcard.App.Navegation

sealed class Routes(val route: String) {
    object Login : Routes("login")
    object HomeAluno : Routes("home_aluno")
    object HomeProfessor : Routes("home_professor")
    object Carteirinha : Routes("carteirinha")
    object UnidadeCurricular : Routes("unidade_curricular")
    object Turmas : Routes("turmas")
}