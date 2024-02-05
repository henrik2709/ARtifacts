package com.example.nellamaster.FullScreens

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.FullScreenBuilder
import com.example.nellamaster.R

@Composable
fun GotikFullScreenBuilder(navController: NavController) {
    FullScreenBuilder(
        painter = painterResource(id = R.drawable.finalgotikfenster__berarbeitet_4),
        animation = R.drawable.ani_gotik_optimized,
        title = "Gotik",
        navController = navController
    )
}

@Preview(showBackground = true)
@Composable
fun GotikFullPreview() {
    GotikFullScreenBuilder(navController = rememberNavController())
}