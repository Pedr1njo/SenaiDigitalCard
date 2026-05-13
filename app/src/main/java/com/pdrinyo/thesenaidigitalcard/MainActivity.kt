package com.pdrinyo.thesenaidigitalcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdrinyo.thesenaidigitalcard.ui.theme.QrCode
import com.pdrinyo.thesenaidigitalcard.ui.theme.TheSenaiDigitalCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TheSenaiDigitalCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding -> //Scaffold é o esqueleto do projeto
                    TheSenaiDigitalCard(
                        modifier = Modifier.padding(innerPadding) //
                    )
                }
            }
        }
    }
}



@Composable
fun TheSenaiDigitalCard(modifier: Modifier = Modifier) {

    Box {

        Box(
            modifier = Modifier.fillMaxSize()
        ) {

            Image(
                painter = painterResource(id = R.drawable.fundooooq),
                contentDescription = "Fundo",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )


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
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally, //centraliza na Horizontal
            verticalArrangement = Arrangement.Center // Centraliza a Vertical
        ) {
            // Adicionei SOMBRA no logo
            Image(
                painter = painterResource(id = R.drawable.senailogo),
                contentDescription = "Logo",
                modifier = Modifier
                    .shadow(8.dp, CircleShape)
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Deixei a borda dourada
            Image(
                painter = painterResource(id = R.drawable.homelanderr),
                contentDescription = "Pedrinyo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .border(
                        3.dp,
                        Color(0xFFFFD700).copy(alpha = 0.6f),
                        CircleShape
                    )
                    .shadow(16.dp, CircleShape, ambientColor = Color(0xFFFFD700))
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row {
                Text(
                    text = "Nome: ",
                    color = Color.White,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif
                )

                Text(
                    text = "Pedrinyo",
                    color = Color(0xFFFFD700),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = FontFamily.SansSerif
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row {
                Text(
                    text = "Curso: ",
                    fontSize = 24.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif
                )

                Text(
                    text = "DS",
                    fontSize = 24.sp,
                    color = Color(0xFFFFD700),
                    fontWeight = FontWeight.Medium,
                    fontFamily = FontFamily.SansSerif
                )
            }

            Spacer(modifier = Modifier.height(28.dp))

            // Deixei o QR code com sombra

            QrCode(
                conteudo = ""
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun TheSenaiDigitalCardPreview(){
    TheSenaiDigitalCard()
}

