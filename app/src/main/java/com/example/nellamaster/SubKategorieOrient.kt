package com.example.nellamaster

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.ui.theme.NellaMasterTheme

class SubKategorieOrient : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NellaMasterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun OrientSubKategorie(navController: NavController, onNavigateToFullScreen: () -> Unit) {
    CategoryBuilder(
        background = painterResource(id = R.drawable.orient_berarbeitet_4),
        epochName = "Orient",
        subText = "Indien, Persien...",
        line = painterResource(id = R.drawable.rahmen_orient_4),
        textTitle = "Von Mandala bis Mosaik",
        textBody = stringResource(id = R.string.orientalisch_text),
        navController = navController,
        onNavigateToFullScreen = onNavigateToFullScreen
    )
}

@Composable
@Preview(showBackground = true)
fun SubKategorienPreview() {
    NellaMasterTheme() {
        OrientSubKategorie(rememberNavController(), onNavigateToFullScreen = {})
    }
}

