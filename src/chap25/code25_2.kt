package chap25

fun main() {
    val p = Person("タケシ",5)
    p.greet()
    p.age = 10
    p.greet()
    val p2 = Person(name ="ケンタ",age = 8)
    p2.greet()
    val p3 = Person(name ="ユミ")
    p3.greet()
    val p4 = Person()
    p4.greet()
    p4.age = 12
    p4.greet()
}
class Person(val name:String = "名無しさん",var age:Int = 0){
    fun greet(){
        println("${name}です。${age}歳です")
    }
}