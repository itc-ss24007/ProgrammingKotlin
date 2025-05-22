package chap50

fun main() {
    val a = listOf("a", "b", "c")
    println("forEach 使いう方法１")
    a.forEach { println(it) }

    println("forEach 使いう方法2")
    a.forEach ( ::println)
}
