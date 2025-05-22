package chap07

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(0, 100)
    // a  が0~59なら　D
    // a  が60~69なら　C
    // a  が70~79なら　B
    // a  が80~89なら　A
    // a  が90~なら　S
//    if (a >=0 && a <60) {
//        println("D")
//    }else if (a >=60 && a <70) {
//        println("C")
//    }else if (a >=70 && a <80) {
//        println("B")
//    }else if (a >=80 && a <90) {
//        println("A")
//    }else {
//        println("S")
//    }
    if (a <60) {
        println("$a:D")
    }else if (a <70) {
        println("$a:C")
    }else if (a <80) {
        println("$a:B")
    }else if (a <90) {
        println("$a:A")
    }else {
        println("$a:S")
    }
}