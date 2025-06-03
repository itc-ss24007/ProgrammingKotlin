package chap35

class Person1(val name: String,val myNumber: Int)

fun main() {
    val p1 = Person1("John", 1234)
    val p2 = Person1("Mary", 5678)

    if(p1 == p2){
        println("二人は同一人物")
    }else{
        println("二人は別人")
    }
    val p3 = Person1("John", 1234)
    if(p3 == p1){
        println("二人は同一人物")
    }else{
        println("二人は別人")
    }
}