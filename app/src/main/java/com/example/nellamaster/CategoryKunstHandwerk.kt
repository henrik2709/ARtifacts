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
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
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

class CategoryKunstHandwerk : ComponentActivity() {
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
fun CategoryKunstHandwerkMaker(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomNavBar(navController = navController)
        }
    ){
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
                painter = painterResource(id = R.drawable.background_10),
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
                painter = painterResource(id = R.drawable.linien_strichlinie_gr_n_k_nstlerisch),
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
            Text(text = "Kunst/Handwerk",
                style = MaterialTheme.typography.headlineLarge,
                fontSize = 33.sp,
                color = colorResource(id = R.color.teal),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 100.dp, bottom = 50.dp, start = 40.dp, end = 40.dp)
                    .fillMaxWidth()
            )
            CategoryCard(painter = painterResource(id = R.drawable.finalasien__berarbeitet_4), text = "Asiatisch", navController, Screen.AsienScreen.route, modifier = Modifier)
            CategoryCard(painter = painterResource(id = R.drawable.orient_berarbeitet_4), text = "Orientalisch", navController, Screen.OrientScreen.route, modifier = Modifier)
            CategoryCard(painter = painterResource(id = R.drawable.plakat_design_griech__r_m_final), text = "Griechisch-Römisch", navController, Screen.RomScreen.route, modifier = Modifier)

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    NellaMasterTheme {
        CategoryKunstHandwerkMaker(rememberNavController())
    }
}