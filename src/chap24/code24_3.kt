package chap24

fun main() {
    val p = Person()
    p.age = 30
    p.age = 25
    p.age = 80
    p.age = 10
    p.name = "abc"
    println(p.message)
}
class Person{
    var name:String = ""
    var age:Int = 0
//    set(value) {
//        print("${field}歳から ${value}歳になりました")
//        if(value<field) println("->なんと！若返りましたよ！")
//        else if(value>field) println("->ああ、年を取るのは、いやだなあ。")
//        field = value
//    }
    val message: String
    get(){
        return "${name}です。${age}歳です"
    }
}