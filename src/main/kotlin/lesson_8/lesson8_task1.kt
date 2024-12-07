package org.example.lesson_8

fun main(){
    val advertisingViews = Array<Int>(7){0}
    println(advertisingViews.size)
    var weekViews = 0

    for (i in 0..6 ){
        advertisingViews[i] = (50..1000).random()
    }
    weekViews = advertisingViews.sum()
    println("Количество просмотров за неделю: $weekViews")
}