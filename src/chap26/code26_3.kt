package chap26

fun main() {
    val p = Person(7)
    val p1 = Person("鈴木","タロウ")
}
class Person(val name:String,var age: Int){
    init{
        println("コンストラクタのイニシャライザがよばれました。")
        println("${name}です。 ${age}歳です")
    }
    constructor(age:Int) : this("名無しさん",age){
        println("年齢だけを指定するセカンダリコンストラクタのイニシャライザが呼ばれました。")
    }
    constructor(lastName:String,firstName: String) :
            this(name="$lastName $firstName",age = 20){
                println("苗字と名前を指定するセカンダリコンストラクタのイニシャライザが呼ばれました。")
            }
}