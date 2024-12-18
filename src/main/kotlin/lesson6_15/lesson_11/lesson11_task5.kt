package org.example.lesson6_15.lesson_11


fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Андрей")
    val user2 = forum.createNewUser("Татьяна")

    forum.createNewMessage(user1.userId, "Привет! Как дела?")
    forum.createNewMessage(user2.userId, "Привет всем!!!")
    forum.createNewMessage(user1.userId, "Как поживаешь?")
    forum.createNewMessage(user2.userId, "Отлично а Ты?")
    forum.printThread()
}

class Forum() {
    private val forumUsers: MutableList<ForumUser> = mutableListOf()
    private val forumMessages: MutableList<ForumMessage> = mutableListOf()
    private var userIdGenerator = 1

    data class ForumUser(val userId: Int, val userName: String)
    data class ForumMessage(val authorId: Int, val message: String)

    class ForumUserBuilder {
        private var userId: Int = 0
        private var userName: String = ""

        fun setUserName(userName: String) = apply { this.userName = userName }
        fun setUserId(userId: Int) = apply { this.userId = userId }
        fun build(): ForumUser {
            return ForumUser(userId, userName)
        }
    }

    class ForumMessageBuilder {
        private var authorId: Int = 0
        private var message: String = ""

        fun setAuthorId(authorId: Int) = apply { this.authorId = authorId }
        fun setMessage(message: String) = apply { this.message = message }
        fun build(): ForumMessage {
            return ForumMessage(authorId, message)
        }
    }

    fun createNewUser(userName: String): ForumUser {
        val newUser = ForumUserBuilder()
            .setUserName(userName)
            .setUserId(userIdGenerator++)
            .build()
        forumUsers.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        if (forumUsers.any { it.userId == authorId }) {
            val newMessage = ForumMessageBuilder()
                .setAuthorId(authorId)
                .setMessage(message)
                .build()
            forumMessages.add(newMessage)
            return newMessage
        }
        println("Ошибка: пользователя с таким ID $authorId не существует на форуме.")
        return null
    }

    fun printThread() {
        forumMessages.forEach { message ->
            val author = forumUsers.find { it.userId == message.authorId }?.userName ?: "Unknown"
            println("$author: ${message.message}")
        }
    }
}


