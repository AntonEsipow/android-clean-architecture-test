package com.bigtoapp.cleanarchitecturetest.domain.usecase

import com.bigtoapp.cleanarchitecturetest.domain.models.SaveUserNameParam
import com.bigtoapp.cleanarchitecturetest.domain.repository.UserRepositoryInterface

class SaveUserNameUseCase(private val userRepositoryInterface: UserRepositoryInterface) {

    fun execute(param: SaveUserNameParam): Boolean {
        return userRepositoryInterface.saveName(saveParam = param)
    }
}