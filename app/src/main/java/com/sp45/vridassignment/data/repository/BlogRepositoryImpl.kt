package com.sp45.vridassignment.data.repository

import com.sp45.vridassignment.core.common.Resource
import com.sp45.vridassignment.data.api.BlogApi
import com.sp45.vridassignment.data.mapper.toDomainBlog
import com.sp45.vridassignment.domain.model.Blogs
import com.sp45.vridassignment.domain.repository.BlogRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

@ViewModelScoped
class BlogRepositoryImpl @Inject constructor(private val blogApi: BlogApi) : BlogRepository{

    override fun getAllBlogs(): Flow<Resource<List<Blogs>>> = flow{

        emit(Resource.Loading())

        val result = blogApi.getAllBlogs().map {
            it.toDomainBlog()
        }
        emit(Resource.Success(result))
    }.flowOn(Dispatchers.IO)
        .catch {
            emit(Resource.Error(it.message.toString()))
        }


}