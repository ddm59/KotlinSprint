package org.example.lesson22_4

class MainScreenViewModel {

    data class MainScreenState(val data: String = "отсутствие данных", val isLoading: Boolean = false)

    var mainScreenState = MainScreenState()
        private set

    fun loadData() {

        mainScreenState = MainScreenState()
        println("Состояние: $mainScreenState")

        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Состояние: $mainScreenState")

        mainScreenState = MainScreenState(data = "Загруженные данные", isLoading = false)
        println("Состояние: $mainScreenState")

    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}
