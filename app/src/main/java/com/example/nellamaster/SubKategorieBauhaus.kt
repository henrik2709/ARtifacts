package com.example.nellamaster

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.ui.theme.NellaMasterTheme

class SubKategorieBauhaus : ComponentActivity() {
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
fun BauhausSubKategorie(navController: NavController, onNavigateToFullScreen: () -> Unit) {
    CategoryBuilder(
        background = painterResource(id = R.drawable.final_plakat_design_bauhaus____berarbeitet),
        epochName = "Bauhaus",
        subText = "1919 - 1933",
        textTitle = "less is more",
        textBody = stringResource(id = R.string.bauhaus_text),
        navController = navController,
        onNavigateToFullScreen = onNavigateToFullScreen
    )
}

@Preview(showBackground = true)
@Composable
fun BauhausCategoryPreview() {
    BauhausSubKategorie(navController = rememberNavController(), onNavigateToFullScreen = {})
}

