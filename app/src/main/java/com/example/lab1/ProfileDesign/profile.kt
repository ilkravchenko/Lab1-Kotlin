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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab1.R
import com.example.lab1.model.UserProfile
import com.example.lab1.ui.theme.Lab1Theme

@Composable
fun Profile(
    user: UserProfile,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Spacer(
            modifier = Modifier
                .height(100.dp)
        )
        Image(
            painter = painterResource(id = user.avatar),
            contentDescription = "User Avatar",
            modifier = Modifier
                .size(72.dp)
                .clip(CircleShape)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(text = user.name + "  ", fontSize = 16.sp)
                Image(
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = "Plus",
                    modifier = Modifier
                        .size(16.dp)
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = user.city + ", " + user.country,
                    color = Color.Gray,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(top = 4.dp, bottom = 4.dp)
                )
            }
            Text(
                text = user.info, textAlign = TextAlign.Center, modifier = Modifier
                    .padding(16.dp)
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.posts),
                        contentDescription = "User Avatar",
                        modifier = Modifier
                            .size(22.dp)
                            .align(alignment = CenterHorizontally)
                    )
                    Row {
                        Text(
                            text = user.posts.toString() + " " + "posts",
                            fontSize = 12.sp,
                            color = Color.Gray,
                        )
                    }
                }
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.folowing),
                        contentDescription = null,
                        modifier = Modifier
                            .size(22.dp)
                            .align(alignment = CenterHorizontally)
                    )
                    Row {
                        Text(
                            text = user.folowing.toString() + " " + "folowing",
                            fontSize = 12.sp,
                            color = Color.Gray,
                        )
                    }
                }
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.folowers),
                        contentDescription = null,
                        modifier = Modifier
                            .size(22.dp)
                            .align(alignment = CenterHorizontally)
                    )
                    Row {
                        Text(
                            text = user.folowers.toString() + " " + "folowers",
                            fontSize = 12.sp,
                            color = Color.Gray,
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun ProfilePreview() {
    Lab1Theme {
        Profile(user = UserProfile.example)
    }
}
