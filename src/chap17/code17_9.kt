package chap17

fun main() {
    val a:MutableList<String> = mutableListOf("こんにちは", "Kotlin","どうぞ", "よろしく")
    for((i,x) in a.withIndex()) {
        println("$i -> $x")
    }
    a.removeAt(2)
    for((i,x) in a.withIndex()) {
        println("$i -> $x")
    }
}