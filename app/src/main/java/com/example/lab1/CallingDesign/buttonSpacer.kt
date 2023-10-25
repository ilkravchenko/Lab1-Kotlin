package com.example.lab1.CallingDesign

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun buttonSpacer(modifier: Modifier = Modifier) {
    Spacer(
        modifier = modifier
            .width(25.dp)
    )
}