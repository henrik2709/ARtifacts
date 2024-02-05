package com.example.nellamaster.FullScreens

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.FullScreenBuilder
import com.example.nellamaster.R

@Composable
fun RomFullScreenBuilder(navController: NavController) {
    FullScreenBuilder(
        painter = painterResource(id = R.drawable.plakat_design_griech__r_m_final),
        animation = R.drawable.ani_rom,
        title = "Römisch/Griechisch",
        navController = navController
    )
}

@Preview
@Composable
fun RomFullPreview() {
    RomFullScreenBuilder(navController = rememberNavController())
}