package chap43

fun main() {
    testPublic()
//    testPrivate()
    testPublic2()

    val a = TestPublic()
//    val b = TestPrivate()
    val b: TestAbstract = a.testClass
    println(b)
}