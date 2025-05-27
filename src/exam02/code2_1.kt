package exam02

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val p = Dice("6面サイコロ")
    p.roll()
    val p2 = Dice( name="10面サイコロ", maxNumber = 10)
    p2.roll()

}
//Diceという名前でサイコロを表すクラスを定義してください
//一般的な６面サイコロ以外も対応したいので、いくつまでの数を出せるか
//コンストラクタでパラメータとして受け取れるようにしてください。(デフォルトは６面)
class Dice(val name: String,var number: Int=1,val maxNumber:Int=6) {
//プロバティとして識別用の名前(name)を持ちます
    //持ってるるプロパティ
    // -name =>　識別用の名前
    // -number =>　いまの出目
    // -maxNumber =>このサイコロの目の最大値
// rollというメソッドでサイコロを振ります。
//出た目はnumberというプロパティで繰り返し参照できること。
    fun roll(){
        println("${maxNumber}サイコロを振ります")
        number = Random.nextInt(1..maxNumber)
        println("${name}出た目は ${number} です")
    }
}