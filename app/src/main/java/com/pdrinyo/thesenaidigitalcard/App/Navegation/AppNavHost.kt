package com.pdrinyo.thesenaidigitalcard.App.Navegation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdrinyo.thesenaidigitalcard.App.TheSenaiDigitalCard
import com.pdrinyo.thesenaidigitalcard.feature.login.LoginScreen
import com.pdrinyo.thesenaidigitalcard.feature.home.HomeScreen

import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.component.UnidadeCurricularCard
import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.domain.model.UnidadeCurricular
import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.screen.UnidadeCurricularScreen

@Composable
fun AppNavHost(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    ) {

        composable(Routes.Login.route) {
            LoginScreen(
                navController = navController
            )
        }

        composable(Routes.Home.route) {
            HomeScreen(
                navController = navController
            )
        }

        composable(Routes.Carteirinha.route) {
            Scaffold(
                modifier = Modifier.fillMaxSize()
            ) { innerPadding ->

                TheSenaiDigitalCard(
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }

        composable(Routes.UnidadeCurricular.route) {
            UnidadeCurricularScreen()
        }
        }
    }
