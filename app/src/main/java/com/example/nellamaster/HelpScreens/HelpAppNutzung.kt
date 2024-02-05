package com.example.nellamaster.HelpScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.BottomNavBar
import com.example.nellamaster.R
import com.example.nellamaster.ui.theme.Gopher
import com.example.nellamaster.ui.theme.Metropolis

@Composable
fun HelpAppNutzunScreenBuilder(
    navController: NavController,
    onNavigateToNavigationHelp: () -> Unit,
    onNavigateToWelcomScreens: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(id = R.drawable.background_9_2),
                contentScale = ContentScale.FillBounds
            )
            .background(
                Brush.verticalGradient(
                    listOf(Color.Transparent, Color.White),
                    0f,
                    1500f
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.45f)
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "App-Nutzung",
                fontFamily = Gopher,
                fontSize = 35.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.teal),
                modifier = Modifier
                    .padding(start = 30.dp)
            )
            Text(
                text = "Wo benötigst du Hilfe?",
                fontFamily = Gopher,
                fontSize = 32.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.salmon),
                modifier = Modifier
                    .padding(start = 30.dp)
            )
            Button(
                onClick = onNavigateToNavigationHelp,
                shape = RoundedCornerShape(20),
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.teal)),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 40.dp)
                    .width(350.dp)
            ) {
                Text(
                    text = "Wie navigiere ich mich durch die App?",
                    fontFamily = Metropolis,
                    fontSize = 15.sp,
                    color = colorResource(id = R.color.salmon)
                )
            }
            Button(
                onClick = onNavigateToWelcomScreens,
                shape = RoundedCornerShape(20),
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.teal)),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 12.dp)
                    .width(350.dp)
            ) {
                Text(
                    text = "Einleitungs-Tutorial noch einmal ansehen",
                    fontFamily = Metropolis,
                    fontSize = 15.sp,
                    color = colorResource(id = R.color.salmon)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            BottomNavBar(
                navController = navController
            )
        }
    }
}

@Preview
@Composable
fun HelpAppNutzungPreview() {
    HelpAppNutzunScreenBuilder(navController = rememberNavController(), onNavigateToNavigationHelp = {}, onNavigateToWelcomScreens = {})
}