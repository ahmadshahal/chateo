package com.kotmaster.chateo.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val DarkColorPalette = darkColors(
    /*
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
     */
)

@SuppressLint("ConflictingOnColor")
private val LightColorPalette = lightColors(
    primary = Blue600,
    primaryVariant = Blue300,
    background = White,
    onBackground = Blue900,
    surface = Gray600,
    onSurface = Gray900,
    onPrimary = Gray600,
)

private val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(30.dp)
)

private val Typography = Typography(
    h1 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    h3 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        lineHeight = 30.sp,
        fontSize = 18.sp
    ),
    h4 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        lineHeight = 28.sp,
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        lineHeight = 24.sp,
        fontSize = 14.sp,
    ),
    body2 = TextStyle(
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp,
        fontSize = 14.sp,
    ),
    subtitle1 = TextStyle(
        fontWeight = FontWeight.Normal,
        lineHeight = 20.sp,
        fontSize = 12.sp,
    ),
    subtitle2 = TextStyle(
        fontWeight = FontWeight.Normal,
        lineHeight = 16.sp,
        fontSize = 10.sp,
    ),
    overline = TextStyle(
        fontWeight = FontWeight.SemiBold,
        lineHeight = 16.sp,
        fontSize = 10.sp,
    ),
)

@Composable
fun ChateoTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors =
        if (darkTheme) DarkColorPalette else LightColorPalette
    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}