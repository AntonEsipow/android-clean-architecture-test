package com.bigtoapp.cleanarchitecturetest.data.storage

import com.bigtoapp.cleanarchitecturetest.data.storage.models.User

interface UserStorage {

    fun save(user: User): Boolean

    fun getUser(): User
}