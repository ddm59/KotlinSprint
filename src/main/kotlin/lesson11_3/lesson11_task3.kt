package org.example.lesson11_3

fun main() {
    val user1 = User(
        1,
        "Андрей",
        "Аватарка с котом",
    )
    val user2 = User(
        2,
        "Анастасия",
        "Девушка на фоне небоскреба",
    )
    var room1 = Room(
        1,
        "Пластинка",
        "Music is live",
    )
    room1.addUser(user1)
    room1.addUser(user2)
    room1.getRoomInfo()
    room1.getUsersInfo()
    room1.changeStatus("Андрей", "Живу жизнь")
    room1.getUsersInfo()
}


class Room(
    val id: Int,
    var cover: String,
    var name: String,
    val members: MutableList<User> = mutableListOf(),
) {
    fun addUser(newUser: User) {
        members.add(newUser)
    }

    fun removeUser(userToRemove: User) {
        members.remove(userToRemove)
    }

    fun changeStatus(userName: String, newStatus: String) {
        for (user in members) {
            if (user.name == userName) {
                user.status = newStatus
            }
        }
    }

    fun getUsersInfo() {
        println("Информация о пользователях комнаты $name: ")
        for (user in members) {
            println(
                """
                Имя пользователя: ${user.name}
                Иконка: ${user.icon}
                Статус: ${user.status}
            """.trimIndent()
            )
        }
    }

    fun getRoomInfo() {
        println(
            """
            Имя комнаты: $name
            Обложка: $cover
        """.trimIndent()
        )
    }
}

class User(
    val id: Int,
    val name: String,
    val icon: String,
    var status: String = "",
)