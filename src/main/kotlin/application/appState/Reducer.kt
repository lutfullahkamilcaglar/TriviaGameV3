package application.appState

import data.Category

class Reducer {

    fun reduceSelectedCategory(state: AppState, category: Category): AppState {
        return state.copy(selectedCategory = category)
    }

}