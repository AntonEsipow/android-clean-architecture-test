package com.bigtoapp.cleanarchitecturetest.domain.repository

import com.bigtoapp.cleanarchitecturetest.domain.models.SaveUserNameParam
import com.bigtoapp.cleanarchitecturetest.domain.models.UserName

interface UserRepositoryInterface {

    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}