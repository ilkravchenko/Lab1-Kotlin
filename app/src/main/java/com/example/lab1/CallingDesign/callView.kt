package com.example.lab1.CallingDesign

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab1.R
import com.example.lab1.ui.theme.Lab1Theme

@Composable
fun CallView(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(percent = 15))
            .paint(
                painterResource(id = R.drawable.pablo_background),
                contentScale = ContentScale.Crop
            )
    ) {
        Spacer(
            modifier = Modifier
                .height(100.dp)
        )
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .padding(start = 16.dp, top = 50.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.left_arrow),
                contentDescription = "Go back",
//                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(45.dp)
                    .clip(RoundedCornerShape(percent = 35))
                    .border(2.dp, Color.White.copy(alpha = 0.3f), RoundedCornerShape(percent = 35))
                    .background(color = Color.White.copy(alpha = 0.2f))
            )
        }
        Box {
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 75.dp)
            ) {
                Text(
                    text = "Calling...", color = Color.White,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = "Pablo Escobar",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 24.dp)
                )
                Row(
                    modifier = Modifier
                        .padding(top = 24.dp)
                ) {
                    CreateButton(
                        image = R.drawable.mute_microphone,
                        backgroundColor = Color.White,
                        imageDescription = "Mute Microphone"
                    )
                    buttonSpacer()
                    CreateButton(
                        image = R.drawable.end_call,
                        backgroundColor = Color.Red,
                        imageDescription = "End Call"
                    )
                    buttonSpacer()
                    CreateButton(
                        image = R.drawable.volume_up,
                        backgroundColor = Color.White,
                        imageDescription = "Volume Up"
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun CallViewPreview() {
    Lab1Theme {
        CallView()
    }
}