package com.example.nellamaster

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nellamaster.ui.theme.NellaMasterTheme


class SubKategorie : ComponentActivity() {
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
fun KategorieBuilder(
    painter: Painter,
    headerText: String,
    timeframe: String,
    title: String,
    text: String,
    navController: NavController,
    route: String
) {
    Column(modifier = Modifier) {
        Header(painter = painter, headerText = headerText, timeframe = timeframe, navController = navController, route = route)
        TextField(title = title, text = text)

    }
}
@Composable
fun Header(
    painter: Painter,
    headerText: String,
    timeframe: String,
    modifier: Modifier = Modifier,
    navController: NavController,
    route: String
) {
    Card(modifier = Modifier
        .fillMaxHeight(.40f)
        .fillMaxWidth()
    ) {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(Color.Transparent, Color.White),
                    0f,
                    1400f,
                )
            )
        ) {
            Image(painter = painter,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.3f,
                modifier = Modifier
                    .clickable { navController.navigate(route) }
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(text = headerText, style = TextStyle(Color.Black, fontSize = 40.sp, fontWeight = FontWeight.Bold))
            }
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text(text = timeframe, style = TextStyle(Color.Black, fontSize = 12.sp))
            }
        }
    }
}

@Composable
fun TextField(
    title: String,
    text: String,
    modifier: Modifier = Modifier
    //iconTop: Painter,
    //iconBottom: Painter
) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(0.7f)
        .padding(16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = title, style = TextStyle(Color.Black, fontSize = 30.sp, fontWeight = FontWeight.Bold))
        Text(text = text, style = TextStyle(Color.Black, fontSize = 20.sp))
    }

}

@Composable
fun ScanButton(

){
    Row(modifier = Modifier
        .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,

    ) {
        ElevatedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .height(80.dp)
                .width(80.dp)
            ,
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(

            )
        ) {
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = R.drawable.scan), contentDescription = null,)
                Text(text = "SCAN", fontSize = 8.sp,)
            }
        }
    }
}

@Preview
@Composable
fun SubKategoriePreview() {

}