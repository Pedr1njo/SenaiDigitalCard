package com.pdrinyo.thesenaidigitalcard.feature.turma.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdrinyo.thesenaidigitalcard.feature.login.DarkTextBlue
import com.pdrinyo.thesenaidigitalcard.feature.login.IconContainerBlue
import com.pdrinyo.thesenaidigitalcard.feature.login.InputBackground
import com.pdrinyo.thesenaidigitalcard.feature.turma.domain.model.Turma

@Composable
fun TurmaCard(
    modifier: Modifier = Modifier,
    turma: Turma,
    onClick: () -> Unit = {}
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(68.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = InputBackground
        ),
        border = androidx.compose.foundation.BorderStroke(1.dp, Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .size(44.dp)
                        .background(IconContainerBlue, shape = RoundedCornerShape(12.dp)),
                    contentAlignment = Alignment.Center
                ) {


                    Spacer(modifier = Modifier.width(12.dp))

                    Text(
                        text = turma.nome,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = DarkTextBlue,
                        maxLines = 2
                    )
                }

                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = null,
                    tint = IconContainerBlue,
                    modifier = Modifier.size(28.dp)
                )
            }
        }
    }


    @Composable
    fun TurmaCardPreview() {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(16.dp)
        ) {
            TurmaCard(turma = Turma("1", "Turma 1 – Desenvolvimento de Sistemas"))
            TurmaCard(turma = Turma("2", "Turma 2 – Análise e Desenvolvimento de Sistemas"))
            TurmaCard(turma = Turma("3", "Turma 3 – Redes de Computadores"))
            TurmaCard(turma = Turma("4", "Turma 4 – Banco de Dados"))
            TurmaCard(turma = Turma("5", "Turma 5 – Programação de Aplicativos"))
            TurmaCard(turma = Turma("6", "Turma 6 – Segurança da Informação"))
            TurmaCard(turma = Turma("7", "Turma 7 – Engenharia de Software"))
            TurmaCard(turma = Turma("8", "Turma 8 – Internet das Coisas (IoT)"))
        }
    }
}
