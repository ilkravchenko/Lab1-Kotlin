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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
            .fillMaxSize()
            .clip(RoundedCornerShape(percent = 5))
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
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Text(text = user.name + " ", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Image(
                painter = painterResource(id = R.drawable.plus),
                contentDescription = "Plus",
                modifier = Modifier
                    .size(20.dp)
            )
        }
        Text(
            text = user.city + ", " + user.country,
            color = Color.Gray,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(top = 4.dp, bottom = 4.dp)
        )
        Text(
            text = user.info, textAlign = TextAlign.Center, modifier = Modifier
                .padding(top = 16.dp, bottom = 24.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp)
                .fillMaxWidth()
        ) {
            UserInfo(number = user.posts, text = "posts", image = R.drawable.posts)
            UserInfo(number = user.folowing, text = "folowing", image = R.drawable.folowing)
            UserInfo(number = user.folowers, text = "folowers", image = R.drawable.folowers)
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
