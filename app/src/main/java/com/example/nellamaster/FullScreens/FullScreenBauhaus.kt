package com.example.nellamaster.FullScreens

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.FullScreenBuilder
import com.example.nellamaster.R

@Composable
fun BauhausFullScreenBuilder(navController: NavController) {
    FullScreenBuilder(
        painter = painterResource(id = R.drawable.final_plakat_design_bauhaus____berarbeitet),
        animation = R.drawable.ani_bauhaus,
        title = "Bauhaus",
        navController = navController
    )
}

@Preview
@Composable
fun BauhausFullPreview() {
    BauhausFullScreenBuilder(navController = rememberNavController())
}