package chap17

fun main() {
    val a: List<Int> = listOf(1000,1200,1500)
    println("1年目の時給は　${a[0]}円です")
    println("2年目の時給は　${a[1]}円です")
    println("3年目の時給は　${a[2]}円です")

    for(i in a) {
        println("時給は${i}円です")
    }

    for((index, value) in a.withIndex()) {
        println("${index + 1}年目の時給は${value}円です")
    }
}