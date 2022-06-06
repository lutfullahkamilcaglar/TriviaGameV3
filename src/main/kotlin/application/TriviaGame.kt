package application

import application.appState.AppState
import application.appState.Reducer
import data.Question
import data.categories
import data.questions
import inputManager.InputManager
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class TriviaGame : KoinComponent {

    private var appState: AppState = AppState()

    private val inputManager by inject<InputManager>()
    private val reducer by inject<Reducer>()


    fun startApplication() {
        categories.forEachIndexed { index, category ->
            println("${index + 1}-) ${category.description()}")
        }
        val selection = inputManager.getIntWithDescription("Pick a category:")

        selection?.let {
            if (it > 0 && it < categories.size + 1) {
                appState = reducer.reduceSelectedCategory(appState, categories[it - 1])
            }
        }

        appState.selectedCategory?.let {
            val selectedQuestions = questions.filter { question ->
                question.category == it
            }.shuffled()
            askQuestions(selectedQuestions)
        }
    }

    fun askQuestions(questions: List<Question>) {
        var point = 0
        questions.forEach {
            val input = inputManager.getStringWithDescription(it.text)
            if (input == it.answer) point++
        }
        println("Your point: $point")
    }
}