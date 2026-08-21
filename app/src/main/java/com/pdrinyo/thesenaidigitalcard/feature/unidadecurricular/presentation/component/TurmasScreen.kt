package com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.component
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdrinyo.thesenaidigitalcard.feature.login.BackgroundBlue
import com.pdrinyo.thesenaidigitalcard.feature.login.DarkTextBlue
import com.pdrinyo.thesenaidigitalcard.feature.login.LightTextBlue
import com.pdrinyo.thesenaidigitalcard.feature.turma.domain.model.Turma
import com.pdrinyo.thesenaidigitalcard.feature.turma.presentation.component.TurmaCard

@Composable
fun TurmasScreen(
    turmas: List<Turma> = listOf(
        Turma("1", "Turma 1 – Desenvolvimento de Sistemas"),
        Turma("2", "Turma 2 – Análise e Desenvolvimento de Sistemas"),
        Turma("3", "Turma 3 – Redes de Computadores"),
        Turma("4", "Turma 4 – Banco de Dados"),
        Turma("5", "Turma 5 – Programação de Aplicativos"),
        Turma("6", "Turma 6 – Segurança da Informação"),
        Turma("7", "Turma 7 – Engenharia de Software"),
        Turma("8", "Turma 8 – Internet das Coisas (IoT)")
    )
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundBlue)
            .padding(horizontal = 20.dp, vertical = 24.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = DarkTextBlue)) {
                        append("Tur")
                    }
                    withStyle(style = SpanStyle(color = LightTextBlue)) {
                        append("mas")
                    }
                },
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            )

            Spacer(modifier = Modifier.height(24.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.White.copy(alpha = 0.85f), shape = RoundedCornerShape(24.dp))
                    .border(2.dp, Color.White, RoundedCornerShape(24.dp))
                    .padding(12.dp)
            ) {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    contentPadding = PaddingValues(vertical = 4.dp)
                ) {
                    items(turmas) { turma ->
                        TurmaCard(turma = turma)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TurmasScreenPreview() {
    TurmasScreen()
}