package com.example.nellamaster

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.ui.theme.NellaMasterTheme

class CategoryGrafikdesignPrint : ComponentActivity() {
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

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CategoryGrafikdesignPrintMaker(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomNavBar(navController = navController)
        }
    ) {
        Box(
            modifier = Modifier
                .background(color = colorResource(id = R.color.bone))
                .fillMaxSize()
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.background_7),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.15f
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(187.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Image(
                painter = painterResource(id = R.drawable.linien_wellenlinie_gr_n),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .scale(1.2f),

                )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(text = "Grafikdesign/Print",
                style = MaterialTheme.typography.headlineLarge,
                fontSize = 33.sp,
                color = colorResource(id = R.color.teal),
                modifier = Modifier
                    .padding(top = 100.dp, bottom = 50.dp,)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            CategoryCard(painter = painterResource(id = R.drawable.finaljugendstil__berarbeitet_6), text = "Jugendstil", navController, Screen.JugenstilScreen.route, modifier = Modifier)
            CategoryCard(painter = painterResource(id = R.drawable.plakat_design_postmoderne__berarbeitet), text = "Postmoderne", navController, Screen.PostmoderneSceen.route, modifier = Modifier)
            CategoryCard(painter = painterResource(id = R.drawable.plakat_design_moderne_7), text = "Aktuell", navController, Screen.ModerneScreen.route, modifier = Modifier)

        }

    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    NellaMasterTheme {
        CategoryGrafikdesignPrintMaker(rememberNavController())
    }
}