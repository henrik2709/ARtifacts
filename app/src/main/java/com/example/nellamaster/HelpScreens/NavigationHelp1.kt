package com.example.nellamaster.HelpScreens

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
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
fun NavigationHelp1(
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
                                    text = "1",
                                    fontFamily = IvyOra,
                                    fontSize = 120.sp,
                                    color = colorResource(id = R.color.teal),
                                    lineHeight = 0.sp
                                )
                                Text(
                                    text = "Der Home-\n          Bereich",
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
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                OutlinedButton(
                                    onClick = {  },
                                    modifier = Modifier
                                        .size(100.dp)

                                        .background(
                                            color = Color.White,
                                            shape = CircleShape
                                        ),
                                    shape = CircleShape,
                                    border = BorderStroke(1.75.dp, color = colorResource(id = R.color.teal)),
                                    contentPadding = PaddingValues(0.dp),

                                    ) {
                                    Image(painter = painterResource(id = R.drawable.architektur_interior), contentDescription = "")
                                }
                                Spacer(modifier = Modifier.width(12.dp))
                                OutlinedButton(
                                    onClick = {  },
                                    modifier = Modifier
                                        .size(100.dp)

                                        .background(
                                            color = Color.White,
                                            shape = CircleShape
                                        ),
                                    shape = CircleShape,
                                    border = BorderStroke(1.75.dp, color = colorResource(id = R.color.teal)),
                                    contentPadding = PaddingValues(0.dp),

                                    ) {
                                    Image(painter = painterResource(id = R.drawable.kunst_handwerk), contentDescription = "")
                                }
                                Spacer(modifier = Modifier.width(12.dp))
                                OutlinedButton(
                                    onClick = {  },
                                    modifier = Modifier
                                        .size(100.dp)

                                        .background(
                                            color = Color.White,
                                            shape = CircleShape
                                        ),
                                    shape = CircleShape,
                                    border = BorderStroke(1.75.dp, color = colorResource(id = R.color.teal)),
                                    contentPadding = PaddingValues(0.dp),

                                    ) {
                                    Image(painter = painterResource(id = R.drawable.grafikdesign_print), contentDescription = "")
                                }
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
                                    text = "Kategorien",
                                    fontFamily = Metropolis,
                                    fontSize = 25.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "Dein Home-Bereich ist in der Hauptansicht\nin drei große Kategorien der Kunst und\ndes Designs gegliedert: \n" +
                                            "- Architektur/ Interior\n" +
                                            "- Kunst/ Handwerk \n" +
                                            "- Grafikdesign/ Print\n",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier
                                        .padding(top = 12.dp)
                                )
                                Text(
                                    text = "Klicke auf einen Bereich, der dich spontan\nanspricht und entdecke mehr. Du kannst\nimmer wieder zu diesem Bildschirm\nzurückkehren. Klickst du auf den Home-\nButton im Menü landest du direkt hier.",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                            }
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
                                    painter = painterResource(id = R.drawable.auswahl),
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
                                    text = "Auswahl treffen",
                                    fontFamily = Metropolis,
                                    fontSize = 25.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "Wenn du dich für eine Oberkategorie\nentschieden hast, warten drei\nverschiedene Themen wie genaue\nEpochen oder Kulturen auf dich, die\nIllustrationen, Informationen und\nAnimationen bereithalten.",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier
                                        .padding(top = 12.dp)
                                )
                                Spacer(modifier = Modifier.height(12.dp))
                                Text(
                                    text = "Entscheide dich auch hier wieder für eine.\nAuf diese Übersicht kannst du jederzeit\nwieder zurückkehren.",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                            }
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
                                    painter = painterResource(id = R.drawable.infoseite),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .align(Alignment.Center)
                                )
                            }
                        }
                        item { Spacer(modifier = Modifier.height(20.dp)) }
                        item {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                verticalArrangement = Arrangement.Top,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "Informationsseite",
                                    fontFamily = Metropolis,
                                    fontSize = 25.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "Yeah, du hast es fast geschafft, zwei\ngroße Entscheidungen liegen hinter dir.",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier
                                        .padding(top = 12.dp)
                                )
                                Spacer(modifier = Modifier.height(12.dp))
                                Text(
                                    text = "Diese Seite bietet dir ganz viele\nInformationen über dein ausgewähltes\nThema. Lies den Text durch, denn dieser\nist nur in der App so ausführlich zu finden.\nDie Karten beinhalten auf der Rückseite\nnur die wichtigsten Merkmale und\nCharakteristika zu den typischen\nGestaltungselementen in Stichpunkten.",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        item { Spacer(modifier = Modifier.height(40.dp)) }
                        item {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(300.dp)
                                    .background(color = Color.White)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.zum_scan),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .align(Alignment.Center)
                                )
                            }
                        }
                        item { Spacer(modifier = Modifier.height(20.dp)) }
                        item {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                verticalArrangement = Arrangement.Top,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "Von hier zum Scan",
                                    fontFamily = Metropolis,
                                    fontSize = 25.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "Sobald du die Texte (mehr oder weniger)\ndurchgelesen hast, kannst du über den\nScan-Button auf dieser Seite neue\nFunktionen freischalten. Hierfür benötigst\ndu zwingend die ARtifacts-Karten. \nTippe zum Öffnen auf das Scan-Icon.",
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
                                    painter = painterResource(id = R.drawable.galerie),
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
                                    text = "Bildergalerie",
                                    fontFamily = Metropolis,
                                    fontSize = 25.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "Wenn du keine Lust auf Text, Input und\nWissen hast, aber schön Bildchen magst,\ndann kannst du einfach in die\nBildergalerie gehen. Dort werden dir alle\nMotive nacheinander angezeigt. Dein\neinziger Aufwand: auf Play für die\nAnimationen tippen und weiter-swipen.\nKlingt entspannt machbar, oder?",
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
                                    painter = painterResource(id = R.drawable.quiz),
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
                                    text = "Quiz-Time",
                                    fontFamily = Metropolis,
                                    fontSize = 25.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "Um zu testen, wie sehr du dein Wissen\nnun erweitert hast, kannst du dich im Quiz\nmessen. Keine Angst, es sind nur drei\nkleine Fragen, die es richtig zu\nbeantworten gilt. Challenge accepted?",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier
                                        .padding(top = 12.dp)
                                )
                                Spacer(modifier = Modifier.height(12.dp))
                                Text(
                                    text = "Das Quiz findest du unter den\nHauptkategorien im Home-Menü.",
                                    fontFamily = Metropolis,
                                    fontSize = 15.sp,
                                    color = colorResource(id = R.color.charcoal),
                                    textAlign = TextAlign.Center
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
fun NavigationHelp1Preview() {
    NavigationHelp1(rememberNavController(), onNavigateToNext = {})
}