package com.pdrinyo.thesenaidigitalcard.feature.login

import com.pdrinyo.thesenaidigitalcard.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.pdrinyo.thesenaidigitalcard.App.Navegation.Routes
import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.LoginUIEvent
import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.LoginViewModel

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel = viewModel(),
    navController: NavController = NavController(context = LocalContext.current)
) {
    // Variáveis de Estado
    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") } // Declarando a variável de erro

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(BackgroundBlue)
            .padding(horizontal = 28.dp, vertical = 40.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(60.dp))


            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = DarkTextBlue)) {
                        append("Seja ")
                    }
                    withStyle(style = SpanStyle(color = LightTextBlue)) {
                        append("Bem vindo!")
                    }
                },
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            )

            Spacer(modifier = Modifier.height(48.dp))


            OutlinedTextField(
                value = uiStat.usuario,
                onValueChange = { value->
                    viewModel.onEvent(LoginUIEvent.OnUsuarioChange(value))
                },
                singleLine = true,
                leadingIcon = {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .background(IconContainerBlue, shape = RoundedCornerShape(8.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Login Icon",
                            tint = Color.White
                        )
                    }
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = InputBackground,
                    unfocusedContainerColor = InputBackground,
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth()
            )


            Spacer(modifier = Modifier.height(16.dp))

            // Campo da Senha
            OutlinedTextField(
                value = senha,
                onValueChange = { senha = it },
                placeholder = { Text("Senha", color = Color.Gray) },
                singleLine = true,
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                leadingIcon = {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .background(IconContainerBlue, shape = RoundedCornerShape(8.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "Senha Icon",
                            tint = Color.White
                        )
                    }
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = InputBackground,
                    unfocusedContainerColor = InputBackground,
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Botão Entrar com Validação
            // Botão Entrar com Validação de Aluno e Professor
            Button(
                onClick = {
                    viewModel.onEvent(LoginUIEvent.OnEntrarClick)
                },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Entrar",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            if (errorMessage.isNotEmpty()) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = errorMessage,
                    color = Color.Red,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            // Logo do TSDG
            Image(
                painter = painterResource(id = R.drawable.tsdglogo),
                contentDescription = "Logo",
                modifier = Modifier.size(600.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}