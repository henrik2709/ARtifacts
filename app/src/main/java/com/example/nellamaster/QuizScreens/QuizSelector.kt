package com.example.nellamaster.QuizScreens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
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
import com.example.nellamaster.ImageCard
import com.example.nellamaster.QuizScreens.ui.theme.NellaMasterTheme
import com.example.nellamaster.R
import com.example.nellamaster.ui.theme.Gopher
import com.example.nellamaster.ui.theme.IvyOra
import com.example.nellamaster.ui.theme.Metropolis

class QuizSelector : ComponentActivity() {
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
fun QuizSelectorBuilder(
    navController: NavController,
    onNavigationToQuizJugendstil: () -> Unit,
    onNavigationToQuizBauhaus: () -> Unit,
    onNavigationToQuizJapan: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(id = R.drawable.background_4),
                contentScale = ContentScale.FillBounds,
                alpha = 1f
            )
            .background(
                Brush.verticalGradient(
                    listOf(Color.Transparent, Color.White),
                    0f,
                    1000f
                )
            )
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
                text = "Teste dein Wissen",
                fontFamily = Gopher,
                fontSize = 50.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.teal),
                lineHeight = 50.sp,
                modifier = Modifier
                    .padding(start = 40.dp, top = 30.dp)
            )
            Text(
                text = "Na, alle Infos aufgesaugt? Dann ran an die Fragen und dein Können test!",
                fontFamily = Metropolis,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = colorResource(id = R.color.charcoal),
                modifier = Modifier
                    .padding(start = 40.dp, end = 50.dp)
            )
            Row (
                modifier = Modifier
                    .padding(start = 20.dp, top = 30.dp)
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ){
                CategoryCard(painter = painterResource(id = R.drawable.jugendstil_skaliert), number = "1" , "Jugendstil", onNavigationToQuizJugendstil)
                CategoryCard(painter = painterResource(id = R.drawable.plakat_design_bauhaus_skaliert), number = "2", category = "Bauhaus", onNavigationToQuizBauhaus)
                CategoryCard(painter = painterResource(id = R.drawable.asien_skaliert), number = "3", category = "Asiatisch", onNavigationToQuizJapan)
            }
            Spacer(modifier = Modifier.weight(1f))
            BottomNavBar(navController = navController)
        }
    }
}

@Composable
fun CategoryCard(
    painter: Painter,
    number: String,
    category: String,
    onNavigationToQuiz: () -> Unit
) {
    Column(
        modifier = Modifier
            .width(288.dp)
            .padding(start = 12.dp, end = 12.dp)
    ) {
        Box(
            modifier = Modifier
                .width(288.dp)
        ) {
            OutlinedCard(
                modifier = Modifier
                    .border(2.dp, color = colorResource(id = R.color.teal), shape = RoundedCornerShape(5))
            ) {
                Image(painter = painter, contentDescription = null)
            }
            Text(
                text = number,
                fontFamily = IvyOra,
                fontSize = 80.sp,
                fontWeight = FontWeight.Thin,
                color = colorResource(id = R.color.teal),
                modifier = Modifier
                    .padding(start = 15.dp)
            )
        }
        Button(
            onClick = onNavigationToQuiz,
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white)),
            border = BorderStroke(width = 1.dp, color = colorResource(id = R.color.charcoal)),
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier
                .height(45.dp)
                .padding(top = 12.dp)
        ) {
            Text(
                text = "Zum " + category + "-Quiz",
                fontFamily = Metropolis,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = colorResource(id = R.color.charcoal),
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }

}

@Preview
@Composable
fun QuizSelectorPreview() {
    QuizSelectorBuilder(navController = rememberNavController(), onNavigationToQuizBauhaus = {}, onNavigationToQuizJugendstil = {}, onNavigationToQuizJapan = {})
}

