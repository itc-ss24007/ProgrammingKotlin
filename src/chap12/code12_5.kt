package chap12

import kotlin.random.Random

fun main() {
    val x = Random.nextInt(1,5)
    val message =when (x) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        else -> "ワンかツー、スリー以外の数字です"
    }
    println(message)
}