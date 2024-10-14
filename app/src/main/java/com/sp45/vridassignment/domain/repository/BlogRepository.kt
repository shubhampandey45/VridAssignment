package com.sp45.vridassignment.domain.repository

import com.sp45.vridassignment.core.common.Resource
import com.sp45.vridassignment.domain.model.Blogs
import kotlinx.coroutines.flow.Flow

interface BlogRepository {

    fun getAllBlogs() : Flow<Resource<List<Blogs>>>

}