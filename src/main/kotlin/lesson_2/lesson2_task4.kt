package org.example.lesson_2
const val PERCENT = 100

fun main() {
    val crystal = 7
    val iron = 11
    val bonusPercent = 20

    val percentCalc = bonusPercent / PERCENT.toFloat()
    val crystalBonus: Int = (crystal * percentCalc).toInt()
    val ironBonus: Int = (iron * percentCalc).toInt()

    println("Бонус кристаллической: $crystalBonus")
    println("Бонус кристаллической: $ironBonus")


}