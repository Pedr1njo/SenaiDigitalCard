package com.pdrinyo.thesenaidigitalcard.App.Navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdrinyo.thesenaidigitalcard.App.MainActivity
import com.pdrinyo.thesenaidigitalcard.App.TheSenaiDigitalCard
import com.pdrinyo.thesenaidigitalcard.feature.home.HomeProfessorScreen
import com.pdrinyo.thesenaidigitalcard.feature.home.HomeScreen
import com.pdrinyo.thesenaidigitalcard.feature.login.LoginScreen
import com.pdrinyo.thesenaidigitalcard.feature.turma.presentation.TurmasScreen
import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.screen.UnidadeCurricularAlunoScreen
import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.screen.UnidadeCurricularScreen

@Composable
fun AppNavHost(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    ) {

        // LOGIN
        composable(Routes.Login.route) {
            LoginScreen(navController = navController)
        }

        // HOME DO ALUNO
        composable(Routes.HomeAluno.route) {
            HomeScreen(navController = navController)
        }

        // CARTEIRINHA
        composable(Routes.Carteirinha.route) {
            TheSenaiDigitalCard()
        }

        // UCS DO ALUNO
        composable(Routes.UnidadeCurricularAluno.route) {
            UnidadeCurricularAlunoScreen()
        }

        // HOME DO PROFESSOR
        composable(Routes.HomeProfessor.route) {
            HomeProfessorScreen(navController = navController)
        }

        // TURMAS DO PROFESSOR
        composable(Routes.Turmas.route) {
            TurmasScreen()
        }

        // UCS DO PROFESSOR
        composable(Routes.UnidadeCurricular.route) {
            UnidadeCurricularScreen()
        }
    }
}