package com.example.lab1.ProfileDesign

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab1.R
import com.example.lab1.TranslationPreview
import com.example.lab1.model.UserProfile
import com.example.lab1.ui.theme.Lab1Theme

@Composable
fun Profile(
    user: UserProfile,
    modifier: Modifier = Modifier
) {
    val spacerPadding = dimensionResource(id = R.dimen.spacer_padding_100)
    val extraSmallPadding = dimensionResource(id = R.dimen.padding_extra_small)
    val mediumPadding = dimensionResource(id = R.dimen.padding_medium)
    val mediumLargePadding = dimensionResource(id = R.dimen.padding_medium_20)
    val largePadding = dimensionResource(id = R.dimen.padding_large)
    val userAvatar = dimensionResource(id = R.dimen.user_avatar)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(percent = 5))
            .background(MaterialTheme.colorScheme.onPrimary)
            .fillMaxSize()
    ) {
        Spacer(
            modifier = Modifier
                .height(spacerPadding)
        )
        Image(
            painter = painterResource(id = user.avatar),
            contentDescription = "User Avatar",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(userAvatar)
                .clip(CircleShape)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = mediumPadding)
        ) {
            Text(text = user.name + " ", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Image(
                painter = painterResource(id = R.drawable.plus),
                contentDescription = "Plus",
                modifier = Modifier
                    .size(mediumLargePadding)
            )
        }
        Text(
            text = user.city + ", " + user.country,
            color = MaterialTheme.colorScheme.outline,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = extraSmallPadding, bottom = extraSmallPadding)
        )
        Text(
            text = user.info, textAlign = TextAlign.Center, modifier = Modifier
                .padding(
                    top = mediumPadding,
                    bottom = largePadding,
                    start = mediumPadding,
                    end = mediumPadding
                )
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(start = largePadding, end = largePadding)
                .fillMaxWidth()
        ) {
            UserInfo(
                number = user.posts,
                text = stringResource(R.string.posts),
                image = R.drawable.posts
            )
            UserInfo(
                number = user.folowing,
                text = stringResource(R.string.folowing),
                image = R.drawable.folowing
            )
            UserInfo(
                number = user.folowers,
                text = stringResource(R.string.folowers),
                image = R.drawable.folowers
            )
        }
    }
}

@TranslationPreview
@Composable
fun ProfilePreview() {
    Lab1Theme {
        Profile(user = UserProfile.example)
    }
}
