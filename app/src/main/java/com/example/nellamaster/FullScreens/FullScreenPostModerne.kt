package com.example.nellamaster.FullScreens

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.FullScreenBuilder
import com.example.nellamaster.R

@Composable
fun PostmoderneFullScreenBuilder(navController: NavController) {
    FullScreenBuilder(
        painter = painterResource(id = R.drawable.plakat_design_postmoderne__berarbeitet),
        animation = R.drawable.ani_postmoderne_optimized,
        title = "Postmoderne",
        navController = navController
    )
}

@Preview
@Composable
fun PostmoderneFullPreview() {
    PostmoderneFullScreenBuilder(navController = rememberNavController())
}