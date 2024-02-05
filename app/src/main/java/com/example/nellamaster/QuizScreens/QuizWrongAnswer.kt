package com.example.nellamaster.QuizScreens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.BottomNavBar
import com.example.nellamaster.R
import com.example.nellamaster.ui.theme.IvyOra
import com.example.nellamaster.ui.theme.Metropolis

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun WrongAnswerScreen(
    navController: NavController,
    onNavigateToNextQuestion: () -> Unit
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
                    painter = painterResource(id = R.drawable.background_2),
                    contentScale = ContentScale.FillBounds
                )
                .background(
                    Brush.verticalGradient(
                        listOf(Color.Transparent, Color.White),
                        0f,
                        1400f,
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.8f)
                    .align(Alignment.BottomCenter)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.5f)
                        .background(
                            color = Color.White
                        )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ok_to_cry_squared),
                            contentDescription = "",
                            modifier = Modifier
                                .scale(0.82f)
                                .align(Alignment.Center)
                        )
                        Text(
                            text = "to cry",
                            fontFamily = IvyOra,
                            fontSize = 40.sp,
                            color = colorResource(id = R.color.salmon),
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                        )
                        Text(
                            text = "it's okay",
                            fontFamily = IvyOra,
                            fontSize = 40.sp,
                            color = colorResource(id = R.color.teal),
                            modifier = Modifier
                                .align(Alignment.TopStart)
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(
                            color = colorResource(id = R.color.bone)
                        )
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top
                    ) {
                        Text(
                            text = "DAS WAR LEIDER FALSCH",
                            fontFamily = Metropolis,
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.charcoal),
                            modifier = Modifier
                                .padding(top = 50.dp)
                        )
                        Text(
                            text = "Diese Frage hast du leider\nfalsch beantwortet. Du kannst\nes aber bei der nächsten\neinfach wieder gut machen!",
                            fontFamily = Metropolis,
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center,
                            color = colorResource(id = R.color.charcoal),
                            lineHeight = 20.sp,
                            modifier = Modifier
                                .padding(top = 16.dp, bottom = 20.dp)

                        )
                        Text(
                            text = "Weiter zur nächsten Frage",
                            fontFamily = Metropolis,
                            fontSize = 17.sp,
                            color = colorResource(id = R.color.Green),
                            textDecoration = TextDecoration.Underline,
                            modifier = Modifier
                                .clickable(onClick = onNavigateToNextQuestion)
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun WrongAnswerPreview() {
    WrongAnswerScreen(rememberNavController(), onNavigateToNextQuestion = {})
}