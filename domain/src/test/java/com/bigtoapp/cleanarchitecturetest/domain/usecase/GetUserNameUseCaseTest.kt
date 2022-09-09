package com.bigtoapp.cleanarchitecturetest.domain.usecase

import com.bigtoapp.cleanarchitecturetest.domain.models.UserName
import com.bigtoapp.cleanarchitecturetest.domain.repository.UserRepositoryInterface
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.kotlin.mock

class GetUserNameUseCaseTest {

    val userRepositoryInterface = mock<UserRepositoryInterface>()

    @Test
    fun `should return the same data as in repository`() {

        val testUserName = UserName(firstName = "test first name", lastName = "test last name")
        Mockito.`when`(userRepositoryInterface.getName()).thenReturn(testUserName)

        val useCase = GetUserNameUseCase(userRepositoryInterface = userRepositoryInterface)
        val actual = useCase.execute()
        val expected = UserName(firstName = "test first name", lastName = "test last name")

        Assertions.assertEquals(expected, actual)
    }
}