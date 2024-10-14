package com.sp45.vridassignment.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sp45.vridassignment.core.common.Resource
import com.sp45.vridassignment.domain.usecase.GetAllBlogUseCase
import com.sp45.vridassignment.presentation.state.BlogsState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class BlogsViewModel @Inject constructor(private val useCase: GetAllBlogUseCase) : ViewModel(){

    private val _blogsState = MutableStateFlow(BlogsState())

    val blogsState: StateFlow<BlogsState>
        get() = _blogsState

    init {
        getAllBlogs()
    }

    private fun getAllBlogs(){
        useCase().onEach {
            when(it){
                is Resource.Error -> {
                    _blogsState.value = BlogsState().copy(errorMsg = it.msg)
                }
                is Resource.Loading -> {
                    _blogsState.value = BlogsState().copy(isLoading = true)
                }
                is Resource.Success -> {
                    _blogsState.value = BlogsState().copy(blogs = it.data)
                }
            }

        }.launchIn(viewModelScope)
    }

}