package org.example.lesson_2
const val SECONDS_IN_MINUTE = 60
fun main() {
    val hourDeparture: Int = 9
    val minutesDeparture: Int = 39
    val minutesOnTheWay: Int = 457

    val departureInMinutes = hourDeparture * SECONDS_IN_MINUTE + minutesDeparture
    val arrivalInMinutes = departureInMinutes + minutesOnTheWay
    val hourArrival = arrivalInMinutes / SECONDS_IN_MINUTE
    val minutesArrival = arrivalInMinutes % SECONDS_IN_MINUTE
    println("Время прибытия поезда: $hourArrival:$minutesArrival")



}