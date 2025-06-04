package chap37

fun main() {
    val calculator1 = getCalculator("+")
    val calculator2 = getCalculator("-")
    val result1 = calculator1(10.0, 2.0)
    val result2 = calculator2(10.0, 2.0)
    println(result1)
    println(result2)
}
fun getCalculator(type: String): (Double, Double) -> Double {
    val p = fun(x: Double, y: Double): Double =x +y
    val m = fun(x: Double, y: Double): Double =x -y
    return when (type){
        "+"-> p
        else ->m
    }
}