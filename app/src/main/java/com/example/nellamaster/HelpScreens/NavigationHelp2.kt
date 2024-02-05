package com.example.nellamaster.HelpScreens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
import com.example.nellamaster.R
import com.example.nellamaster.ui.theme.Gopher
import com.example.nellamaster.ui.theme.IvyOra
import com.example.nellamaster.ui.theme.Metropolis

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun NavigationHelp2(
    navController: NavController,
    onNavigateToNext: () -> Unit
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
                    painter = painterResource(id = R.drawable.background_3_1),
                    contentScale = ContentScale.FillBounds
                )
                .background(
                    Brush.verticalGradient(
                        listOf(Color.Transparent, Color.White),
                        0f,
                        1400f,
                    )
                )
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Spacer(modifier = Modifier.fillMaxHeight(0.2f))
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = colorResource(id = R.color.bone))
                ) {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        item {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Spacer(modifier = Modifier.width(20.dp))
                                Text(
                                    text = "2",
                                    fontFamily = IvyOra,
                                    fontSize = 120.sp,
                                    color = colorResource(id = R.color.teal),
                                    lineHeight = 0.sp
                                )
                                Text(
                                    text = "Der Scan-\n          Bereich",
                                    fontFamily = Gopher,
                                    fontSize = 50.sp,
                                    color = colorResource(id = R.color.teal),
                                    fontWeight = FontWeight.SemiBold,
                                    lineHeight = 40.sp
                                )
                            }
                        }
                        item {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(10.dp)
                                    .background(color = colorResource(id = R.color.salmon))
                            )
                        }
                        item {
                            Spacer(modifier = Modifier.height(40.dp))
                        }
                        item {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(300.dp)
                                    .background(color = Color.White)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.scan),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .align(Alignment.Center)
                                )
                            }
                        }
                        item {
                            Spacer(modifier = Modifier.height(20.dp))
                        }
                        item {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                verticalArrangement = Arrangement.Top,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "Wie funktioniert's?",
                                    fontFamily = Metropolis,
                                    fontSize = 25.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "Für die Funktion benötigst du zwingend\ndie ARtifacts-Karten.",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier
                                        .padding(top = 12.dp)
                                )
                                Text(
                                    text = "Tippe für die Nutzung der Funktion auf\ndas Scan-Icon. Die Scanfunktion kannst\ndu dabei über die Buttons auf den\nEinzelkategorie-Seiten erreichen oder\nauch über das Icon in der Menüleiste.",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "Die App möchte für diese Funktion auf\ndeine Smartphone-Kamera zugreifen.\nUm die Karten scannen zu können, musst\ndu dem Zugriff einmalig oder bei jeden\nÖffnen erneut zustimmen.\n",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = " Ist die Kamera geöffnet, sucht die App\nautomatisch nach Motiven. Halte oder\nlege die Karte daher gut sichtbar vor dein\nSmartphone und verdecke keine Bildteile. ",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "Wird das Motiv erkannt, fängt das Bild\nsich an zu bewegen. Crazy.",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        item {
                            Spacer(modifier = Modifier.height(80.dp))
                        }
                        item {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                verticalArrangement = Arrangement.Top,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "Funktioniert's nicht?",
                                    fontFamily = Metropolis,
                                    fontSize = 25.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "Du hast Probleme beim Scannen der\nKarten und weißt nicht weiter?\nSei nicht frustriert. Anwendungen mit\nAugmented Reality haben besondere\ntechnische Eigenschaften.\n",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier
                                        .padding(top = 12.dp)
                                )
                            }
                        }
                        item {
                            Spacer(modifier = Modifier.height(20.dp))
                        }
                        item {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(300.dp)
                                    .background(color = Color.White)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.technische_probleme),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .align(Alignment.Center)
                                )
                            }
                        }
                        item {
                            Spacer(modifier = Modifier.height(40.dp))
                        }
                        item {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Button(
                                    onClick = onNavigateToNext,
                                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.teal)),
                                    shape = RoundedCornerShape(20),
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(50.dp)

                                ) {
                                    androidx.compose.material3.Text(
                                        text = "Weiter",
                                        fontSize = 18.sp,
                                        color = colorResource(id = R.color.white)
                                    )
                                }
                            }
                        }
                        item {
                            Spacer(modifier = Modifier.height(150.dp))
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun NavigationHelp2Preview() {
    NavigationHelp2(rememberNavController(), onNavigateToNext = {})
}