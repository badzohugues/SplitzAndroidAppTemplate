package com.badzohugues.splitztemplateapp.data.domain.usecase

import com.badzohugues.splitztemplateapp.data.domain.model.Repo
import com.badzohugues.staticlbcapp.misc.ResultWrapper

interface UserUseCase {
    suspend fun getUserRepos(): ResultWrapper<List<Repo>>
    suspend fun searchUsersRepos(login: String): ResultWrapper<List<Repo>>
}
