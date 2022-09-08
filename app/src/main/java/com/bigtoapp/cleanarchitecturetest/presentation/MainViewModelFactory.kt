package com.bigtoapp.cleanarchitecturetest.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bigtoapp.cleanarchitecturetest.data.repository.UserRepositoryImpl
import com.bigtoapp.cleanarchitecturetest.data.storage.sharedpref.SharedPrefUserStorage
import com.bigtoapp.cleanarchitecturetest.domain.usecase.GetUserNameUseCase
import com.bigtoapp.cleanarchitecturetest.domain.usecase.SaveUserNameUseCase

class MainViewModelFactory(
    private val saveUserNameUseCase : SaveUserNameUseCase,
    private val getUserNameUseCase : GetUserNameUseCase
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(
            saveUserNameUseCase = saveUserNameUseCase,
            getUserNameUseCase = getUserNameUseCase
        ) as T
    }
}