package com.sp45.vridassignment.data.dto

import com.google.gson.annotations.SerializedName

data class BlogsDto(
    @SerializedName("_links")
    val links: Links,
    @SerializedName("aioseo_notices")
    val aioseoNotices: List<Any>,
    val author: Int,
    val categories: List<Int>,
    @SerializedName("class_list")
    val classList: List<String>,
    @SerializedName("comment_status")
    val commentStatus: String,
    val content: Content,
    val date: String,
    @SerializedName("date_gmt")
    val dateGmt: String,
    val excerpt: Excerpt,
    @SerializedName("featured_media")
    val featuredMedia: Int,
    val format: String,
    val guid: Guid,
    val id: Int,
    @SerializedName("jetpack_related_posts")
    val jetpackRelatedPosts: List<Any>,
    @SerializedName("jetpack_featured_media_url")
    val jetpackFeaturedMediaUrl: String,
    @SerializedName("jetpack_likes_enabled")
    val jetpackLikesEnabled: Boolean,
    @SerializedName("jetpack_publicize_connections")
    val jetpackPublicizeConnections: List<Any>,
    @SerializedName("jetpack_sharing_enabled")
    val jetpackSharingEnabled: Boolean,
    @SerializedName("jetpack_shortlink")
    val jetpackShortlink: String,
    val link: String,
    val meta: Meta,
    val modified: String,
    @SerializedName("modified_gmt")
    val modifiedGmt: String,
    @SerializedName("ping_status")
    val pingStatus: String,
    val slug: String,
    val status: String,
    val sticky: Boolean,
    val tags: List<Int>,
    val template: String,
    val title: Title,
    val type: String
)