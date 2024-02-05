package com.example.nellamaster.FullScreens

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.FullScreenBuilder
import com.example.nellamaster.R

@Composable
fun BarockFullScreenBuilder(navController: NavController) {
    FullScreenBuilder(
        painter = painterResource(id = R.drawable.finalbarock_4),
        animation = R.drawable.ani_barock_optimized,
        title = "Barock",
        navController = navController
    )
}

@Preview
@Composable
fun BarockFullPreview() {
    BarockFullScreenBuilder(navController = rememberNavController())
}