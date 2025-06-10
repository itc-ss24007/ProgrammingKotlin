package chap43

public fun testPublic() {
    println("可視性修飾子が public です。")
}
private fun testPrivate() {
    println("可視性修飾子が private です。")
}

fun testPublic2() {
    println("public な関数からprivate の関数を呼び出す")
    //同じファイル内なら、privateな関数も呼び出せる
    testPrivate()
}

public class TestPublic(){
    private val privateObject = TestPrivate()
    val testClass: TestAbstract = privateObject
}
abstract class TestAbstract{}
private class TestPrivate():TestAbstract(){}