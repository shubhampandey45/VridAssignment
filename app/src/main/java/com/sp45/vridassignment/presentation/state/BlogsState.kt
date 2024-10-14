package com.sp45.vridassignment.presentation.state

import com.sp45.vridassignment.domain.model.Blogs

data class BlogsState(
    val blogs: List<Blogs> ? = emptyList(),
    val errorMsg: String? = "",
    val isLoading: Boolean = false
)
