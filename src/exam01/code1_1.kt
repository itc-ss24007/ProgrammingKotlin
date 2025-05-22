package exam01

/**
 * キーボードから数字を入力して、1から入力された数までの
 * FizzBuzz　を出力します。(数字以外は入力されない前提でOKです)
 *
 * FizzBuzz とは、
 * 3の倍のときにFizz
 * 5の倍のときにBuzz
 * 3と５の倍のときにFizzBuzz
 * それ以外のときは　数字をそのまま出力する
 */
fun main() {
    print("数字を入力してください：")
    val num = readln().toInt()
    for (i in 1..num) {
        val result = if(i % 3 == 0 && i % 5 == 0){
            "FizzBuzz"
        } else if (i % 3 == 0) {
            "Fizz"
        } else if (i % 5 == 0) {
            "Buzz"
        } else{
            i.toString()
        }
        println(result)
    }

}