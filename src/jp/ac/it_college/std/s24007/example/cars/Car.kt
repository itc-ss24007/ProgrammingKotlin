package jp.ac.it_college.std.s24007.example.cars

open class Car(var color: String) {
    open fun drive(){
        println("${color}の車が走っています。")
    }
}