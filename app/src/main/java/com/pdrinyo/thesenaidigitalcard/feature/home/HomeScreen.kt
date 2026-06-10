package com.pdrinyo.thesenaidigitalcard.feature.home

import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdrinyo.thesenaidigitalcard.App.Navegation.Routes
import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.component.UnidadeCurricularCard

@Composable
fun HomeScreen(
    navController: NavController
) {

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