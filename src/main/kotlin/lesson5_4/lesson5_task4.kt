package org.example.lesson5_4

const val USER_LOGIN: String = "Zaphod"
const val USER_PASSWORD: String = "PanGalactic"
const val USER_GREETINGS: String = """
    
    -Внимание, пассажир.
    -Моя обязанность, как обычно, незавидная, 
    - приветствовать вас на борту корабля "Heart of Gold". 
    -[вздыхает...] 
    -Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
    -Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. 
    -[вздыхает ещё глубже...] 
    -Да, вперед, пожалуйста, вводите свои данные...
    
"""
const val SUCCESS_AUTH: String = """
    
    -[вздыхает...] Ваши данные проверены, и о, чудо, они верны... 
    -Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". 
    -Хотя мне всё равно... Ну вперед, войдите... 
    -Если вам так уж надо, в конце концов... 
    -[меланхолический вздох...] 
    -Надеюсь, вам понравится пребывание здесь больше, чем мне.
    
"""
fun main() {
    var newUserLogin: String =""
    var newUserPassword: String =""
    var currentUserLogin: String = ""
    var currentUserPassword: String = ""

    println(USER_GREETINGS.trimIndent())
    print("Имя пользователя:  ")
    currentUserLogin = readln()
    print("Пароль:  ")
    currentUserPassword = readln()

    when{
        (currentUserLogin==USER_LOGIN && currentUserPassword==USER_PASSWORD) -> println(SUCCESS_AUTH.trimMargin())
        (currentUserLogin!=USER_LOGIN) -> {
            print("Пользователь не зарегестрирован.\nНеобходимо пройти процедуру регистрации...\nВведите имя пользователя: ")
            newUserLogin = readln()
            print("Отлично.\n Введите пароль: ")
            newUserPassword = readln()
            //Так как зарегестрировали нового пользователя,меняем имя в тексте на нового пользователя
            println(SUCCESS_AUTH.replace("Zaphod", newUserLogin))
        }
    }

}