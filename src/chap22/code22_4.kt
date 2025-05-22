package chap22

fun main() {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    println("0~6 の数字を入力してください：")
    val text = readln()
    try {
        val choice =text.toInt()
        println("選択肢：$choice　は　${week[choice]}です。")
    }catch (e: NumberFormatException) {
        println("$text という文字は数値に変換できません")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("範囲外の選択肢です。")
    }catch (e:Exception){
        println("想定外の例外が発生しました")
    }finally {
        println("thanks" )
    }
}