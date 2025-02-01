package com.example.guide.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.guide.R

val PetrovSans = FontFamily(
    Font(R.font.petrov_sans_trial_regular),
    Font(R.font.petrov_sans_trial_bold, FontWeight.Bold)
)

val GolosText = FontFamily(
    Font(R.font.golos_text_regular)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = PetrovSans,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = PetrovSans,
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = PetrovSans,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = PetrovSans,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        textAlign = TextAlign.Center
    ),
    bodyLarge = TextStyle(
        fontFamily = GolosText,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        textAlign = TextAlign.Justify
    ),
    labelLarge = TextStyle(
        fontFamily = PetrovSans,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    )
)