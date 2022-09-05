package com.bigtoapp.cleanarchitecturetest.di

import com.bigtoapp.cleanarchitecturetest.domain.usecase.GetUserNameUseCase
import com.bigtoapp.cleanarchitecturetest.domain.usecase.SaveUserNameUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<SaveUserNameUseCase> {
        SaveUserNameUseCase(userRepositoryInterface = get())
    }

    factory<GetUserNameUseCase> {
        GetUserNameUseCase(userRepositoryInterface = get())
    }
}