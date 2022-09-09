package com.bigtoapp.cleanarchitecturetest.domain.usecase

import com.bigtoapp.cleanarchitecturetest.domain.models.SaveUserNameParam
import com.bigtoapp.cleanarchitecturetest.domain.repository.UserRepositoryInterface

class SaveUserNameUseCase(private val userRepositoryInterface: UserRepositoryInterface) {

    fun execute(param: SaveUserNameParam): Boolean {

        val oldUserName = userRepositoryInterface.getName()

        if(oldUserName.firstName == param.name) {
            return true
        }
        return userRepositoryInterface.saveName(saveParam = param)
    }
}