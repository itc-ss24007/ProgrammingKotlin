package chap16

fun main() {
    val a: IntArray = intArrayOf(1000, 1200,1500,1800,2400,3000,3800)
    for(money in a) {//変数右クリックして、リファクタリング、shift+F6
        println("時給は${money}円です。")
    }
}