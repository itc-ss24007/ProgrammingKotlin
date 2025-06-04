package chap39

fun main() {
    val list = listOf("あ","い","う","え","お")
    //val action = fun(x:String){println(x)}
    val action:(String)->Unit =fun(x:String) {
        println(x)
    }
    list.forEach(action)
    list.forEach{println(it)}
    for(it in list){
        println(it)
    }

}