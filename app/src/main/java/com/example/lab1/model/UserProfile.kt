package com.example.lab1.model

import com.example.lab1.R

data class UserProfile(
    val id: Int,
    val name: String,
    val avatar: Int,
    val city: String,
    val country: String,
    val info: String,
    val posts: Int,
    val folowers: Int,
    val folowing: Int,
) {
    companion object {
        val example = UserProfile(
            1,
            "Pablo Escobar",
            R.drawable.first_avatar,
            "Kyiv",
            "Ukraine",
            "Hello I'm Illia, and this is my first lab in Android Studio",
            132,
            100,
            100
        )
    }
}
