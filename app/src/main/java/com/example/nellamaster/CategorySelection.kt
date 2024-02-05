package com.example.nellamaster

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
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
import com.example.nellamaster.QuizScreens.QuizSelector
import com.example.nellamaster.ui.theme.NellaMasterTheme


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CategorySelectionMaker(
    navController: NavController,
    onNavigateToArchitectureInterior: () -> Unit,
    onNavigateToKunstHandwerk: () -> Unit,
    onNavigateToGrafikdesignPrint: () -> Unit,
    onNavigateToQuizSelector: () -> Unit
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
                    painter = painterResource(id = R.drawable.background_5_2),
                    contentScale = ContentScale.FillBounds,
                    alpha = 0.15f
                )

        ) {
            Column(modifier = Modifier
                .fillMaxSize()
            ) {
                Text(text = "Wähle eine Kategorie",
                    style = MaterialTheme.typography.headlineLarge,
                    color = colorResource(id = R.color.teal),
                    modifier = Modifier
                        .padding(start = 30.dp, top = 50.dp, end = 20.dp, bottom = 10.dp)
                )
                Category(
                    painter = painterResource(id = R.drawable.architektur_interior),
                    text = "Architektur/" + "\n" + "Interior",
                    onNavigateToSubCat = onNavigateToArchitectureInterior

                )
                Category(
                    painter = painterResource(id = R.drawable.kunst_handwerk),
                    text = "Kunst/" + "\n" + "Handwerk",
                    onNavigateToSubCat = onNavigateToKunstHandwerk
                )
                Category(
                    painter = painterResource(id = R.drawable.grafikdesign_print),
                    text = "Grafikdesign/" + "\n" + "Print",
                    onNavigateToSubCat = onNavigateToGrafikdesignPrint
                )
                CategoryQuiz(onNavigateToQuizSelector)

            }
        }

    }
}

@Composable
fun Category(
    painter: Painter,
    text: String,
    onNavigateToSubCat: () -> Unit
) {
    Row(Modifier.fillMaxWidth()) {
        OutlinedButton(
            onClick = onNavigateToSubCat,
            modifier = Modifier
                .size(150.dp)
                .padding(start = 30.dp, end = 0.dp, top = 15.dp, bottom = 10.dp)
                .fillMaxWidth(0.5f)
                .background(
                    color = Color.White,
                    shape = CircleShape
                ),
            shape = CircleShape,
            border = BorderStroke(1.75.dp, color = colorResource(id = R.color.teal)),
            contentPadding = PaddingValues(0.dp),

        ) {
            Image(painter = painter, contentDescription = "")
        }
        Text(
            text = text,
            style = MaterialTheme.typography.headlineMedium,
            color = colorResource(id = R.color.teal),
            fontSize = 30.sp,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .fillMaxWidth()
                .padding(start = 10.dp)
        )
    }
}

@Composable
fun CategoryQuiz(
    onNavigateToQuizSelector: () -> Unit
) {
    Row(Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End
        ) {
        Text(
            text = "Quiz-Time",
            style = MaterialTheme.typography.headlineMedium,
            color = colorResource(id = R.color.teal),
            fontSize = 25.sp,
            textAlign = TextAlign.End,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(end = 10.dp)
        )
        OutlinedButton(
            onClick = onNavigateToQuizSelector,
            modifier = Modifier
                .size(100.dp)
                .padding(start = 0.dp, end = 30.dp, top = 15.dp, bottom = 10.dp)
                .background(
                    color = Color.White,
                    shape = CircleShape
                ),
            shape = CircleShape,
            border = BorderStroke(1.5.dp, color = colorResource(id = R.color.teal)),
            contentPadding = PaddingValues(0.dp),

            ) {
            Image(painter = painterResource(id = R.drawable.quiz_bubble), contentDescription = "")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NellaMasterTheme {
        CategorySelectionMaker(rememberNavController(), onNavigateToArchitectureInterior = {}, onNavigateToGrafikdesignPrint = {}, onNavigateToKunstHandwerk = {}, onNavigateToQuizSelector = {})
    }
}