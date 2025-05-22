package chap50

//code13_2 を書き換えてみる
fun main() {
    val x = 5
    (1..9).forEach {
        println("${x}かける${it}は${x * it}です。")
    }
}