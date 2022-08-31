package com.bigtoapp.cleanarchitecturetest.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bigtoapp.cleanarchitecturetest.data.repository.UserRepositoryImpl
import com.bigtoapp.cleanarchitecturetest.data.storage.sharedpref.SharedPrefUserStorage
import com.bigtoapp.cleanarchitecturetest.domain.usecase.GetUserNameUseCase
import com.bigtoapp.cleanarchitecturetest.domain.usecase.SaveUserNameUseCase

class MainViewModelFactory(context: Context): ViewModelProvider.Factory {

    private val userRepository by lazy {
        UserRepositoryImpl(userStorage = SharedPrefUserStorage(context = context))
    }
    private val saveUserNameUseCase by lazy {
        SaveUserNameUseCase(userRepository)
    }
    private val getUserNameUseCase by lazy {
        GetUserNameUseCase(userRepository)
    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(
            saveUserNameUseCase = saveUserNameUseCase,
            getUserNameUseCase = getUserNameUseCase
        ) as T
    }
}