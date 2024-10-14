package com.sp45.vridassignment.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.sp45.vridassignment.presentation.components.BlogScreen
import com.sp45.vridassignment.presentation.components.WebViewScreen
import com.sp45.vridassignment.presentation.viewmodel.BlogsViewModel
import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.navigation.compose.currentBackStackEntryAsState
import com.sp45.vridassignment.presentation.components.AppTopBar

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        topBar = {
            if (currentRoute == Screen.BlogScreen.route) {
                AppTopBar(title = "Vrid App Assignment")
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.BlogScreen.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.BlogScreen.route) {
                val blogViewModel = hiltViewModel<BlogsViewModel>()
                val blogState = blogViewModel.blogsState.collectAsState().value
                BlogScreen(
                    modifier = Modifier,
                    blogsState = blogState,
                    onBlogClick = { url ->
                        val encodedUrl = URLEncoder.encode(url, StandardCharsets.UTF_8.toString())
                        navController.navigate(Screen.WebViewScreen.withArgs(encodedUrl))
                    }
                )
            }

            composable(
                route = "${Screen.WebViewScreen.route}?url={url}",
                arguments = listOf(navArgument("url") { type = NavType.StringType })
            ) { backStackEntry ->
                val url = backStackEntry.arguments?.getString("url")
                url?.let {
                    val decodedUrl =
                        java.net.URLDecoder.decode(it, StandardCharsets.UTF_8.toString())
                    WebViewScreen(url = decodedUrl)
                }
            }
        }
    }
}