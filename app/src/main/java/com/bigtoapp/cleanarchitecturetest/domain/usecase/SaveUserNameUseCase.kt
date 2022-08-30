package com.bigtoapp.cleanarchitecturetest.domain.usecase

import com.bigtoapp.cleanarchitecturetest.domain.models.SaveUserNameParam

class SaveUserNameUseCase {

    fun execute(param: SaveUserNameParam): Boolean {
        return param.name.isNotEmpty()
    }
}