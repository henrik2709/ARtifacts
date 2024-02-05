package com.example.nellamaster

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.Base.BottomBar
import com.example.nellamaster.ui.theme.Metropolis
import com.example.nellamaster.ui.theme.NellaMasterTheme

class CategoryArchitectureInterior : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
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


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnusedMaterialScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryMaker(navController: NavController) {
    androidx.compose.material.Scaffold(
        bottomBar = {
            BottomNavBar(navController = navController)
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = colorResource(id = R.color.bone)
                )
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.background_8),
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
                painter = painterResource(id = R.drawable.linien_karolinie_gr_n),
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
            Text(text = "Architektur/Interior",
                style = MaterialTheme.typography.headlineLarge,
                fontSize = 33.sp,
                color = colorResource(id = R.color.teal),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 100.dp, bottom = 50.dp)
                    .fillMaxWidth()
            )

            CategoryCard(painter = painterResource(id = R.drawable.finalgotikfenster__berarbeitet_4), text = "Gotik", navController, Screen.GotikScreen.route, modifier = Modifier)
            CategoryCard(painter = painterResource(id = R.drawable.finalbarock_4), text = "Barock", navController, Screen.BarockScreen.route, modifier = Modifier)
            CategoryCard(painter = painterResource(id = R.drawable.final_plakat_design_bauhaus____berarbeitet), text = "Bauhaus", navController, Screen.BauhausScreen.route, modifier = Modifier)
        }
    }
}

@Composable
fun CategoryCard(painter: Painter, text: String, navController: NavController, route: String, modifier: Modifier) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 15.dp, bottom = 15.dp),
        shape = RectangleShape,
        border = BorderStroke(1.dp, color = colorResource(id = R.color.light_gray))

    ) {
        Box(modifier = Modifier
            .height(150.dp)
        ) {
            Image(painter = painter, contentDescription = "", alpha = 0.5f, contentScale = ContentScale.Crop, modifier = Modifier.blur(radius =  8.dp))
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable { navController.navigate(route) }
                ,
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = text,
                    color = colorResource(id = R.color.charcoal),
                    fontFamily = Metropolis,
                    fontSize = 25.sp
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    NellaMasterTheme {
        CategoryMaker(rememberNavController())
    }
}