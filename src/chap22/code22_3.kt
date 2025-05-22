package chap22

fun main() {
    val text = readln()
    try{
        val number = text.toInt()
        println(number)
    }catch(e: NumberFormatException){
        println("$text is not a number")
    }

}