package chap43

fun main() {
    val car = Car2("blue")
    car.drive()
    car.drive()
    //car.fuel = 70.0 publicなプロパティのprotectedなセッターは外から呼び出せない
    println("燃料の残り：${car.fuel}")
    val prius = Prius2("yellow")
    prius.drive()
    prius.drive()
//    prius.fuel = 100
    println("燃料の残り:${prius.fuel}")
}