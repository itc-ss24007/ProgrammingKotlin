package chap42

import jp.ac.it_college.std.s24007.example.cars.Car as Car42
import chap27.Car

fun main() {
    val c1 = Car42("赤")
    val c2 = Car42("青")
    c1.drive()
    c2.drive()
    val c3 = Car("白")
    c3.drive(10.0)
}