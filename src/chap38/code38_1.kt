package chap38

fun main() {
    val c1 = getTextClosure("さん")
    val c2 = getTextClosure("くん")
    val c3 = getTextClosure("ちゃん")

    val name1 = c1("タケシ")
    val name2 = c2("タケシ")
    val name3 = c3("タケシ")

    println(name1)
    println(name2)
    println(name3)
}
fun getTextClosure(x: String): (String) -> String {
    return fun(name) = name + x
}