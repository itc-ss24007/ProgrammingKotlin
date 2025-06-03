package chap35

data class Person(val name:String,val myNumber:Int)

fun main() {
    val p1 = Person("John",1234)
    val p2 = Person("John",1234)
    println("p1のハッシュコード：${p1.hashCode()}")
    println("p2のハッシュコード：${p2.hashCode()}")
    if (p1 == p2) {
        println("二人は同一人物")
    }else{
        println("二人は別人")
    }

    val personSet = setOf<Person>(p1,p2)
    println("personSet:${personSet}")
}