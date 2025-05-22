package chap11

import jdk.internal.joptsimple.internal.Messages.message

fun main() {
    val age = 14
    var message = ""
    if(age in 13..15){
         message = "中学生です。"
    }else{
         message = "中学生ではありません。"
    }
    println(message)
}