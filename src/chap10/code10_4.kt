package chap10

fun main() {
    val range_a: LongRange = 0..10000000000L
    val range_b: CharRange = 'A'..'E'
    val range_c: CharRange = 'あ'..'お'

    val flag_a = 500 in range_a
    val flag_b = 'D' in range_b
    val flag_c = 'え' in range_c

    println("flag_a=$flag_a")
    println("flag_b=$flag_b")
    println("flag_c=$flag_c")
}