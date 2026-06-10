package com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.domain.model.UnidadeCurricular


@Composable
fun UnidadeCurricularCard (
    modifier: Modifier = Modifier,
    unidadeCurricular: UnidadeCurricular

)
{
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
    ) {

        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Text(
                text = "Unidade Curricular",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Professor: ${unidadeCurricular.professor}"

            )

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "N1: ${unidadeCurricular.nota1}"

                )

                Text(
                    text = "N2: ${unidadeCurricular.nota2}"


                )

                Text(
                    text = "Média: ${unidadeCurricular.media}"

                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Faltas: 2",
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.primary
            )
        }


    }
    }


@Preview(
    showBackground = true
)

@Composable
fun UnidadeCurricularCardPreview() {
}