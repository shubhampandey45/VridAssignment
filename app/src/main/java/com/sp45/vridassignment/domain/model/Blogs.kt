package com.sp45.vridassignment.domain.model

import com.google.gson.annotations.SerializedName

data class Blogs(
    val author: Int,
    val content: Content,
    val date: String,
    @SerializedName("date_gmt")
    val dateGmt: String,
    val id: Int,
    @SerializedName("jetpack_featured_media_url")
    val jetpackFeaturedMediaUrl: String,
    @SerializedName("jetpack_shortlink")
    val jetpackShortlink: String,
    val link: String,
    @SerializedName("modified_gmt")
    val modifiedGmt: String,
    val title: Title
)