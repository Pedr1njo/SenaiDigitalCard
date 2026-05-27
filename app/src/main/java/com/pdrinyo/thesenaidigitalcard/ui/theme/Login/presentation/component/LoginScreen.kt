package com.pdrinyo.thesenaidigitalcard.ui.theme.Login.presentation.component

import com.pdrinyo.thesenaidigitalcard.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy (space = 20.dp, Alignment.CenterVertically),
        modifier = Modifier
            .fillMaxSize()
    ) {


            Image(
                painter = painterResource(id = R.drawable.bigbig),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(220.dp),

                    )


        Text(
            text = "Login",
            fontSize = 34.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Serif

        )



        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text(
                    text = "Email",
                    fontSize =  14.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Serif
                )
            }

        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text(
                    text = "Senha",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Serif
                )
            }

        )

        Button(
            onClick = {},
            shape = RoundedCornerShape(size=4.dp),
            border = BorderStroke(
                width = 1.dp,
                color = MaterialTheme.colorScheme.primary
            )
        ) { Text(
            text = "Entrar",
            fontSize = 14.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Serif
        )

        }

    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun LoginScreenPreview() {
    LoginScreen()

}