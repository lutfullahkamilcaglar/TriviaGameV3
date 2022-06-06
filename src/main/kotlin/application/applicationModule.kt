package application

import application.appState.Reducer
import inputManager.InputManager
import inputManager.InputManagerImpl
import org.koin.dsl.module

val applicationModule = module {

    single<InputManager> { InputManagerImpl() }

    single { Reducer() }

}