package com.moekyaw.aung.portfolio.ui.screens.contact

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.moejaw.aung.portfolio.ui.theme.PrimaryOKLCH
import com.moejaw.aung.portfolio.ui.theme.SecondaryOKLCH

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactScreen(
    onNavigateBack: () -> Unit
) {
    val uriHandler = LocalUriHandler.current
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Contact Me") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Text(
                    "Let's Work Together",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold
                )
            }
            
            item {
                Text(
                    "I'm available for freelance, contract, or full-time Android roles. " +
                    "Feel free to reach out to discuss your project!",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            
            // Contact Info Cards
            item {
                ContactCard(
                    icon = ImageVector.vectorResource(id = android.R.drawable.ic_dialog_email),
                    title = "Email",
                    value = "moe.kyaw.aung@email.com",
                    onClick = { uriHandler.openUri("mailto:moe.kyaw.aung@email.com") }
                )
            }
            
            item {
                ContactCard(
                    icon = ImageVector.vectorResource(id = android.R.drawable.ic_btn_speak),
                    title = "Location",
                    value = "Tachileik, Shan State, Myanmar",
                    onClick = {}
                )
            }
            
            // Social Links
            item {
                Text(
                    "Connect with me",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }
            
            item {
                SocialLinkCard(
                    icon = ImageVector.vectorResource(id = android.R.drawable.ic_menu_gallery),
                    title = "GitHub",
                    value = "github.com/moekyaw-aung",
                    subtitle = "View my code and projects",
                    onClick = { uriHandler.openUri("https://github.com/moekyaw-aung") }
                )
            }
            
            item {
                SocialLinkCard(
                    icon = ImageVector.vectorResource(id = android.R.drawable.ic_menu_myplaces),
                    title = "LinkedIn",
                    value = "linkedin.com/in/moekyaw-aung",
                    subtitle = "Connect professionally",
                    onClick = { uriHandler.openUri("https://linkedin.com/in/moejaw-aung") }
                )
            }
            
            item {
                SocialLinkCard(
                    icon = ImageVector.vectorResource(id = android.R.drawable.ic_menu_compass),
                    title = "Portfolio Website",
                    value = "moekyaw-aung.github.io",
                    subtitle = "View my online portfolio",
                    onClick = { uriHandler.openUri("https://moekyaw-aung.github.io") }
                )
            }
            
            // Availability Badge
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = androidx.compose.ui.graphics.Color(0xFFD1FAE5)
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        androidx.compose.material3.Icon(
                            Icons.Default.CheckCircle,
                            contentDescription = null,
                            tint = androidx.compose.ui.graphics.Color(0xFF22C55E)
                        )
                        Column {
                            Text(
                                "Available for Hire",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = androidx.compose.ui.graphics.Color(0xFF065F46)
                            )
                            Text(
                                "Freelance • Contract • Full-time",
                                style = MaterialTheme.typography.bodyMedium,
                                color = androidx.compose.ui.graphics.Color(0xFF047857)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ContactCard(
    icon: ImageVector,
    title: String,
    value: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            androidx.compose.material3.Icon(
                icon,
                contentDescription = null,
                tint = PrimaryOKLCH,
                modifier = Modifier.size(28.dp)
            )
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    title,
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                )
                Text(
                    value,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Icon(
                Icons.Default.ChevronRight,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
            )
        }
    }
}

@Composable
fun SocialLinkCard(
    icon: ImageVector,
    title: String,
    value: String,
    subtitle: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            androidx.compose.material3.Icon(
                icon,
                contentDescription = null,
                tint = SecondaryOKLCH,
                modifier = Modifier.size(32.dp)
            )
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    value,
                    style = MaterialTheme.typography.bodyMedium,
                    color = PrimaryOKLCH
                )
                Text(
                    subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                )
            }
            Icon(
                Icons.Default.OpenInNew,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
            )
        }
    }
}
