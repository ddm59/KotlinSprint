package org.example.lesson_8

fun main(){
    val advertisingViews: IntArray = intArrayOf(7)
    var weekViews = 0

    for (i in 0..6 ){
        advertisingViews[0] = (50..1000).random()  // Генерация массива с просмотрами
    }

    for (i in advertisingViews){
        weekViews += i                                  //Подсчет кол-ва просмотров за неделю
    }
    println("Количество просмотров за неделю: $weekViews")
}