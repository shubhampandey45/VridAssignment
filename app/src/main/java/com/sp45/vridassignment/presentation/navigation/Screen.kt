package com.sp45.vridassignment.presentation.navigation

sealed class Screen(val route: String){
    object BlogScreen : Screen("blog_screen")
}