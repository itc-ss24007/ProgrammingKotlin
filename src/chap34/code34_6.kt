
package chap34

import kotlin.math.sqrt

fun main() {
    val number1 = null
    val number2 = 10

    printCubSquareRoot(number1)
    printCubSquareRoot(number2)
}

fun printCubSquareRoot(num: Int?) {
    if(num == null) {
        println("nullなので、何もしない")
        return
    }
    val result = sqrt((num * num * num).toDouble())
    println("${num}を3乗した数は${result}です。")
}