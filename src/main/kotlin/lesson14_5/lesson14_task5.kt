package org.example.lesson14_5

fun main() {
    val chat = Chat()

    chat.addMessage("Привет всем!!", "Надежда")
    chat.addMessage("Привет, Надежда!", "Андрей")

    chat.addThreadMessage("Как поживаешь?", "Олег", 1)
    chat.addThreadMessage("Не очень, а ты?", "Надежда", 3)
    chat.addThreadMessage("Весь в работе", "Олег", 4)

    chat.printChat()
}


open class Message(val id: Int, val text: String, val author: String)
class ChildMessage(id: Int, text: String, author: String, val parentMessageId: Int) : Message(id, text, author)

class Chat() {
    private val messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(text: String, author: String) {
        messages.add(Message(nextId++, text, author))
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        if (messages.none { it.id == parentMessageId }) {
            println("Нет родительского сообщения с данным ID $parentMessageId для добавления комментария")
        }
        messages.add(ChildMessage(nextId++, text, author, parentMessageId))
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { if (it is ChildMessage) it.parentMessageId else it.id }
        val printedMessages = mutableSetOf<Int>()

        for (message in messages) {
            if (message.id !in printedMessages) {
                printMessage(message, groupedMessages, printedMessages, 0)
            }
        }
    }

    private fun printMessage(
        message: Message,
        groupedMessages: Map<Int, List<Message>>,
        printedMessages: MutableSet<Int>,
        indentLevel: Int
    ) {
        println("\t".repeat(indentLevel) + "${message.author}: ${message.text}")
        printedMessages.add(message.id)

        val childMessages = groupedMessages[message.id]
        if (childMessages != null) {
            for (child in childMessages) {
                if (child.id !in printedMessages) {
                    printMessage(child, groupedMessages, printedMessages, indentLevel + 1)
                }
            }
        }
    }
}