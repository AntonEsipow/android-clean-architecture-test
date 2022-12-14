package com.bigtoapp.cleanarchitecturetest.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.bigtoapp.cleanarchitecturetest.R
import com.bigtoapp.cleanarchitecturetest.data.repository.UserRepositoryImpl
import com.bigtoapp.cleanarchitecturetest.data.storage.sharedpref.SharedPrefUserStorage
import com.bigtoapp.cleanarchitecturetest.domain.models.SaveUserNameParam
import com.bigtoapp.cleanarchitecturetest.domain.models.UserName
import com.bigtoapp.cleanarchitecturetest.domain.repository.UserRepositoryInterface
import com.bigtoapp.cleanarchitecturetest.domain.usecase.GetUserNameUseCase
import com.bigtoapp.cleanarchitecturetest.domain.usecase.SaveUserNameUseCase
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataTextView = findViewById<TextView>(R.id.dataTextView)
        val dataEditText = findViewById<EditText>(R.id.dataEditText)
        val sendButton = findViewById<Button>(R.id.sendButton)
        val receiveButton = findViewById<Button>(R.id.receiveButton)

        viewModel.resultLive.observe(this) { text ->
            dataTextView.text = text
        }

        sendButton.setOnClickListener {
            // Click on Save Data button
            val text = dataEditText.text.toString()
            viewModel.save(text)
        }

        receiveButton.setOnClickListener {
            // Click on Get Data button
            viewModel.load()
        }
    }
}