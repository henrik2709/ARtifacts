package com.example.nellamaster.FullScreens

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.FullScreenBuilder
import com.example.nellamaster.R

@Composable
fun OrientFullScreenBuilder(navController: NavController) {
    FullScreenBuilder(
        painter = painterResource(id = R.drawable.orient_berarbeitet_4),
        animation = R.drawable.ani_orient_optimized,
        title = "Orient",
        navController = navController
    )
}

@Preview
@Composable
fun OrientFullPreview() {
    OrientFullScreenBuilder(navController = rememberNavController())
}