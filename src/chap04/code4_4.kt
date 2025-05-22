package chap04

fun main() {
    val a = 10_000_000 // 桁区切り
    val b: Byte = 0x7f //16進数 8進数表現できません
    val c: Byte = 0b0010_1000 //2進数
    println(a)
    println(b)
    println(c)
    val f = 149_600_000.123f
    val d = 149_600_000.123
    println(f)
    println(d)
}