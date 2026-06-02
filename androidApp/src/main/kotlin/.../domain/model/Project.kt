package com.moekyaw.aung.portfolio.domain.model

data class Project(
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
    val category: ProjectCategory
)

enum class ProjectCategory {
    ANDROID_APP,
    KOTLIN_MULTIPLATFORM,
    BACKEND_API,
    OPEN_SOURCE
}
