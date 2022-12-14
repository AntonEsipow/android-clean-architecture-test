# android-clean-architecture-test
 
## About
The application is built on the principle of clean architecture. 
It's logic was divided into 3 modules: data, domain, presentation. 
Were tested 3 ways of adding DI : Koin, Dagger2, HIlt. 
Was written unit tests for UseCases and ViewModel. 
JUnit5 and Mockito were used for testing.
 
 ## Structure
![AppArchitecture drawio](https://user-images.githubusercontent.com/89312934/189488333-40ddd619-59bf-40d0-9d23-9c1ca37c6e5c.png)

## Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes.
- Dependency injection
  - [Koin](https://insert-koin.io/) - A smart Kotlin injection library to keep you focused on your app, not on your tools.
  - [Dagger](https://dagger.dev/) - Dagger is a fully static, compile-time dependency injection framework for Java, Kotlin, and Android.
  - [Hilt](https://dagger.dev/hilt/) - Hilt provides a standard way to incorporate Dagger dependency injection into an Android application.
- Testing
  - [JUnit5](https://junit.org/junit5/) - The JUnit Platform serves as a foundation for launching testing frameworks on the JVM. 
  - [Mockito](https://site.mockito.org/) - Mockito is a mocking framework that tastes really good. It lets you write beautiful tests with a clean & simple API.
