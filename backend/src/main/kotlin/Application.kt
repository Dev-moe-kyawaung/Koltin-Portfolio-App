package com.moekyaw.aung.portfolio.backend

import com.moekyaw.aung.portfolio.backend.plugins.*
import com.moekyaw.aung.portfolio.backend.routes.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.cio.*

fun main(args: Array<String>) {
    embeddedServer(CIO, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSerialization()
        portfolioRoutes()
        projectRoutes()
    }.start(wait = true)
}
