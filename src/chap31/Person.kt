package chap31

open class Person (val name: String, var age: Int) {
    fun greet() {
        println("${name}です、${age}歳です")
    }
}
