package by.zharikov.democomposeviewmodel.ui.theme

import androidx.compose.ui.graphics.Color

data class Colors(
    val primaryBackgroundColor:Color,
    val secondaryBackground:Color,
    val headerTextColor:Color,
    val primaryTextColor:Color,
    val headerTextInvertColor:Color,
    val hintTextColor:Color,
    val primaryTextInvertColor:Color,
    val primaryTintColor:Color,
    val secondaryTintColor:Color,
    val accentColor:Color,
    val badgeColor:Color,
    val actionTextColor:Color

)

val lightPalette = Colors(
    primaryBackgroundColor = Color.White,
    secondaryBackground = Color(0xFFD0CCC7),
    headerTextColor = Color(0xFF311F09),
    primaryTextColor = Color(0xFF59442B),
    headerTextInvertColor = Color.White,
    primaryTextInvertColor = Color(0xFFFFFCF9),
    primaryTintColor = Color(0xFFFF8A00),
    secondaryTintColor = Color(0xFF3FA72F),
    hintTextColor = Color(0xFFA0978C),
    accentColor = Color(0xFF8AEAFF),
    badgeColor = Color(0xFFFF3838),
    actionTextColor = Color(0xFF0094FF)

)