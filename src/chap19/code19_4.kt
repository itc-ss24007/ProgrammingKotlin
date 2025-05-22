package chap19

fun main() {
    val map:MutableMap<String,String> = mutableMapOf("pen" to "ペン")
    map.put("apple","アップル")
    map += "pineapple" to "パイナップル"
    val value1 = map["pen"]
    val value2 = map["pineapple"]
    val value3 = map["apple"]
    val value4 = map["pen"]
    println("$value1, $value2, $value3, $value4")
    println(map)

    map.remove("pen")
    println(map)
    map -= "pineapple"
    println(map)
}