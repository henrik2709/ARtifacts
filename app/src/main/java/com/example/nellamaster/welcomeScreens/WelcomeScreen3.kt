package com.example.nellamaster.welcomeScreens

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.runtime.ComposableOpenTarget
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
import com.example.nellamaster.welcomeScreens.ui.theme.NellaMasterTheme

class WelcomeScreen3 : ComponentActivity() {
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
fun WelcomeScreen3Builder(
    onNavigateToWelcomeScreen4: () -> Unit
) {
    Scaffold(
        bottomBar = {
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = onNavigateToWelcomeScreen4,
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
                PageCounterBuilder(current = 3)
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
                        painter = painterResource(id = R.drawable.bild_xd_scan_square),
                        contentDescription = "",
                        modifier = Modifier
                            .align(Alignment.CenterEnd)
                            .scale(1f)
                            .padding(top = 8.dp)
                    )
                    Text(
                        text = "2",
                        fontFamily = IvyOra,
                        fontSize = 120.sp,
                        color = colorResource(id = R.color.teal),
                        modifier = Modifier
                            .align(Alignment.CenterStart)
                            .padding(start = 28.dp, bottom = 100.dp)
                    )
                    Text(
                        text = "Scan-",
                        fontFamily = Gopher,
                        fontWeight = FontWeight.Bold,
                        fontSize = 50.sp,
                        color = colorResource(id = R.color.teal),
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .padding(start = 28.dp, bottom = 72.dp)
                    )
                    Text(
                        text = "vorgang",
                        fontFamily = Gopher,
                        fontWeight = FontWeight.Bold,
                        fontSize = 50.sp,
                        color = colorResource(id = R.color.teal),
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .padding(start = 44.dp, bottom = 28.dp)
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
                        modifier = Modifier,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Der digitale Part",
                            fontFamily = Metropolis,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.charcoal),
                            modifier = Modifier
                                .padding(top = 40.dp)
                        )
                        Text(
                            text = stringResource(id = R.string.WelcomeScreen3Text),
                            fontFamily = Metropolis,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            color = colorResource(id = R.color.charcoal),
                            lineHeight = 20.sp,
                            modifier = Modifier
                                .padding(start = 40.dp, end = 40.dp, top = 8.dp, bottom = 16.dp)

                        )
                    }
                }
            }
        }
    }


}

@Composable
@Preview
fun WelcomeScreen3Preview() {
    WelcomeScreen3Builder(onNavigateToWelcomeScreen4 = {})
}