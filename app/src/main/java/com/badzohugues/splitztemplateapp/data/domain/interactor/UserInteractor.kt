package com.badzohugues.splitztemplateapp.data.domain.interactor

import com.badzohugues.splitztemplateapp.data.domain.model.Repo
import com.badzohugues.splitztemplateapp.data.domain.usecase.UserUseCase
import com.badzohugues.staticlbcapp.misc.ResultWrapper

class UserInteractor() : UserUseCase {
    override suspend fun getUserRepos(): ResultWrapper<List<Repo>> {
        TODO("Not yet implemented")
    }

    override suspend fun searchUsersRepos(login: String): ResultWrapper<List<Repo>> {
        TODO("Not yet implemented")
    }
}
