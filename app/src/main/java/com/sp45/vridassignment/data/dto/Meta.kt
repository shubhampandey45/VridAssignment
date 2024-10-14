package com.sp45.vridassignment.data.dto

data class Meta(
    val _jetpack_dont_email_post_to_subs: Boolean,
    val _jetpack_memberships_contains_paid_content: Boolean,
    val _jetpack_memberships_contains_paywalled_content: Boolean,
    val _jetpack_newsletter_access: String,
    val _jetpack_newsletter_tier_id: Int,
    val footnotes: String,
    val jetpack_post_was_ever_published: Boolean,
    val jetpack_publicize_feature_enabled: Boolean,
    val jetpack_publicize_message: String,
    val jetpack_social_options: JetpackSocialOptions,
    val jetpack_social_post_already_shared: Boolean
)