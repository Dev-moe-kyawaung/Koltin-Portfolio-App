plugins {
    kotlin("multiplatform") version "2.1.0" apply false
    kotlin("android") version "2.1.0" apply false
    id("com.android.application") version "8.8.0" apply false
    id("org.jetbrains.kotlinx.kover") version "0.8.3" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
