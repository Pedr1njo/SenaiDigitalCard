package com.pdrinyo.thesenaidigitalcard.App.Navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.pdrinyo.thesenaidigitalcard.ui.theme.Design.TheSenaiDigitalCardTheme

@Composable
fun App() {
    TheSenaiDigitalCardTheme() {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController
        )
    }
}