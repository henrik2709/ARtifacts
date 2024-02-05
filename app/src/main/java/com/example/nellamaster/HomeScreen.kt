package com.example.nellamaster

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ScaleFactor
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.ui.theme.NellaMasterTheme
/**
class HomeScreen : ComponentActivity() {
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
fun HomeScreenBuilder(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
    ) {

        EpochSelection(epochs = listOf(
            Epoch(
                painter = painterResource(id = R.drawable.barock_3_sklaiert),
                contentDescription = "Renaissance",
                title = "REANISSANCE",
                date = "1500-1600",
                modifier = Modifier
                    .padding(
                        top = 4.dp,
                        bottom = 4.dp
                    )
                    .clickable {
                        navController.navigate(Screen.RenaissanceScreen.route)
                    }
            ),
            Epoch(
                painter = painterResource(id = R.drawable.barock_3_sklaiert),
                contentDescription = "Barock",
                title = "BAROCK",
                date = "1600-1730",
                Modifier
                    .padding(
                        top = 4.dp,
                        bottom = 4.dp
                    )
                    .clickable {
                        navController.navigate(Screen.BarockScreen.route)
                    }
            ),
            Epoch(
                painterResource(id = R.drawable.gotikfenster__berarbeitet2_skaliert_klein),
                contentDescription = "Klassizismus",
                title = "KLASSIZISMUS",
                date = "1770-1830",
                modifier = Modifier
                    .padding(
                        top = 4.dp,
                        bottom = 4.dp
                    )
                    .clickable {
                        navController.navigate(Screen.KlassizismusScreen.route)
                    }
            ),
            Epoch(
                painterResource(id = R.drawable.jugendstil_skaliert),
                contentDescription = "Jugenstil",
                title = "JUGENDSTIL",
                date = "1890-1910",
                modifier = Modifier
                    .padding(
                        top = 4.dp,
                        bottom = 4.dp
                    )
                    .clickable {
                        navController.navigate(Screen.JugenstilScreen.route)
                    }
            ),
            Epoch(
                painterResource(id = R.drawable.plakat_design_bauhaus_skaliert),
                contentDescription = "Bauhaus",
                title = "BAUHAUS",
                date = "1919-1933",
                Modifier
                    .padding(
                        top = 4.dp,
                        bottom = 4.dp
                    )
                    .clickable {
                        navController.navigate(Screen.BauhausScreen.route)
                    }
            ),
            Epoch(
                painterResource(id = R.drawable.asien_skaliert),
                contentDescription = "Japanmuster",
                title = "JAPANISCH",
                date = "",
                Modifier
                    .padding(
                        top = 4.dp,
                        bottom = 4.dp
                    )
                    .clickable {
                        navController.navigate(Screen.JapanScreen.route)
                    }
            ),
            Epoch(
                painterResource(id = R.drawable.orient_skaliert),
                contentDescription = "Indiches Muster",
                title = "INDISCH",
                date = "",
                Modifier
                    .padding(
                        top = 4.dp,
                        bottom = 4.dp
                    )
                    .clickable {
                        navController.navigate(Screen.IndischScreen.route)
                    }
            )
        )
        )


        Box(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(
                start = 22.dp,
                top = 8.dp,
                bottom = 8.dp
            )
        ) {
            AlleAnsehen()
        }

        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
        ) {
            QuizButton(painter = painterResource(id = R.drawable.postmoderne_skaliert), text = "AUF ZUM QUIZ")
        }

    }


}

@Composable
fun ImageCard(
    epoch: Epoch,
    modifier: Modifier = Modifier
) {
    Card (
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(1.dp, Color.Black)
    ) {
        Box(modifier = Modifier
            .height(150.dp)
        ) {
            Image(
                painter = epoch.painter,
                contentDescription = epoch.contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                )
            )
            Box (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                contentAlignment = Alignment.BottomCenter
            ){
                Text(epoch.title, style = TextStyle(color = Color.White, fontSize = 16.sp ))
            }

            Box (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomCenter
            ){
                Text(epoch.date, style = TextStyle(color = Color.White, fontSize = 8.sp))
            }

        }
    }
}

@Composable
fun EpochSelection (epochs: List<Epoch>) {
    Column(modifier = Modifier.fillMaxWidth()) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(
                start = 12.dp,
                top = 16.dp,
                end = 12.dp,
                bottom = 16.dp
            ),
            content = {
                items(epochs.size) {
                    ImageCard(epoch = epochs[it]);
                }
            }
        )
    }
}



@Composable
fun AlleAnsehen() {
    Text(
        text = "Alle ansehen...",
        style = TextStyle(color = Color.Blue, fontSize = 18.sp),
        modifier = Modifier
            .clickable { /*TODO*/ }
    )
}

@Composable
fun QuizButton(
    painter: Painter,
    text: String
) {
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(8.dp)
            .wrapContentHeight(),
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(1.dp, Color.Black)
    ) {
        Row(modifier = Modifier) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .fillMaxHeight()
                    .padding(12.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(text = text, style = TextStyle(color = Color.Black, fontSize = 30.sp))
            }
            Box(
                modifier = Modifier
                    .wrapContentSize(),
                contentAlignment = Alignment.CenterEnd
            ) {
                Image(painter = painter, contentDescription = null, alpha = 0.5f)
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    NellaMasterTheme {
        HomeScreenBuilder(rememberNavController());
    }
}
        */