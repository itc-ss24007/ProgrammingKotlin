package chap12

import kotlin.random.Random

fun main() {
    val x = Random.nextInt(1,5)
    when (x) {
        1,2 -> {println("ワンかツーのどちらかです")
        println("こんにちは")
        }
        3 -> {
            println("スリー")
            println("ok")
        }
        else -> {
            println("ワンかツー、スリー以外の数字です")
            println("hello")
        }
    }
}