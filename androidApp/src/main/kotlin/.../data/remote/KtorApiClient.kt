package com.moekyaw.aung.portfolio.data.remote

import com.moekyaw.aung.portfolio.data.remote.dto.ProjectDto
import com.moekyaw.aung.portfolio.data.remote.dto.SkillDto
import com.moekyaw.aung.portfolio.util.ApiConstants
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

object KtorApiClient {
    
    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                isLenient = true
                ignoreUnknownKeys = true
                prettyPrint = true
                encodeDefaults = true
            })
        }
    }
    
    suspend fun getProjects(): List<ProjectDto> {
        return try {
            httpClient.get("${ApiConstants.BASE_URL}/projects").body()
        } catch (e: Exception) {
            emptyList()
        }
    }
    
    suspend fun getProject(id: String): ProjectDto? {
        return try {
            httpClient.get("${ApiConstants.BASE_URL}/projects/$id").body()
        } catch (e: Exception) {
            null
        }
    }
    
    suspend fun getSkills(): List<SkillDto> {
        return try {
            httpClient.get("${ApiConstants.BASE_URL}/skills").body()
        } catch (e: Exception) {
            emptyList()
        }
    }
    
    suspend fun getExperience(): List<ExperienceDto> {
        return try {
            httpClient.get("${ApiConstants.BASE_URL}/experience").body()
        } catch (e: Exception) {
            emptyList()
        }
    }
    
    suspend fun getCertificates(): List<CertificateDto> {
        return try {
            httpClient.get("${ApiConstants.BASE_URL}/certificates").body()
        } catch (e: Exception) {
            emptyList()
        }
    }
    
    suspend fun downloadResume(): ByteArray {
        return try {
            httpClient.get("${ApiConstants.BASE_URL}/resume/download").body()
        } catch (e: Exception) {
            byteArrayOf()
        }
    }
}
