package com.moekyaw.aung.portfolio.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView

private val LightColorScheme = lightColorScheme(
    primary = PrimaryOKLCH,
    onPrimary = OnPrimary,
    primaryContainer = PrimaryContainer,
    onPrimaryContainer = OnPrimary,
    
    secondary = SecondaryOKLCH,
    onSecondary = OnSecondary,
    secondaryContainer = SecondaryContainer,
    onSecondaryContainer = OnSecondary,
    
    background = BackgroundOKLCH,
    onBackground = OnBackground,
    
    surface = SurfaceOKLCH,
    onSurface = OnSurface,
    surfaceVariant = SurfaceVariant,
    onSurfaceVariant = OnSurface,
    
    outline = Outline,
    outlineVariant = OutlineVariant,
    
    error = Error,
    onError = Color.White
)

private val DarkColorScheme = darkColorScheme(
    primary = DarkPrimaryOKLCH,
    onPrimary = Color.Black,
    primaryContainer = Color(0xFF1E40AF),
    onPrimaryContainer = Color.White,
    
    secondary = DarkSecondaryOKLCH,
    onSecondary = Color.Black,
    secondaryContainer = Color(0xFF065F46),
    onSecondaryContainer = Color.White,
    
    background = DarkBackgroundOKLCH,
    onBackground = DarkOnBackground,
    
    surface = DarkSurfaceOKLCH,
    onSurface = DarkOnSurface,
    surfaceVariant = Color(0xFF27272A),
    onSurfaceVariant = DarkOnSurface,
    
    outline = Color(0xFF3F3F46),
    outlineVariant = Color(0xFF52525B),
    
    error = Color(0xFFF87171),
    onError = Color.Black
)

@Composable
fun PortfolioTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = Color.Transparent.toArgb()
            window.navigationBarColor = Color.Transparent.toArgb()
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
