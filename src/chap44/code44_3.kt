package chap44

fun main() {
    val text= "勉強"
 //   val message = text.getOneTwoFiveMessage()
  //  println(message)
    println(text.oneTwoFiveMessage)
}
//fun String.getOneTwoFiveMessage()="一に${this}、二に${this}、三四が無くて五に${this}"

val String.oneTwoFiveMessage: String get() = "一に${this}、二に${this}、三四が無くて五に${this}"