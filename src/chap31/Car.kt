package chap31

open class Car(val color: String) {
    var distance = 0.0
    open fun drive(d: Double) {
        distance += d
        println("${color}の車が${d}キロ走りました")
        println("その結果、マイレージは${distance}キロになりました。")
    }
}