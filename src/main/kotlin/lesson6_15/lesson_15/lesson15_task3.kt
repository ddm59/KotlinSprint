package org.example.lesson_15

abstract class ForumUser(val username: String) {
    abstract fun readForum()
    abstract fun writeMessage(message: String)
}

class RegularUser(username: String) : ForumUser(username) {
    override fun readForum() {
        println("$username читает сообщения форума.")
    }

    override fun writeMessage(message: String) {
        println("$username пишет сообщения: $message")
    }
}

class AdminUser(username: String) : ForumUser(username) {
    override fun readForum() {
        println("$username (Admin) читает сообщения форума.")
    }

    override fun writeMessage(message: String) {
        println("$username (Admin) пишет сообщение: $message")
    }

    fun deleteMessage(messageId: Int) {
        println("$username (Admin) удалил сообщение с ID: $messageId")
    }

    fun deleteUser(user: ForumUser) {
        println("$username (Admin) удалил пользователя: ${user.username}")
    }
}

fun main() {
    val user1 = RegularUser("JohnDoe")
    val admin1 = AdminUser("JaneDoe")

    // Regular user actions
    user1.readForum()
    user1.writeMessage("Привет, всем!")

    // Admin actions
    admin1.readForum()
    admin1.writeMessage("Добро пожаловать на форум!")
    admin1.deleteMessage(101)
    admin1.deleteUser(user1)
}