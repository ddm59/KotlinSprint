package org.example.lesson_6

const val ADMIN_LOGIN = "Admin"
const val ADMIN_PASSWORD = "QWERTY12345@@" // Переменные для инициализации mutableMap

fun main() {
    var userDataBase: MutableMap<String, String> = mutableMapOf(ADMIN_LOGIN to ADMIN_PASSWORD) //Имитация Базы Данных
    var userLogin: String = ""
    var userPassword: String = ""
    var isAccessGranted = false

    do {
        println("Для регистрации в системе введите следующие данные")
        print("Имя пользователя:  ")
        userLogin = readln()
        print("Введите пароль:  ")
        userPassword = readln()
        userDataBase.put(userLogin, userPassword)
        println("Для завершения регистрации необходимо авторизоваться в системе!")
        print("Имя пользователя: ")
        userLogin = readln()
        print("Пароль: ")
        userPassword = readln()
        //Проверка
        if (userDataBase.containsKey(userLogin) && userDataBase[userLogin] == userPassword) {
            isAccessGranted = true
            println("Авторизация прошла успешно!!!")
        } else {
            println("Не верные данные!!! Требуется повторить процедуру регистрации")
        }

    } while (!isAccessGranted)
}