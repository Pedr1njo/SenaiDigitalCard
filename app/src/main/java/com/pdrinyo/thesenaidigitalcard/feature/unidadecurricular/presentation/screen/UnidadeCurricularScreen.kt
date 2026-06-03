package com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.component.UnidadeCurricularCard
import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.data.dataSource
import com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation.domain.model.UnidadeCurricular

@Composable
fun UnidadeCurricularScreen(
    modifier: Modifier = Modifier,

) {
    val unidadesCurriculares = dataSource()
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(unidadesCurriculares) { unidadeCurricular ->
            UnidadeCurricularCard(unidadeCurricular = unidadeCurricular)
        }
    }
}
@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun UnidadeCurricularScreenPreview() {
    UnidadeCurricularScreen()
}