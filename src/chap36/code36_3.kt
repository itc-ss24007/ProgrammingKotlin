package chap36

fun main() {
    var p = Person()
    p.setNameAndAge("Mary",10)
    p.greet()
}
class Person{
    var name = ""
    var age = 0

    fun setNameAndAge(name:String, age:Int){
        this.name = name
        this.age = age
    }

    fun greet(){
        println("${name}です。${age}歳です。")
    }
}