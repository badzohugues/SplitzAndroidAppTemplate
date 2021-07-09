package com.badzohugues.splitztemplateapp.data.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
data class Repo(
    val id: Int,
    val name: String,
    val private: Boolean,
    val owner: Owner,
    val description: String,
    val htmlUrl: String,
    val createdAt: Date,
    val updatedAt: Date
) : Parcelable
