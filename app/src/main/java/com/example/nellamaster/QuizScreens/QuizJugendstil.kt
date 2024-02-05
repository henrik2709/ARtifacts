package com.example.nellamaster.QuizScreens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.booleanResource
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.Additional.PageShortCounterBuilder
import com.example.nellamaster.BottomNavBar
import com.example.nellamaster.QuizScreens.ui.theme.NellaMasterTheme
import com.example.nellamaster.R
import com.example.nellamaster.ui.theme.Metropolis

class QuizJugendstil : ComponentActivity() {
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
fun QuizJugendstilBuilder(
    navController: NavController,
    onRightAnswerSelected: () -> Unit,
    onWrongAnswer: () -> Unit
) {
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
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    imageVector = Icons.Filled.KeyboardArrowLeft,
                    contentDescription = null,
                    tint = colorResource(id = R.color.teal),
                    modifier = Modifier
                        .size(40.dp)

                )
            }
            Text(
                text = "Jugendstil-Quiz",
                fontFamily = Metropolis,
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal,
                color = colorResource(id = R.color.charcoal),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 8.dp)
            )
            PageShortCounterBuilder(current = 1)
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .background(color = colorResource(id = R.color.white))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.gruppe_8233),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(210.dp)
                            .padding(top = 12.dp)
                    )
                    Text(
                        text = "Die Motive des Jugendstils lasen sich nicht einheitlich beschreiben, da es zwei verschiedene Stile gab. Welche sind dies?",
                        fontFamily = Metropolis,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 16.dp, end = 16.dp, top = 12.dp)
                    )
                }
            }
            Column(
                modifier = Modifier
            ) {
                Row(
                    modifier = Modifier
                        .padding(top = 12.dp)
                ) {
                    AnswerCard(text = "Gotische \nLinienführung und konstruierte Reduktion", false, onWrongAnswer)
                    AnswerCard(text = "Floraly Mystik und geradlinige halb-\nFunktionalismus Kreation", true, onRightAnswerSelected)
                }
                Row(
                    modifier = Modifier
                ) {
                    AnswerCard(text = "Realistische Blumen und wilde \nGrundform", false, onWrongAnswer)
                    AnswerCard(text = "Alle Linien waren ausschließlich schwungvoll", false, onWrongAnswer)
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "Überspringen",
                    fontFamily = Metropolis,
                    fontSize = 11.sp,
                    color = colorResource(id = R.color.teal)
                )
                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = null,
                    tint = colorResource(id = R.color.teal),
                    modifier = Modifier
                        .padding(end = 4.dp)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            BottomNavBar(navController = navController)
        }

    }
}

@Composable
fun AnswerCard(
    text: String,
    isCorrect: Boolean,
    onRightAnswerSelected: () -> Unit
) {
    val color = if (isCorrect) Color.Green else Color.Red
    val width = 0.dp
    var answered = false
    val borderColor = remember { mutableStateOf(Color.Transparent)}

    Card(
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = R.color.white)
        ),
        modifier = Modifier
            .height(125.dp)
            .width(200.dp)
            .padding(top = 10.dp, bottom = 10.dp, start = 10.dp, end = 10.dp)
            .border(2.dp, color = borderColor.value, shape = RoundedCornerShape(10))
            .clickable(onClick = {
                onRightAnswerSelected()
                borderColor.value = color
            })
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp)
        ) {
            Text(
                text = text,
                fontFamily = Metropolis,
                fontSize = 16.sp,
                color = colorResource(id = R.color.charcoal),
                textAlign = TextAlign.Center,
                modifier = Modifier
                //.padding(top = 16.dp, bottom = 16.dp, start = 8.dp, end = 8.dp)
            )
        }
    }
}

@Composable
fun AnswerCard(
    text: String,
    isCorrect: Boolean
) {
    val color = if (isCorrect) Color.Green else Color.Red
    val width = 0.dp
    var answered = false
    val borderColor = remember { mutableStateOf(Color.Transparent)}

    Card(
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = R.color.white)
        ),
        modifier = Modifier
            .height(125.dp)
            .width(200.dp)
            .padding(top = 10.dp, bottom = 10.dp, start = 10.dp, end = 10.dp)
            .border(2.dp, color = borderColor.value, shape = RoundedCornerShape(10))
            .clickable {
                borderColor.value = color
            }
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp)
        ) {
            Text(
                text = text,
                fontFamily = Metropolis,
                fontSize = 16.sp,
                color = colorResource(id = R.color.charcoal),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    //.padding(top = 16.dp, bottom = 16.dp, start = 8.dp, end = 8.dp)
            )
        }
    }
}

@Preview
@Composable
fun QuizJugendstilPreview() {
    QuizJugendstilBuilder(rememberNavController(), onRightAnswerSelected = {}, onWrongAnswer = {})
}