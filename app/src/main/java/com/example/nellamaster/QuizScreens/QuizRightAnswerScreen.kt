package com.example.nellamaster.QuizScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.ArrowRight
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
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
import com.example.nellamaster.R
import com.example.nellamaster.ui.theme.IvyOra
import com.example.nellamaster.ui.theme.Metropolis

@Composable
fun RightAnswerScreenBuilder(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.bone))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, top = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    imageVector = Icons.Outlined.KeyboardArrowLeft,
                    contentDescription = "",
                    tint = colorResource(id = R.color.charcoal),
                    modifier = Modifier
                        .size(40.dp)
                )
            }
            Text(
                text = "Jugendstil-Quiz",
                fontFamily = Metropolis,
                fontSize = 36.sp,
                color = colorResource(id = R.color.charcoal),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(CenterHorizontally)
                    .padding(top = 16.dp, bottom = 40.dp)
            )
            Box(
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxWidth()
                    .height(300.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.well_done),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .scale(1.1f)
                        .padding(bottom = 8.dp)
                )
                Text(
                    text = "yeah",
                    fontFamily = IvyOra,
                    fontSize = 37.sp,
                    color = colorResource(id = R.color.salmon),
                    modifier = Modifier
                        .padding(start = 30.dp, top = 8.dp)
                )
                Text(
                    text = "very nice",
                    fontFamily = IvyOra,
                    fontSize = 36.sp,
                    color = colorResource(id = R.color.salmon),
                    modifier = Modifier
                        .padding(start = 220.dp, top = 60.dp)
                )
            }
            Spacer(modifier = Modifier.height(28.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .background(color = Color.White)
            ) {
                Column(
                    modifier = Modifier
                ) {
                    Text(
                        text = "HURRA!",
                        fontFamily = Metropolis,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.Green),
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 24.dp)
                    )
                    Text(
                        text = "Das war richtig",
                        fontFamily = Metropolis,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.Green),
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 0.dp)
                    )
                    Text(
                        text = "Infotext Antwort Infotext Antwort Infotext Antwort Infotext Antwort Infotext Antwort Infotext Antwort Infotext Antwort Infotext Antwort",
                        fontFamily = Metropolis,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 42.dp, end = 42.dp, top = 12.dp)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = "Weiter",
                    fontFamily = Metropolis,
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.teal),
                    modifier = Modifier
                        .padding(end = 8.dp)
                )
                Icon(
                    imageVector = Icons.Outlined.ArrowForward,
                    contentDescription = null,
                    tint = colorResource(id = R.color.teal),
                    modifier = Modifier
                        .padding(end = 8.dp)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            BottomNavBar(navController = navController)
        }
    }
}

@Preview (showBackground = true)
@Composable
fun RightAnswerPreview () {
    RightAnswerScreenBuilder(navController = rememberNavController())
}