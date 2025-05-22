package chap18

import jdk.internal.org.jline.utils.Colors.s
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.system.measureTimeMillis

fun main() {
    val targetSet = mutableSetOf<Int>()
    for (x in 1..10000) {
        targetSet+= Random.nextInt(0..100_000_000)
    }
    val targetList = targetSet.toMutableList()

    val listTime = measureTimeMillis {
        for (x in 0..100_000_000) {
            val result = targetList.contains(x)
        }
    }
    println("MutableListの検索時間：$listTime ミリ秒")
}