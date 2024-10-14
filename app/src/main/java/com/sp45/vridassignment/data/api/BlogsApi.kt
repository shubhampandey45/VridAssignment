package com.sp45.vridassignment.data.api

import com.sp45.vridassignment.data.dto.BlogsDto
import retrofit2.http.GET
import retrofit2.http.Query

interface BlogApi {

    @GET("posts")
    suspend fun getAllBlogs(
        @Query("per_page") perPage: Int = 10,
        @Query("page") page: Int = 1
    ): List<BlogsDto>
}