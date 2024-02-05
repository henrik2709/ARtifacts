package com.example.nellamaster.welcomeScreens

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nellamaster.Additional.PageCounterBuilder
import com.example.nellamaster.R
import com.example.nellamaster.ui.theme.Gopher
import com.example.nellamaster.ui.theme.IvyOra
import com.example.nellamaster.ui.theme.Metropolis
import com.example.nellamaster.ui.theme.NellaMasterTheme

class WelcomScreen2 : ComponentActivity() {
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
fun WelcomeScreen2Builder(
    onNavigateToWelcomeScreen3: () -> Unit
) {
    Scaffold(
        bottomBar = {
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = onNavigateToWelcomeScreen3,
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.teal)),
                    shape = RoundedCornerShape(20),
                    modifier = Modifier
                        .width(300.dp)
                        .height(50.dp)

                ) {
                    Text(
                        text = "Weiter",
                        fontSize = 18.sp,
                        color = colorResource(id = R.color.white)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                PageCounterBuilder(current = 2)
                Spacer(modifier = Modifier.height(50.dp))
            }

        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .paint(
                    painter = painterResource(id = R.drawable.background_1),
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
                    Image(
                        painter = painterResource(id = R.drawable.bild_xd_karten_square),
                        contentDescription = "",
                        modifier = Modifier
                            .align(Alignment.CenterEnd)
                            .scale(1f)
                            .padding(top = 8.dp)
                    )
                    Text(
                        text = "1",
                        fontFamily = IvyOra,
                        fontSize = 120.sp,
                        color = colorResource(id = R.color.teal),
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .padding(start = 28.dp, bottom = 8.dp)
                    )
                    Text(
                        text = "Die",
                        fontFamily = Gopher,
                        fontWeight = FontWeight.Bold,
                        fontSize = 50.sp,
                        color = colorResource(id = R.color.teal),
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .padding(start = 72.dp, bottom = 72.dp)
                    )
                    Text(
                        text = "Karten",
                        fontFamily = Gopher,
                        fontWeight = FontWeight.Bold,
                        fontSize = 50.sp,
                        color = colorResource(id = R.color.teal),
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(start = 16.dp, bottom = 28.dp)
                    )
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
                            text = "Die neun Motive",
                            fontFamily = Metropolis,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.charcoal),
                            modifier = Modifier
                                .padding(top = 40.dp)
                        )
                        Text(
                            text = stringResource(id = R.string.WelcomeScreen2Text),
                            fontFamily = Metropolis,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            color = colorResource(id = R.color.charcoal),
                            lineHeight = 20.sp,
                            modifier = Modifier
                                .padding(start = 20.dp, end = 20.dp, top = 8.dp, bottom = 16.dp)

                        )

                    }
                }
            }
        }
    }

}

@Composable
@Preview
fun WelcomScreen2Preview() {
    WelcomeScreen2Builder(onNavigateToWelcomeScreen3 = {})
}
