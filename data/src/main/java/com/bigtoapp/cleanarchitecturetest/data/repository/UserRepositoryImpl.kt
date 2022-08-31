package com.bigtoapp.cleanarchitecturetest.data.repository

import android.content.Context
import com.bigtoapp.cleanarchitecturetest.data.storage.UserStorage
import com.bigtoapp.cleanarchitecturetest.data.storage.models.User
import com.bigtoapp.cleanarchitecturetest.domain.models.SaveUserNameParam
import com.bigtoapp.cleanarchitecturetest.domain.models.UserName
import com.bigtoapp.cleanarchitecturetest.domain.repository.UserRepositoryInterface

class UserRepositoryImpl(private val userStorage: UserStorage): UserRepositoryInterface {

    override fun saveName(saveParam: SaveUserNameParam): Boolean {
        val user = mapToStorage(saveParam)
        return userStorage.save(user)
    }

    override fun getName(): UserName {
        val user = userStorage.getUser()
        return mapToDomain(user)
    }

    private fun mapToStorage(saveParam: SaveUserNameParam): User {
        return User(firstName = saveParam.name, lastName = "")
    }

    private fun mapToDomain(user: User): UserName {
        return UserName(firstName = user.firstName, lastName = user.lastName)
    }
}