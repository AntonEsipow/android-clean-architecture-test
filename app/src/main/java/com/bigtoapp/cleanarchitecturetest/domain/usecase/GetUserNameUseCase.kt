package com.bigtoapp.cleanarchitecturetest.domain.usecase

import com.bigtoapp.cleanarchitecturetest.domain.models.UserName
import com.bigtoapp.cleanarchitecturetest.domain.repository.UserRepositoryInterface

class GetUserNameUseCase(private val userRepositoryInterface: UserRepositoryInterface) {

    fun execute(): UserName {
        return userRepositoryInterface.gatName()
    }
}