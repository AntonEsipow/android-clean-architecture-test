package com.bigtoapp.cleanarchitecturetest.app

import android.app.Application
import com.bigtoapp.cleanarchitecturetest.di.AppComponent
import com.bigtoapp.cleanarchitecturetest.di.AppModule
import com.bigtoapp.cleanarchitecturetest.di.DaggerAppComponent

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(context = this))
            .build()
    }
}