package chap13

fun main() {
    val x = 5
    for (i in 800..1000 step 3) {
        println("${x}かける${i}は、${x*i} ")
    }
}