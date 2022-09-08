package com.bigtoapp.cleanarchitecturetest.di

import android.content.Context
import com.bigtoapp.cleanarchitecturetest.data.repository.UserRepositoryImpl
import com.bigtoapp.cleanarchitecturetest.data.storage.UserStorage
import com.bigtoapp.cleanarchitecturetest.data.storage.sharedpref.SharedPrefUserStorage
import com.bigtoapp.cleanarchitecturetest.domain.repository.UserRepositoryInterface
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    fun provideUserStorage(context: Context): UserStorage {
        return SharedPrefUserStorage(context = context)
    }

    @Provides
    fun provideUserRepository(userStorage: UserStorage): UserRepositoryInterface {
        return UserRepositoryImpl(userStorage = userStorage)
    }
}