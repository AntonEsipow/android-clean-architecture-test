package com.bigtoapp.cleanarchitecturetest.di

import com.bigtoapp.cleanarchitecturetest.domain.repository.UserRepositoryInterface
import com.bigtoapp.cleanarchitecturetest.domain.usecase.GetUserNameUseCase
import com.bigtoapp.cleanarchitecturetest.domain.usecase.SaveUserNameUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideSaveUserNameUseCase(
        userRepositoryInterface: UserRepositoryInterface
    ): SaveUserNameUseCase  {
        return SaveUserNameUseCase(userRepositoryInterface = userRepositoryInterface)
    }

    @Provides
    fun provideGetUserNameUseCase(
        userRepositoryInterface: UserRepositoryInterface
    ): GetUserNameUseCase{
        return GetUserNameUseCase(userRepositoryInterface = userRepositoryInterface)
    }
}