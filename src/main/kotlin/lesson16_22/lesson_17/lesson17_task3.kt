package org.example.lesson_17

class Folder(private val folderName: String, private val fileCount: Int, private val isSecret: Boolean) {

    val name: String
        get() = if (isSecret) "скрытая папка" else folderName

    val files: Int
        get() = if (isSecret) 0 else fileCount

    override fun toString(): String {
        return "Папка(имя: '$name', количество файлов: $files, секретно: $isSecret)"
    }
}

fun main() {

    val secretFolder = Folder("Документы", 42, true)

    println(secretFolder.name)
    println(secretFolder.files)

    val normalFolder = Folder("Фотографии", 150, false)

    println(normalFolder.name)
    println(normalFolder.files)
}