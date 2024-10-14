package com.sp45.vridassignment.domain.usecase

import com.sp45.vridassignment.domain.repository.BlogRepository
import javax.inject.Inject

class GetAllBlogUseCase @Inject constructor(private val repository: BlogRepository) {

    operator fun invoke() = repository.getAllBlogs()

}