package chap39

fun main() {
    printlResult( { x,y -> x + y  })
    printlResult() { x,y -> x + y  }
    printlResult { x,y -> x + y  }
}
fun printlResult(calculator:(Double,Double)->Double) {
    val result = calculator(10.0,2.0)
    println(result)
}