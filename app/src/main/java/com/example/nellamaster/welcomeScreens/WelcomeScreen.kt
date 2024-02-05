package com.example.nellamaster.welcomeScreens

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.ArrowRight
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.rememberSwipeableState
import androidx.compose.material.swipeable
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nellamaster.Additional.PageCounterBuilder
import com.example.nellamaster.R
import com.example.nellamaster.ui.theme.Gopher
import com.example.nellamaster.ui.theme.Metropolis
import com.example.nellamaster.ui.theme.NellaMasterTheme

class WelcomeScreen : ComponentActivity() {
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
fun WelcomeScreenBuilder(
    onNavigateToWelcomScreen2: () -> Unit,
) {

    val infiniteTransition = rememberInfiniteTransition(label = "infinite transition")
    val animatedColor by infiniteTransition.animateColor(
        initialValue = Color.Transparent,
        targetValue = colorResource(id = R.color.light_gray),
        animationSpec = infiniteRepeatable(tween(1000), RepeatMode.Reverse),
        label = "color"
    )
    Scaffold(
        bottomBar = {
            Column() {
                PageCounterBuilder(current = 1)
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
            Row(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .fillMaxHeight()
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .fillMaxHeight()
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable(onClick = onNavigateToWelcomScreen2)
                ) {
                    Icon(
                        imageVector = Icons.Outlined.KeyboardArrowRight,
                        contentDescription = null,
                        tint = animatedColor,
                        modifier = Modifier
                            .size(80.dp)
                            .align(Alignment.CenterEnd)
                            .alpha(0.5f)
                    )
                }

            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Top
            ) {
                Spacer(modifier = Modifier.height(450.dp))
                Text(
                    text = "Welcome to",
                    fontFamily = Gopher,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = colorResource(id = R.color.teal),
                    modifier = Modifier
                        .padding(start = 24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.logo_artifacts_gr_n),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 24.dp, end = 24.dp, top = 8.dp, bottom = 24.dp)
                )
                Text(
                    text = stringResource(id = R.string.welcomeScreenText),
                    fontFamily = Metropolis,
                    fontSize = 17.sp,
                    color = colorResource(id = R.color.charcoal),
                    lineHeight = 20.sp,
                    modifier = Modifier
                        .padding(start = 24.dp, end = 0.dp)
                )

            }
        }
    }
}


@Preview
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreenBuilder(onNavigateToWelcomScreen2 = {})
}