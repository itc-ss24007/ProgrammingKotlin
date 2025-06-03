package chap34

fun main() {
    val number = 123
    val text = "あいうえお"
    val car = Car("赤")
    val person = Person("タケシ",5)
    printClassInfo(number)
    printClassInfo(text)
    printClassInfo(car)
    printClassInfo(person)

}
fun printClassInfo(obj: Any) {
    val hashcode = obj.hashCode()
    val text = obj.toString()
    println("テキスト=$text、ハッシュコード=${hashcode}")
    if (obj is Person) {
        println("これはPersonクラスのインスタンスですね！")
        obj.greet()
    }else if (obj is Car){
        println("これはCarクラスのインスタンスですね！")
        obj.drive(100.0)
    }
}
class Car(var color: String){
    fun drive(d: Double){
        println("${color}の車が${d}km走りました。")
    }
}
class Person(var name: String, var age: Int){
    fun greet(){
        println("${name}です。${age}歳です。")
    }
}