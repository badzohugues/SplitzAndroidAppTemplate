package com.badzohugues.splitztemplateapp.data.api.service

import com.badzohugues.splitztemplateapp.data.domain.model.Repo
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface UserApiService {
    @GET("user/repos")
    suspend fun getUserRepos(): Response<List<Repo>>

    @GET("users/{login}/repos")
    suspend fun searchUsersRepos(@Path("login") login: String): Response<List<Repo>>
}
