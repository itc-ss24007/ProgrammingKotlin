package chap40

fun main() {
    val p1 = Person("タケシ",5)
    val p2 = Person("ケンタ",5)
    val p3 = Person("ユミ",8)
    val list = listOf(p1,p2,p3)
    //val p_max = list.maxBy { p -> p.age }
    //Person::age ==> fun(p1:Person) = p1.age
    val p_max = list.maxBy (Person::age)
    println("最年長なのは誰？")
    p_max.greet()
    //Person::displayName ==> fun(p1:Person) =p1.displayName
    val getPersonDisplayName = Person::displayName
    println(getPersonDisplayName(p_max))
}
class Person(val name: String, val age: Int){
    fun greet(){
        println("${name}です, $age 歳です")
    }

    fun displayName(): String {
        return "${name}($age)"
    }
}