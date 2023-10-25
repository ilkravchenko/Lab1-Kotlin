package com.example.lab1.ProfileDesign

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UserInfo(number: Int, text: String, image: Int, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
    ){
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier
                .size(22.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Row {
            Text(
                text = "$number $text",
                fontSize = 12.sp,
                color = Color.Gray,
            )
        }
    }
}