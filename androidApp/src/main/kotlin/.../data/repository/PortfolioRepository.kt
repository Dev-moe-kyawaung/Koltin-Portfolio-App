package com.moejaw.aung.portfolio.data.repository

import com.moejaw.aung.portfolio.data.remote.KtorApiClient
import com.moejaw.aung.portfolio.data.remote.dto.ProjectDto
import com.moejaw.aung.portfolio.data.remote.dto.SkillDto
import com.moejaw.aung.portfolio.domain.model.*

class PortfolioRepository {
    
    suspend fun getProjects(): Result<List<Project>> {
        return try {
            val dtos = KtorApiClient.getProjects()
            val projects = dtos.map { dto ->
                Project(
                    id = dto.id,
                    title = dto.title,
                    description = dto.description,
                    longDescription = dto.longDescription,
                    technologies = dto.technologies,
                    imageUrl = dto.imageUrl,
                    caseStudyUrl = dto.caseStudyUrl,
                    playStoreUrl = dto.playStoreUrl,
                    githubUrl = dto.githubUrl,
                    publishedDate = dto.publishedDate,
                    isFeatured = dto.isFeatured,
                    category = ProjectCategory.valueOf(dto.category)
                )
            }
            Result.success(projects)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun getSkills(): Result<List<Skill>> {
        return try {
            val dtos = KtorApiClient.getSkills()
            val skills = dtos.map { dto ->
                Skill(
                    id = dto.id,
                    name = dto.name,
                    category = SkillCategory.valueOf(dto.category),
                    proficiency = SkillProficiency.valueOf(dto.proficiency),
                    iconUrl = dto.iconUrl,
                    description = dto.description
                )
            }
            Result.success(skills)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun getExperience(): Result<List<Experience>> {
        return try {
            val dtos = KtorApiClient.getExperience()
            val experiences = dtos.map { dto ->
                Experience(
                    id = dto.id,
                    company = dto.company,
                    position = dto.position,
                    startDate = dto.startDate,
                    endDate = dto.endDate,
                    isCurrent = dto.isCurrent,
                    location = dto.location,
                    description = dto.description,
                    achievements = dto.achievements,
                    technologies = dto.technologies
                )
            }
            Result.success(experiences)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun getCertificates(): Result<List<Certificate>> {
        return try {
            val dtos = KtorApiClient.getCertificates()
            val certificates = dtos.map { dto ->
                Certificate(
                    id = dto.id,
                    title = dto.title,
                    issuer = dto.issuer,
                    issueDate = dto.issueDate,
                    expiryDate = dto.expiryDate,
                    credentialId = dto.credentialId,
                    credentialUrl = dto.credentialUrl,
                    description = dto.description
                )
            }
            Result.success(certificates)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun downloadResume(): Result<ByteArray> {
        return try {
            val data = KtorApiClient.downloadResume()
            if (data.isNotEmpty()) {
                Result.success(data)
            } else {
                Result.failure(Exception("Failed to download resume"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
