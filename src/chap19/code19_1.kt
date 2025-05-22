package chap19

fun main() {
    val map: Map<String, String> = mapOf("pen" to "ペン", "apple" to "アップル",
        "pineapple" to "パイナップル")
    val value1 = map["pen"]
    val value2 = map["pineapple"]
    val value3 = map["apple"]
    val value4 = map["pen"]
    println("$value1 - $value2 - $value3 - $value4")
}