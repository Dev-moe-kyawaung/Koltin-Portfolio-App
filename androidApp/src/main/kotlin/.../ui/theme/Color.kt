package com.moekyaw.aung.portfolio.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb

// OKLCH-based Android colors (converted to Compose Color)
// OKLCH is a perceptual color space - perfect for modern Android apps

// Primary Palette (OKLCH-inspired)
val PrimaryOKLCH = Color(0xFF2563EB)      // OKLCH(55% 0.22 260) ~ Blue
val PrimaryContainer = Color(0xFFDBEAFE)  // OKLCH(93% 0.03 260)
val OnPrimary = Color(0xFFFFFFFF)         // White

// Secondary Palette  
val SecondaryOKLCH = Color(0xFF059669)    // OKLCH(55% 0.15 150) ~ Emerald
val SecondaryContainer = Color(0xFFD1FAE5)
val OnSecondary = Color(0xFFFFFFFF)

// Neutral Palette
val BackgroundOKLCH = Color(0xFFFAFAFA)   // OKLCH(98% 0.005 260)
val SurfaceOKLCH = Color(0xFFFFFFFF)      // OKLCH(100% 0 0)
val OnBackground = Color(0xFF18181B)      // OKLCH(15% 0.01 260)
val OnSurface = Color(0xFF18181B)

// Neutral Variants
val Outline = Color(0xFFE4E4E7)
val OutlineVariant = Color(0xFFD4D4D8)
val SurfaceVariant = Color(0xFFF4F4F5)

// Semantic Colors
val Success = Color(0xFF22C55E)   // OKLCH(65% 0.18 150)
val Warning = Color(0xFFF59E0B)   // OKLCH(65% 0.18 80)
val Error = Color(0xFFEF4444)     // OKLCH(57% 0.21 25)
val Info = Color(0xFF3B82F6)      // OKLCH(60% 0.18 245)

// Dark Mode Colors
val DarkBackgroundOKLCH = Color(0xFF09090B)
val DarkSurfaceOKLCH = Color(0xFF18181B)
val DarkPrimaryOKLCH = Color(0xFF3B82F6)
val DarkSecondaryOKLCH = Color(0xFF10B981)
val DarkOnBackground = Color(0xFFE4E4E7)
val DarkOnSurface = Color(0xFFE4E4E7)
