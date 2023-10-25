package com.example.lab1.CallingDesign

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CreateButton(image: Int, imageDescription: String, backgroundColor: Color, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .size(55.dp)
            .clip(RoundedCornerShape(percent = 35))
            .background(color = backgroundColor)
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = imageDescription,
            modifier = Modifier
                .size(25.dp)
                .clip(RoundedCornerShape(percent = 35))
                .background(color = backgroundColor)
        )
    }
}