package chap18

fun main() {
    val x = mutableListOf("a", "b", "c", "d", "e")
    println("要素数：${x.count()}")
    x+="a"
    x+= "a"
    println("要素数：${x.count()}")

    val y = mutableSetOf("a", "b", "c", "d", "e")
    println("要素数：${y.count()}")
    y+="a"
    y+= "a"
    println("要素数：${y.count()}")
}