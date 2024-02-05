package com.example.nellamaster.HelpScreens

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.BottomNavBar
import com.example.nellamaster.HelpScreens.ui.theme.NellaMasterTheme
import com.example.nellamaster.R
import com.example.nellamaster.ui.theme.Gopher
import com.example.nellamaster.ui.theme.Metropolis

class HelpLandingScreen : ComponentActivity() {
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
fun HelpLandingScreenBuilder(
    navController: NavController,
    onNavigateToTechSupport: () -> Unit,
    onNavigateToAboutScreen: () -> Unit,
    onNavigateToAppNutzung: () -> Unit
) {
    Scaffold(
        bottomBar = {
            BottomNavBar(navController = navController)
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .paint(
                    painter = painterResource(id = R.drawable.background_7_3),
                    contentScale = ContentScale.FillBounds
                )
                .background(
                    Brush.verticalGradient(
                        listOf(Color.Transparent, Color.White),
                        0f,
                        1500f
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.45f)
                    .align(Alignment.BottomCenter),
                verticalArrangement = Arrangement.Top
            ) {
                Text(
                    text = "Need help?",
                    fontFamily = Gopher,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = colorResource(id = R.color.teal),
                    modifier = Modifier
                        .padding(start = 30.dp)
                )
                Text(
                    text = "Come and get it",
                    fontFamily = Gopher,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = colorResource(id = R.color.salmon),
                    modifier = Modifier
                        .padding(start = 60.dp)
                )
                Button(
                    onClick = onNavigateToTechSupport,
                    shape = RoundedCornerShape(20),
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.teal)),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 30.dp)
                        .width(350.dp)
                ) {
                    Text(
                        text = "Technischer Support",
                        fontFamily = Metropolis,
                        fontSize = 15.sp,
                        color = colorResource(id = R.color.salmon),
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
                Button(
                    onClick = onNavigateToAboutScreen,
                    shape = RoundedCornerShape(20),
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.teal)),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 12.dp)
                        .width(350.dp)
                ) {
                    Text(
                        text = "Hinweise zum ARtifacts-Projekt",
                        fontFamily = Metropolis,
                        fontSize = 15.sp,
                        color = colorResource(id = R.color.salmon),
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
                Button(
                    onClick = onNavigateToAppNutzung,
                    shape = RoundedCornerShape(20),
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.teal)),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 12.dp)
                        .width(350.dp)
                ) {
                    Text(
                        text = "Anleitung zur Appnutzung",
                        fontFamily = Metropolis,
                        fontSize = 15.sp,
                        color = colorResource(id = R.color.salmon),
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun HelpLandingScreenPreview() {
    HelpLandingScreenBuilder(navController = rememberNavController(), onNavigateToTechSupport = {}, onNavigateToAboutScreen = {}, onNavigateToAppNutzung = {})
}



