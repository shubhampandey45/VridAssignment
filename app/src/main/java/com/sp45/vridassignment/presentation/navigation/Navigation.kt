package com.sp45.vridassignment.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sp45.vridassignment.presentation.components.BlogScreen
import com.sp45.vridassignment.presentation.viewmodel.BlogsViewModel

@Composable
fun Navigation()
{
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.BlogScreen.route) {

        composable(Screen.BlogScreen.route){
            val blogViewModel = hiltViewModel<BlogsViewModel>()
            val blogState = blogViewModel.blogsState.collectAsState().value
            BlogScreen(modifier = Modifier, blogsState = blogState)
        }

    }
}