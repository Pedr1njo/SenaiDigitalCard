package com.pdrinyo.thesenaidigitalcard.ui.theme



import android.R.color.white
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.unit.TextUnit
import java.time.format.TextStyle


    @Composable
    fun ValueText(
        modifier: Modifier = Modifier,
        text: String,
        fontSize: TextUnit = 28.sp,
        fontWeight: FontWeight = FontWeight.Bold
    ) {
        Text(
            text = text,
            color = Color(0xFFFFD700),
            fontSize = fontSize,
            fontWeight = fontWeight,
            letterSpacing = 1.sp,
            modifier = modifier
        )
    }
