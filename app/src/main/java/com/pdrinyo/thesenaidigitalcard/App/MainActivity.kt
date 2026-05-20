package com.pdrinyo.thesenaidigitalcard.App

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pdrinyo.thesenaidigitalcard.R
import com.pdrinyo.thesenaidigitalcard.ui.theme.Design.PerfilAluno
import com.pdrinyo.thesenaidigitalcard.ui.theme.Design.TheSenaiDigitalCardTheme

// ---------------- MAIN ACTIVITY ----------------

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TheSenaiDigitalCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TheSenaiDigitalCard(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// ---------------- PREVIEW ----------------

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TheSenaiDigitalCardPreview() {
    TheSenaiDigitalCardTheme {
        TheSenaiDigitalCard()
    }
}

// ---------------- UI ----------------

@Composable
fun TheSenaiDigitalCard(modifier: Modifier = Modifier) {

    Box(modifier = Modifier.fillMaxSize()) {

        // BACKGROUND
        Image(
            painter = painterResource(id = R.drawable.fundooooq),
            contentDescription = "Fundo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // OVERLAY
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Black.copy(alpha = 0.4f),
                            Color.Black.copy(alpha = 0.7f),
                            Color(0xFF1A1A2E).copy(alpha = 0.9f)
                        )
                    )
                )
        )

        // CONTEÚDO
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            Image(
                painter = painterResource(id = R.drawable.senailogo),
                contentDescription = "Logo SENAI",
                modifier = Modifier
                    .size(120.dp)
                    .padding(top = 20.dp)
                    .shadow(8.dp, CircleShape)
            )

            Spacer(modifier = Modifier.height(30.dp))




            PerfilAluno(
                nome = "Pedrinyo",
                curso = "System Developer",
                idFoto = R.drawable.homelanderr
            )

            Spacer(modifier = Modifier.height(28.dp))

            Image(
                painter = painterResource(id = R.drawable.qrcodeee),
                contentDescription = "QR Code",
                modifier = Modifier.size(180.dp)
            )
        }
    }
}