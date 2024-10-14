package com.sp45.vridassignment.presentation.navigation

sealed class Screen(val route: String) {
    object BlogScreen : Screen("blog_screen")
    object WebViewScreen : Screen("web_view_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("?url=$arg")
            }
        }
    }
}