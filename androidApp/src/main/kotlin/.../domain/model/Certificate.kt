package com.moekyaw.aung.portfolio.domain.model

data class Certificate(
    val id: String,
    val title: String,
    val issuer: String,
    val issueDate: String,
    val expiryDate: String?,
    val credentialId: String?,
    val credentialUrl: String?,
    val description: String?
)
