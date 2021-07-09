package com.badzohugues.splitztemplateapp.data.api.model

import com.google.gson.annotations.SerializedName

data class ApiRepo(
    @SerializedName("id") val id: Int?,
    @SerializedName("name") val name: String?,
    @SerializedName("private") val private: Boolean?,
    @SerializedName("owner") val owner: ApiOwner?,
    @SerializedName("description") val description: String?,
    @SerializedName("html_url") val htmlUrl: String?,
    @SerializedName("created_at") val createdAt: String?,
    @SerializedName("updated_at") val updatedAt: String?
)
