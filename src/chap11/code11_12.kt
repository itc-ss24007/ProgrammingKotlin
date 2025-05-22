package chap11

import jdk.internal.joptsimple.internal.Messages.message

fun main() {
    val age = 14
    var message = if(age in 13..15){
        println("1番目の条件の処理が行われました。")
        "中学生です。"
    }else{
        println("2番目の条件の処理が行われました。")
        "中学生ではありません。"
    }
    println(message)
}