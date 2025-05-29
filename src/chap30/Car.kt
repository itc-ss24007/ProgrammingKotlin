package chap30

abstract class Car(val color:String) {
    var distance: Double = 0.0
    abstract fun drive(d: Double)
}