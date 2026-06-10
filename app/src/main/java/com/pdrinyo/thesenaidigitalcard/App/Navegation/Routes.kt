package com.pdrinyo.thesenaidigitalcard.App.Navegation

sealed class Routes(val route: String) {

    data object Login : Routes(route = "Login")

    data object Home: Routes("Home")

    data object Carteirinha : Routes(route = "carteirinha")

    data object UnidadeCurricular : Routes ("unidade_curricular")
}