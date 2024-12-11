package org.example.lesson_5

const val LOWER_BMI_LIMIT = 18.5
const val MIDDLE_BMI_LIMIT = 25.0
const val UPPER_BMI_LIMIT = 30.0
const val CENTIMETER_IN_METER = 100
const val GREETINGS_TEXT = "Приветствуем вас в калькуляторе для расчета индекса массы тела."
const val WEIGHT_REQUEST_TEXT = "Введите свой вес в кг.: "
const val GROWTH_REQUEST_TEXT = "Введите свой рост в см.: "


fun main() {
    println(GREETINGS_TEXT)
    println(WEIGHT_REQUEST_TEXT)
    var userWeight = readln().toFloat()
    println(GROWTH_REQUEST_TEXT)
    var userGrowth = readln().toFloat()
    var growthInMeter = userGrowth / CENTIMETER_IN_METER
    var userBmiIndex = (userWeight / (growthInMeter * growthInMeter))
    var diagnosticResult = ""

    when {
        (userBmiIndex < LOWER_BMI_LIMIT) -> diagnosticResult = "недостаточная масса тела."
        (userBmiIndex >= LOWER_BMI_LIMIT && userBmiIndex < MIDDLE_BMI_LIMIT) -> diagnosticResult =
            "нормальная масса тела"

        (userBmiIndex >= MIDDLE_BMI_LIMIT && userBmiIndex < UPPER_BMI_LIMIT) -> diagnosticResult =
            "избыточная масса тела"

        (userBmiIndex >= UPPER_BMI_LIMIT) -> diagnosticResult = "ожирение"
    }

    println(String.format("Ваш индекс массы тела: %.2f. У вас $diagnosticResult.", userBmiIndex))
}