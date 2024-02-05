package com.example.nellamaster

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.ui.theme.Gopher
import com.example.nellamaster.ui.theme.Metropolis

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CategoryBuilder(
    background: Painter,
    epochName: String,
    subText: String,
    line: Painter,
    textTitle: String,
    textBody: String,
    navController: NavController,
    onNavigateToFullScreen: () -> Unit
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
                    painter = background,
                    contentScale = ContentScale.Crop
                )
                .background(
                    Brush.verticalGradient(
                        listOf(Color.Transparent, Color.White),
                        0f,
                        1200f
                    )
                )
        ) 
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.375f)
                .clickable(onClick = onNavigateToFullScreen)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.fillMaxHeight(0.25f))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = epochName,
                    fontFamily = Gopher,
                    fontSize =  40.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = colorResource(id = R.color.teal),
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 40.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        text = subText,
                        fontFamily = Gopher,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Normal,
                        color = colorResource(id = R.color.teal),
                        modifier = Modifier
                            .padding(start = 40.dp)
                            .align(CenterVertically)
                    )
                    Image(
                        painter = line,
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth
                    )
                }
                Box(
                    modifier = Modifier
                        .width(180.dp)
                        .height(30.dp)
                        .align(Alignment.End)
                        .background(
                            color = colorResource(id = R.color.salmon),
                            shape = RoundedCornerShape(
                                topStartPercent = 20,
                                topEndPercent = 0,
                                bottomStartPercent = 20,
                                bottomEndPercent = 0
                            )
                        )
                        .clickable { navController.navigate(Screen.CameraMainScreen.route) }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Spacer(modifier = Modifier.width(12.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.icons_scan_petrol),
                            contentDescription = null,
                            tint = colorResource(id = R.color.teal),
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .size(20.dp)
                        )
                        Text(
                            text = "Motiv scannen",
                            fontFamily = Gopher,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.teal),
                            modifier = Modifier
                                .padding(start = 8.dp)
                                .fillMaxWidth()
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.8f)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .align(Alignment.Center)
                    ) {
                        Spacer(modifier = Modifier.height(40.dp))
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(0.9f)
                        ) {
                            item {
                                Text(
                                    text = textTitle,
                                    fontFamily = Metropolis,
                                    fontSize = 25.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    modifier = Modifier
                                        .padding(start = 40.dp, end = 40.dp, bottom = 12.dp),
                                    textAlign = TextAlign.Left
                                )
                            }
                            item {
                                Text(
                                    text = textBody,
                                    fontFamily = Metropolis,
                                    fontSize = 16.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    modifier = Modifier
                                        .padding(start = 40.dp, end = 40.dp)
                                )
                            }
                            item {
                                Spacer(modifier = Modifier.height(40.dp))
                            }
                        }
                    }
                }
            }
        }
    }
    
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CategoryBuilder(
    background: Painter,
    epochName: String,
    subText: String,
    textTitle: String,
    textBody: String,
    navController: NavController,
    onNavigateToFullScreen: () -> Unit
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
                    painter = background,
                    contentScale = ContentScale.Crop
                )
                .background(
                    Brush.verticalGradient(
                        listOf(Color.Transparent, Color.White),
                        0f,
                        1200f
                    )
                )
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.375f)
                .clickable(onClick = onNavigateToFullScreen)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.fillMaxHeight(0.25f))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = epochName,
                    fontFamily = Gopher,
                    fontSize =  40.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = colorResource(id = R.color.teal),
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 40.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp),
                    horizontalArrangement = Arrangement.Start,
                ) {
                    Text(
                        text = subText,
                        fontFamily = Gopher,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        color = colorResource(id = R.color.teal),
                        modifier = Modifier
                            .padding(start = 40.dp)
                    )
                }
                Box(
                    modifier = Modifier
                        .width(180.dp)
                        .height(30.dp)
                        .align(Alignment.End)
                        .background(
                            color = colorResource(id = R.color.salmon),
                            shape = RoundedCornerShape(
                                topStartPercent = 20,
                                topEndPercent = 0,
                                bottomStartPercent = 20,
                                bottomEndPercent = 0
                            )
                        )
                        .clickable { navController.navigate(Screen.CameraMainScreen.route) }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Spacer(modifier = Modifier.width(12.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.icons_scan_petrol),
                            contentDescription = null,
                            tint = colorResource(id = R.color.teal),
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .size(20.dp)
                        )
                        Text(
                            text = "Motiv scannen",
                            fontFamily = Gopher,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.teal),
                            modifier = Modifier
                                .padding(start = 8.dp)
                                .fillMaxWidth()
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.8f)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .align(Alignment.Center)
                    ) {
                        Spacer(modifier = Modifier.height(40.dp))
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(0.9f)
                        ) {
                            item {
                                Text(
                                    text = textTitle,
                                    fontFamily = Metropolis,
                                    fontSize = 25.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    modifier = Modifier
                                        .padding(start = 40.dp, end = 40.dp, bottom = 12.dp),
                                    textAlign = TextAlign.Left
                                )
                            }
                            item {
                                Text(
                                    text = textBody,
                                    fontFamily = Metropolis,
                                    fontSize = 16.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    modifier = Modifier
                                        .padding(start = 40.dp, end = 40.dp)
                                )
                            }
                            item {
                                Spacer(modifier = Modifier.height(40.dp))
                            }
                        }

                    }
                }
            }
        }
    }

}

@Preview
@Composable
fun CatPreview() {
    CategoryBuilder(
        background = painterResource(id = R.drawable.plakat_design_postmoderne__berarbeitet),
        epochName = "Postmoderne",
        subText = "1970er - 80er",
        textTitle = "less is bore",
        textBody = stringResource(id = R.string.postmoderne_text),
        navController = rememberNavController(),
        onNavigateToFullScreen = { }
    )
}