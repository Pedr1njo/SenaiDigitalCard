package com.pdrinyo.thesenaidigitalcard.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.pdrinyo.thesenaidigitalcard.App.Navegation.Routes
import com.pdrinyo.thesenaidigitalcard.feature.login.LoginScreen
import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.component.UnidadeCurricularCard
import com.pdrinyo.thesenaidigitalcard.R
import com.pdrinyo.thesenaidigitalcard.feature.login.BackgroundBlue

@Composable
fun HomeScreen(
    navController: NavController = rememberNavController(),
    userType: String = "Aluno",
    profileImageRes: Int = R.drawable.ph
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundBlue)
            .padding(horizontal = 28.dp, vertical = 40.dp)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            onClick = {
                navController.navigate(Routes.Carteirinha.route)
            }
        ) {
            Text("Carteirinha")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.navigate(Routes.UnidadeCurricular.route)
            }
        ) {
            Text("Unidades Curriculares")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        navController = rememberNavController()
    )
}