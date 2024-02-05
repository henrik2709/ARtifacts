package com.example.nellamaster.welcomeScreens

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.QuestionMark
import androidx.compose.material.icons.rounded.QuestionMark
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nellamaster.Additional.PageCounterBuilder

import com.example.nellamaster.HelpScreens.HelpLandingScreen
import com.example.nellamaster.R
import com.example.nellamaster.ui.theme.IvyOra
import com.example.nellamaster.ui.theme.Metropolis
import com.example.nellamaster.welcomeScreens.ui.theme.NellaMasterTheme

class ReadyToGoScreen : ComponentActivity() {
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
fun ReadyToGoScreenBuilder(
    onNavigationToCategorySelection: () -> Unit,
    onNavigationToHelpLandingScreen: () -> Unit
) {
    androidx.compose.material.Scaffold(
        bottomBar = {
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = onNavigationToCategorySelection,
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
                PageCounterBuilder(current = 5)
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
                        1800f
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .align(Alignment.BottomCenter)
            ) {
                Box(
                    modifier = Modifier
                        .height(225.dp)
                ) {
                    Text(
                        text = "Ready",
                        fontFamily = IvyOra,
                        style = LocalTextStyle.current.merge(
                            TextStyle(color = colorResource(id = R.color.teal),
                                fontSize = 100.sp,
                                drawStyle = Stroke(width = 13f, join = StrokeJoin.Round)
                            )
                        ),
                        lineHeight = 1.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp)
                            .align(Alignment.TopStart)
                    )
                    Text(
                        text = "to go",
                        fontFamily = IvyOra,
                        style = LocalTextStyle.current.merge(
                            TextStyle(color = colorResource(id = R.color.salmon),
                                fontSize = 100.sp,
                                drawStyle = Stroke(width = 13f, join = StrokeJoin.Round)
                            )
                        ),
                        textAlign = TextAlign.End,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 16.dp)
                            .align(Alignment.BottomEnd)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 60.dp, end = 60.dp, top = 16.dp, bottom = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Rounded.QuestionMark,
                        contentDescription = null,
                        tint = colorResource(id = R.color.light_gray),
                        modifier = Modifier
                            .padding(end = 8.dp)
                    )
                    Text(
                        text = "Weitere Hinweise findest du im \nHilsbereich oder im Menü",
                        fontFamily = Metropolis,
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.Underline,
                        color = colorResource(id = R.color.light_gray),
                        modifier = Modifier
                            .clickable(onClick = onNavigationToHelpLandingScreen)
                    )
                }
            }
        }
    }


}

@Preview
@Composable
fun ReadyToGoScreenPreview() {
    ReadyToGoScreenBuilder(onNavigationToCategorySelection = {}, onNavigationToHelpLandingScreen = {})
}