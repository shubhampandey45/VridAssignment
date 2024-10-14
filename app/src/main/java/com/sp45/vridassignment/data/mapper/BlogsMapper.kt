package com.sp45.vridassignment.data.mapper

import com.sp45.vridassignment.data.dto.BlogsDto
import com.sp45.vridassignment.domain.model.Blogs
import com.sp45.vridassignment.domain.model.Content
import com.sp45.vridassignment.domain.model.Title

fun BlogsDto.toDomainBlog(): Blogs {
    return Blogs(
        id = this.id,
        title = Title(rendered = this.title.rendered),
        content = Content(rendered = this.content.rendered, protected = this.content.protected),
        author = this.author,
        date = this.date,
        dateGmt = this.dateGmt,
        link = this.link,
        modifiedGmt = this.modifiedGmt,
        jetpackFeaturedMediaUrl = this.jetpackFeaturedMediaUrl,
        jetpackShortlink = this.jetpackShortlink
    )
}