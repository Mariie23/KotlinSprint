package org.example.lesson_2

fun main() {
    val hourDeparture: Int = 9
    val minutesDeparture: Int = 39
    val minutesOnTheWay: Int = 457

    val departureInMinutes = hourDeparture * 60 + minutesDeparture
    val arrivalInMinutes = departureInMinutes + minutesOnTheWay
    val hourArrival = arrivalInMinutes / 60
    val minutesArrival = arrivalInMinutes % 60
    println("Время прибытия поезда: $hourArrival:$minutesArrival")



}