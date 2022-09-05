package com.bigtoapp.cleanarchitecturetest.di

import com.bigtoapp.cleanarchitecturetest.data.repository.UserRepositoryImpl
import com.bigtoapp.cleanarchitecturetest.data.storage.UserStorage
import com.bigtoapp.cleanarchitecturetest.data.storage.sharedpref.SharedPrefUserStorage
import com.bigtoapp.cleanarchitecturetest.domain.repository.UserRepositoryInterface
import org.koin.dsl.module

val dataModule = module {

    single<UserStorage> {
        SharedPrefUserStorage(context = get())
    }

    single<UserRepositoryInterface> {
        UserRepositoryImpl(userStorage = get())
    }
}