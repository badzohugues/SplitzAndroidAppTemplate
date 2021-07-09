package com.badzohugues.splitztemplateapp.data.db.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "repo")
data class DbRepo(
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "private") val private: Boolean,
    @ColumnInfo(name = "owner") val owner: DbOwner,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "htmlUrl") val htmlUrl: String
)
