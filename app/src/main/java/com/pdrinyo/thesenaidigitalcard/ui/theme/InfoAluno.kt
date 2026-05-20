package com.pdrinyo.thesenaidigitalcard.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdrinyo.thesenaidigitalcard.LabelText

@Composable
fun InfoAluno(textLabel: String, textValue: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        LabelText(
            text = "$textLabel: "
        )

        ValueText(
            text = textValue
        )
    }
}