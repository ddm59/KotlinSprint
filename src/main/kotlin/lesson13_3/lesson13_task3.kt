package org.example.lesson13_3

class PhoneDirectoryEntry(
    val name: String,
    val phoneNumber: Long,
    val company: String?
)

fun main() {
    val phoneBook = listOf(
        PhoneDirectoryEntry("John Doe", 1234567890, null),
        PhoneDirectoryEntry("Jane Smith", 9876543210, "Tech Corp"),
        PhoneDirectoryEntry("Emily Davis", 1122334455, null),
        PhoneDirectoryEntry("Michael Brown", 5566778899, "null"),
        PhoneDirectoryEntry("Sarah Johnson", 9988776655, "Health Inc")
    )
    println("\nСуществующие компании:")
    phoneBook.mapNotNull { it.company }.forEach { println(it) }
}
