package com.moekyaw.aung.portfolio.domain.model

data class Skill(
    val id: String,
    val name: String,
    val category: SkillCategory,
    val proficiency: SkillProficiency,
    val iconUrl: String? = null,
    val description: String? = null
)

enum class SkillCategory {
    LANGUAGES,
    ANDROID_FRAMEWORK,
    ARCHITECTURE,
    DATABASE,
    NETWORKING,
    TESTING,
    TOOLS,
    SOFT_SKILLS
}

enum class SkillProficiency(val displayValue: String) {
    EXPERT("Expert"),
    ADVANCED("Advanced"),
    INTERMEDIATE("Intermediate"),
    BEGINNER("Beginner")
}
