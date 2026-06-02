# Moe Kyaw Aung - Android Developer Portfolio

A professional Android portfolio app built with **Kotlin**, **Jetpack Compose**, **Ktor**, and **Clean Architecture**.

## 🚀 Features

- **Modern Android UI** with Jetpack Compose & Material 3
- **OKLCH Color System** for perceptual color consistency
- **Clean Architecture** with separation of concerns
- **Ktor Backend API** for portfolio data
- **Kotlin Multiplatform** shared models
- **Hilt Dependency Injection**
- **Room Database** for offline support
- **Ktor HTTP Client** for networking
- **Coil** for image loading
- **Responsive Design** for phones & tablets

## 📁 Project Structure

    moe-kyaw-aung-portfolio/
     ├── androidApp/      # Main Android app
     ├── backend/         # Ktor API server
     ├── shared/          # KMP shared code
     └── 


## 🛠️ Tech Stack

| Category | Technology |
|----------|-----------|
| Language | Kotlin 2.1.0 |
| UI | Jetpack Compose + Material 3 |
| Architecture | Clean Architecture + MVVM |
| DI | Hilt |
| Networking | Ktor Client |
| Backend | Ktor Server |
| Database | Room |
| Images | Coil 3 |
| Async | Kotlin Coroutines + Flow |

## 📱 Screens

1. **Home** - Hero section, featured projects, skills preview
2. **Projects** - All portfolio projects with filters
3. **Project Detail** - Case study with tech stack
4. **Skills** - Categorized skills with proficiency
5. **Experience** - Work history with achievements
6. **Certificates** - Professional certifications
7. **Contact** - Contact form & social links

## 🏃 Getting Started

### Prerequisites

- Android Studio Hedgehog+ (2023.1.1)
- JDK 17
- Android SDK 35

### Build & Run

```bash
# Clone repository
git clone https://github.com/moekyaw-aung/portfolio.git

# Build Android app
./gradlew :androidApp:assembleDebug

# Run backend
./gradlew :backend:run

# Install on device
./gradlew :androidApp:installDebug
# 1. Clone the project
git clone https://github.com/moejaw-aung/portfolio.git

# 2. Update your profile image
# Replace: androidApp/src/main/res/mipmap-hdpi/ic_launcher.png

# 3. Add your real projects
# Update: androidApp/src/main/kotlin/.../data/repository/PortfolioRepository.kt

# 4. Build APK
./gradlew :androidApp:assembleRelease

# 5. Deploy backend
./gradlew :backend:run

# 6. Update GitHub
git add .
git commit -m "Update portfolio with Moe Kyaw Aung info"
git push origin main
