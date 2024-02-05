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
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.example.nellamaster.Additional.PageShortCounterBuilder
import com.example.nellamaster.BottomNavBar
import com.example.nellamaster.R
import com.example.nellamaster.ui.theme.Metropolis

@Composable
fun QuizJapanBuilder(
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
                text = "INNOVATIVE STILISTIK",
                fontFamily = Metropolis,
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal,
                color = colorResource(id = R.color.charcoal),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 8.dp)
            )
            PageShortCounterBuilder(current = 2)
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
                        painter = painterResource(id = R.drawable.gruppe_8232),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(210.dp)
                            .padding(top = 12.dp)
                    )
                    Text(
                        text = "Welche Gestaltungsmittel fanden erst mit der\nÖffnung Japans und dem Export von\nKunstgegenständen Einzug in Europa?",
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
                    AnswerCard(text = "Strenge Symmetrien\nund zentrale\nBildausrichtungen", false, onWrongAnswer)
                    AnswerCard(text = "Spiegelgleiche\nMotive und\nfarbenreiche\nHintergründe", false, onWrongAnswer)
                }
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    AnswerCard(text = "Ungewöhnliche\nPerspektiven und\nangeschnittene", true, onRightAnswerSelected)
                    AnswerCard(text = "Anlehnungen an\nvergangene\nEpochen-Stile", false, onWrongAnswer)
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

@Preview
@Composable
fun QuizJapanPreview() {
    QuizJapanBuilder(rememberNavController(), onRightAnswerSelected = {}, onWrongAnswer = {})
}