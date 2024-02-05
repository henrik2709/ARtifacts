package com.example.nellamaster.FullScreens

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.FullScreenBuilder
import com.example.nellamaster.R

@Composable
fun ModerneFullScreenBuilder(navController: NavController) {
    FullScreenBuilder(
        painter = painterResource(id = R.drawable.plakat_design_moderne_7),
        animation = R.drawable.ani_moderne_optimized,
        title = "Moderne" ,
        navController = navController
    )
}

@Preview
@Composable
fun ModerneFullPreview() {
   ModerneFullScreenBuilder(navController = rememberNavController())
}