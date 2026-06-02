package com.moekyaw.aung.portfolio.domain.model

data class Experience(
    val id: String,
    val company: String,
    val position: String,
    val startDate: String,
    val endDate: String?,
    val isCurrent: Boolean,
    val location: String,
    val description: String,
    val achievements: List<String>,
    val technologies: List<String>
)
