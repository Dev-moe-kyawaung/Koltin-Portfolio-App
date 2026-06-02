@Composable
fun HeroSection(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(PrimaryOKLCH, SecondaryOKLCH)
                    )
                )
                .padding(32.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Profile Image - Replace with your photo
                AsyncImage(
                    model = "https://github.com/moejaw-aung.png",
                    contentDescription = "Moe Kyaw Aung",
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                
                Text(
                    "Moe Kyaw Aung",
                    style = MaterialTheme.typography.displaySmall,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                
                Text(
                    "Senior Android Developer",
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.White.copy(alpha = 0.9f),
                    fontWeight = FontWeight.SemiBold
                )
                
                Text(
                    "Crafting high-performance Android experiences with Kotlin, " +
                    "Jetpack Compose, and clean architecture. 8+ years turning " +
                    "complex ideas into intuitive mobile applications.",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White.copy(alpha = 0.8f),
                    textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                    modifier = Modifier.widthIn(max = 400.dp)
                )
            }
        }
    }
}
