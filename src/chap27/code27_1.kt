package chap27

open class Car(val color: String){
    var distance = 0.0
    open fun drive(d:Double) {
        distance += d
        println("${color}の車が${d}km が走りました。")
        println("その結果、マイレージは ${distance} キロになりました。")
    }
}

/*
fun main() {
    val car = Car()
    car.drive(5.0)
    car.drive(10.0)
}*/
