package com.loc.newsapp.presentation.nvgraph

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.loc.newsapp.presentation.onboarding.OnBoardingScreen
import com.loc.newsapp.presentation.onboarding.OnboardingViewModel

@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination){
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ){
            composable(
                route = Route.OnBoardingScreen.route
            ){
                val viewModel: OnboardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent
                )
            }
        }

        navigation(
            route = Route.NewsNavigation.route,
            startDestination = Route.NewsNavigatorScreen.route
        ) {
            composable(route = Route.NewsNavigatorScreen.route) {
                Text(text = "News Navigator Screen")
            }
        }
    }

}