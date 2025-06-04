package chap37

fun main() {
    val p1 = fun(x:Double, y:Double) = x + y
    val p2 = fun(x:Double, y:Double):Double = x + y
    val p3 = fun(x:Double, y:Double):Double {
        return x + y
    }
    val p4: (Double, Double) -> Double = fun(x:Double, y:Double):Double {
        return x + y
    }
    val p5: (Double, Double) -> Double = fun(x,y)=x+y

    printRandValuesCaluclation(p1)
    printRandValuesCaluclation(p2)
    printRandValuesCaluclation(p3)
    printRandValuesCaluclation(p4)
    printRandValuesCaluclation(p5)

}