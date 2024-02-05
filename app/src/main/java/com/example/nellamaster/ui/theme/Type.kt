package com.example.nellamaster.ui.theme

import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.nellamaster.R

val Gopher = FontFamily(
    Font(R.font.gopher_bold, FontWeight.Bold),
    Font(R.font.gopher_regular)
)
val IvyOra = FontFamily(
    Font(R.font.ivyora_text_bold, FontWeight.Bold)
)
val Metropolis = FontFamily(
    Font(R.font.metropolis_medium, FontWeight.Medium),
    Font(R.font.metropolis_semibold, FontWeight.SemiBold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = Gopher,
        fontWeight = FontWeight.Bold,
        fontSize = 50.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = IvyOra,
        fontWeight = FontWeight.Bold,
        fontSize = 50.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = Gopher,
        fontWeight = FontWeight.Normal,
        fontSize = 35.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Metropolis,
        fontWeight = FontWeight.SemiBold,
        fontSize = 25.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Metropolis,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp
    ),
    bodySmall = TextStyle(
        fontFamily = Metropolis,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp
    )
)
