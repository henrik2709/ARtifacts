package com.example.nellamaster.Base

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBarScaffold(
    content: Unit
) {
    Scaffold(
        bottomBar = {
            BottomBar()
        },

    ) {
        content
    }
}