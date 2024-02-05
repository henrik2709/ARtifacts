package com.example.nellamaster.FullScreens

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.FullScreenBuilder
import com.example.nellamaster.R

@Composable
fun JugendstilFullScreenBuilder(navController: NavController) {
    FullScreenBuilder(
        painter = painterResource(id = R.drawable.finaljugendstil__berarbeitet_6),
        animation = R.drawable.ani_jugendstil,
        title = "Jugendstil",
        navController = navController
    )
}

@Preview (showBackground = true)
@Composable
fun JugendstilFullPreview() {
    JugendstilFullScreenBuilder(navController = rememberNavController())
}