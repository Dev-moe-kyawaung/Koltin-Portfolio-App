package com.moekyaw.aung.portfolio.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class ProjectDto(
    val id: String,
    val title: String,
    val description: String,
    val longDescription: String = "",
    val technologies: List<String>,
    val imageUrl: String?,
    val caseStudyUrl: String?,
    val playStoreUrl: String?,
    val githubUrl: String?,
    val publishedDate: String,
    val isFeatured: Boolean = false,
    val category: String
)

@Serializable
data class SkillDto(
    val id: String,
    val name: String,
    val category: String,
    val proficiency: String,
    val iconUrl: String? = null,
    val description: String? = null
)

@Serializable
data class ExperienceDto(
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

@Serializable
data class CertificateDto(
    val id: String,
    val title: String,
    val issuer: String,
    val issueDate: String,
    val expiryDate: String?,
    val credentialId: String?,
    val credentialUrl: String?,
    val description: String?
)
