package com.sp45.vridassignment.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sp45.vridassignment.domain.model.Blogs

@Composable
fun BlogItem(modifier: Modifier, blog: Blogs, onBlogClick: (String) -> Unit) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp)
            .clickable { onBlogClick(blog.link) }
    ) {
        Card(
            elevation = CardDefaults.cardElevation(8.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Column(
                modifier = modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AsyncImage(
                    model = blog.jetpackFeaturedMediaUrl,
                    contentDescription = null,
                    modifier = modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(8.dp)),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = blog.title.rendered,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(6.dp),
                    color = Color.White
                )
                Spacer(modifier = modifier.padding(4.dp))
            }
        }
    }

}