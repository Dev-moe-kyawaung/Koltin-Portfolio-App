package com.moekyaw.aung.portfolio.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.moekyaw.aung.portfolio.ui.screens.home.HomeScreen
import com.moekyaw.aung.portfolio.ui.screens.projects.ProjectsScreen
import com.moekyaw.aung.portfolio.ui.screens.projects.ProjectDetailScreen
import com.moekyaw.aung.portfolio.ui.screens.skills.SkillsScreen
import com.moekyw.aung.portfolio.ui.screens.experience.ExperienceScreen
import com.moekyaw.aung.portfolio.ui.screens.certificates.CertificatesScreen
import com.moekyaw.aung.portfolio.ui.screens.contact.ContactScreen

object PortfolioRoutes {
    const val HOME = "home"
    const val PROJECTS = "projects"
    const val PROJECT_DETAIL = "project_detail/{projectId}"
    const val SKILLS = "skills"
    const val EXPERIENCE = "experience"
    const val CERTIFICATES = "certificates"
    const val CONTACT = "contact"
    const val RESUME = "resume"
}

@Composable
fun PortfolioNavGraph(
    navController: NavHostController,
    startDestination: String = PortfolioRoutes.HOME
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(PortfolioRoutes.HOME) {
            HomeScreen(
                onNavigateToProjectDetail = { projectId ->
                    navController.navigate(PortfolioRoutes.PROJECT_DETAIL.replace("{projectId}", projectId))
                },
                onNavigateToProjects = {
                    navController.navigate(PortfolioRoutes.PROJECTS)
                },
                onNavigateToResume = {
                    // Handle resume download
                }
            )
        }
        
        composable(PortfolioRoutes.PROJECTS) {
            ProjectsScreen(
                onProjectClick = { projectId ->
                    navController.navigate(PortfolioRoutes.PROJECT_DETAIL.replace("{projectId}", projectId))
                },
                onNavigateBack = { navController.popBackStack() }
            )
        }
        
        composable(
            route = PortfolioRoutes.PROJECT_DETAIL,
            arguments = listOf(navArgument("projectId") { type = NavType.StringType })
        ) { backStackEntry ->
            val projectId = backStackEntry.arguments?.getString("projectId") ?: return@composable
            ProjectDetailScreen(
                projectId = projectId,
                onNavigateBack = { navController.popBackStack() }
            )
        }
        
        composable(PortfolioRoutes.SKILLS) {
            SkillsScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }
        
        composable(PortfolioRoutes.EXPERIENCE) {
            ExperienceScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }
        
        composable(PortfolioRoutes.CERTIFICATES) {
            CertificatesScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }
        
        composable(PortfolioRoutes.CONTACT) {
            ContactScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}
