package chap05

fun main() {
    val h:Int =8;
    val message1 = "本日働いた時間は、${h}hours"
    val message2 = "このペースで1ヶ月毎日働くと、${h*30}hoursの労働になります。"
    val message3 = "このペースで1年毎日働くと、${h*365}hoursの労働になります。"
    println(message1)
    println(message2)
    println(message3)
}