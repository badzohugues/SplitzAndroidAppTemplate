package com.badzohugues.splitztemplateapp.data.api.model

import com.google.gson.annotations.SerializedName

data class ApiOwner(
    @SerializedName("id") val id: Int?,
    @SerializedName("login") val login: String?,
    @SerializedName("avatar_url") val avatarUrl: String?,
    @SerializedName("html_url") val htmlUrl: String?
)
