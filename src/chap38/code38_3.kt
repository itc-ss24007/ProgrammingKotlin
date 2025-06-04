package chap38

fun main() {
    val closureA = getCountClosure()
    val closureB = getCountClosure()
    println("クロージャーが返した値　="+closureA())
    println("クロージャーが返した値　="+closureA())
    println("クロージャーが返した値　="+closureA())
    println("クロージャーが返した値　="+closureB())
    println("クロージャーが返した値　="+closureB())
    println("クロージャーが返した値　="+closureA())
}
fun getCountClosure(): () -> Int {
    var num = 0
    return fun() =++num
}