plugins {
    kotlin("jvm") version "2.1.0"
    id("io.ktor.plugin") version "3.1.0"
    kotlin("plugin.serialization") version "2.1.0"
}

group = "com.moejaw.aung.portfolio"
version = "1.0.0"

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:3.1.0")
    implementation("io.ktor:ktor-server-cio:3.1.0")
    implementation("io.ktor:ktor-server-content-negotiation:3.1.0")
    implementation("io.ktor:ktor-serialization-kotlinx-json:3.1.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
    
    testImplementation("io.ktor:ktor-server-tests-jvm:3.1.0")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.9.0")
}
