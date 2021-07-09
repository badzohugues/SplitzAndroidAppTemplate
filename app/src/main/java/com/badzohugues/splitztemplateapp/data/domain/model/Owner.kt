package com.badzohugues.splitztemplateapp.data.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Owner(
    val id: Int,
    val login: String,
    val avatarUrl: String,
    val htmlUrl: String
) : Parcelable
