package com.sp45.vridassignment.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sp45.vridassignment.presentation.state.BlogsState

@Composable
fun BlogScreen(modifier: Modifier, blogsState: BlogsState, onBlogClick: (String) -> Unit) {
    if(blogsState.isLoading) {
        Box(modifier = modifier.fillMaxSize()){
            CircularProgressIndicator(modifier = modifier.align(Alignment.Center))
        }
    } else if (!blogsState.errorMsg.isNullOrEmpty()){
        Box(modifier = modifier.fillMaxSize()){
            Text(text = blogsState.errorMsg.toString(), modifier = modifier.align(Alignment.Center))
        }
    }

    if(blogsState.blogs?.isNotEmpty() == true) {
        LazyColumn {
            items(blogsState.blogs) {
                BlogItem(modifier = modifier, blog = it, onBlogClick = onBlogClick)
            }
        }
    }
}