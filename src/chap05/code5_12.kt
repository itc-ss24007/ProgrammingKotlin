package chap05

fun main() {
    val message = """|
        |こんにちは、世界！
        |私はKotlinに関して勉強しています。
        |皆さん、
    """.trimMargin()
    println(message)
    val world = "世界！"
    val message2 = """
        こんにちは、${world}
        私はKotlinに関して勉強しています。
        皆さん
    """.trimIndent()
    println(message2)
}