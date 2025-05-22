package chap50

fun main() {
    print("文字を入力してください：")
    val x = readln()
    print("もう一度入力してください：")
    val y = readln()
    print("$x $y が同じか? ${x == y}")
}