package com.bigtoapp.cleanarchitecturetest.domain.usecase

import com.bigtoapp.cleanarchitecturetest.domain.models.SaveUserNameParam
import com.bigtoapp.cleanarchitecturetest.domain.models.UserName
import com.bigtoapp.cleanarchitecturetest.domain.repository.UserRepositoryInterface
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.kotlin.any
import org.mockito.kotlin.mock

class SaveUserNameUseCaseTest {

    val userRepository = mock<UserRepositoryInterface>()

    @AfterEach
    fun tearDown() {
        Mockito.reset(userRepository)
    }

    @Test
    fun `should not return data if name was already saved`() {

        val testUserName = UserName(firstName = "test first name", lastName = "test last name")
        Mockito.`when`(userRepository.getName()).thenReturn(testUserName)

        val useCase = SaveUserNameUseCase(userRepositoryInterface = userRepository)

        val testParam = SaveUserNameParam(name = "test first name")
        val actual = useCase.execute(testParam)
        val expected = true
        Assertions.assertEquals(expected, actual)
        Mockito.verify(userRepository, Mockito.never()).saveName(saveParam = any())
    }

    @Test
    fun `should return true if save was successful`() {
        val testUserName = UserName(firstName = "test first name", lastName = "test last name")
        Mockito.`when`(userRepository.getName()).thenReturn(testUserName)

        val expected = true
        val testParam = SaveUserNameParam(name = "new first name")
        Mockito.`when`(userRepository.saveName(testParam)).thenReturn(expected)

        val useCase = SaveUserNameUseCase(userRepositoryInterface = userRepository)
        val actual = useCase.execute(testParam)

        Assertions.assertEquals(expected, actual)
        Mockito.verify(userRepository, Mockito.times(1)).saveName(saveParam = testParam)
    }

    @Test
    fun `should return false if save was successful`() {
        val testUserName = UserName(firstName = "test first name", lastName = "test last name")
        Mockito.`when`(userRepository.getName()).thenReturn(testUserName)

        val expected = false
        val testParam = SaveUserNameParam(name = "new first name")
        Mockito.`when`(userRepository.saveName(testParam)).thenReturn(expected)

        val useCase = SaveUserNameUseCase(userRepositoryInterface = userRepository)
        val actual = useCase.execute(testParam)

        Assertions.assertEquals(expected, actual)
        Mockito.verify(userRepository, Mockito.times(1)).saveName(saveParam = testParam)
    }
}