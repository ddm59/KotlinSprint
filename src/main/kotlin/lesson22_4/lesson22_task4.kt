package org.example.lesson22_4


data class MainScreenState(val data: String = "отсутствие данных", val isLoading: Boolean = false)

class MainScreenViewModel {
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
