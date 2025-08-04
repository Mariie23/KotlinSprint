package org.example.lesson_2

fun main() {
    val crystal = 7
    val iron = 11
    val bonus = 0.2

    val crystalBonus: Int = (crystal * bonus).toInt()
    val ironBonus: Int = (iron * bonus).toInt()

    println("Бонус кристаллической: $crystalBonus")
    println("Бонус кристаллической: $ironBonus")


}