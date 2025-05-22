package exam01

import kotlin.random.Random
import kotlin.random.nextInt

/**
 * お釣りの金額計算
 * ランダムで１００〜９０００の数値を生成します
 * 支払い金額をキーボードから入力します
 * お釣りを計算して、金種ごとにその枚数を出力してください
 * トーダルの枚数は最小となる組み合わせでお釣りを返します
 * 支払い金額がたりない場合は、足しませんと出力してください
 */
fun main() {
    val price = Random.nextInt(range = 100..9000)

    print("支払い金額入力してください：")
    val amount = readln().toInt()

    println("${price}円払いました")
    val result =   price - amount
    val message = if (result < 0) {
        "足しません"
    }else if (result == 0 ) {
        "ちょうどお支払いいただいた金額です"
    }else{
        getNumberOfPieces(result)
    }
    println(message)
}
fun getNumberOfPieces(money: Int): String {
    val numbers = listOf<Int>(10000,5000,1000,500,100,50,10,1)
    //val pieces = mutableListOf<Int>()
    var b = money
    var message ="お釣りは："
    for (i in numbers){
        var piece = b / i
        //pieces.add(piece)
        b = b % i
        message += "${i}:${piece}枚 "
    }
    return message
}
