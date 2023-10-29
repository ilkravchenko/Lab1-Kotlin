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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab1.R
import com.example.lab1.TranslationPreview
import com.example.lab1.model.UserProfile
import com.example.lab1.ui.theme.Lab1Theme

@Composable
fun CallView(
    user: UserProfile,
    modifier: Modifier = Modifier
) {
    val spacerPadding = dimensionResource(id = R.dimen.spacer_padding_100)
    val mediumPadding = dimensionResource(id = R.dimen.padding_medium)
    val largePadding = dimensionResource(id = R.dimen.padding_large)
    val topPadding = dimensionResource(id = R.dimen.top_padding_call)
    val bottomPadding = dimensionResource(id = R.dimen.bottom_padding_call)
    val btnSize = dimensionResource(id = R.dimen.btn_size)

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
                .height(spacerPadding)
        )
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .padding(start = mediumPadding, top = topPadding)
        ) {
            CreateButton(
                image = R.drawable.left_arrow,
                imageDescription = "Go back",
                backgroundColor = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0f),
                modifierBox = Modifier
                    .size(btnSize)
                    .clip(RoundedCornerShape(percent = 35))
                    .background(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.2f))
                    .border(1.dp, Color.White.copy(alpha = 0.3f), RoundedCornerShape(percent = 35))
            )
        }
        Box {
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = bottomPadding)
            ) {
                Text(
                    text = stringResource(R.string.calling), color = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier
                        .padding(bottom = mediumPadding)
                )
                Text(
                    text = user.name,
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = largePadding)
                )
                Row(
                    modifier = Modifier
                        .padding(top = largePadding)
                ) {
                    CreateButton(
                        image = R.drawable.mute_microphone,
                        backgroundColor = MaterialTheme.colorScheme.onPrimary,
                        imageDescription = "Mute Microphone"
                    )
                    buttonSpacer()
                    CreateButton(
                        image = R.drawable.end_call,
                        backgroundColor = MaterialTheme.colorScheme.error,
                        imageDescription = "End Call"
                    )
                    buttonSpacer()
                    CreateButton(
                        image = R.drawable.volume_up,
                        backgroundColor = MaterialTheme.colorScheme.onPrimary,
                        imageDescription = "Volume Up"
                    )
                }
            }
        }
    }
}

@TranslationPreview
@Composable
fun CallViewPreview() {
    Lab1Theme {
        CallView(user = UserProfile.example)
    }
}