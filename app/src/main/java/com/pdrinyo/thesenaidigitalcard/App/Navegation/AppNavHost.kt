package com.pdrinyo.thesenaidigitalcard.App.Navegation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdrinyo.thesenaidigitalcard.ui.theme.Login.presentation.component.LoginScreen

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

        composable(Routes.Carteirinha.route) {
            Scaffold(
                modifier = Modifier.fillMaxSize()
            ) { innerPadding ->

                LoginScreen(
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}