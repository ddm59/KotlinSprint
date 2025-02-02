package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String? {

    if (this.isEmpty()) return null

    return this.maxByOrNull { it.value }?.key
}

fun main() {
    val skills = mapOf(
        "Сила" to 50,
        "Ловкость" to 70,
        "Интеллект" to 70,
        "Выносливость" to 40
    )

    val topSkill = skills.maxCategory()

    if (topSkill != null) {
        println("Навык с максимальным опытом: $topSkill")
    } else {
        println("Нет доступных навыков.")
    }
}