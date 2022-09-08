package com.bigtoapp.cleanarchitecturetest.di

import com.bigtoapp.cleanarchitecturetest.presentation.MainActivity
import dagger.Component

@Component(modules = [AppModule::class, DomainModule::class, DataModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}