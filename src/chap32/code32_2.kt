package chap32

fun main() {
    var text: String? = "あいうえお"
    text = null
    println("文字列「${text}」の長さ= ${text?.length}")

    var text_a: String = "あいうえお"
    var text_b: String? = null
    var length_a = coutTextLength1(text_a)
   // var length_b = coutTextLength1(text_b) エラー
  //  var length_b = coutTextLength1(text_b!!)
   // println("length_b:${length_b}")
   // var length_n = coutTextLength1(null)　エラー

    var length2_a = coutTextLength2(text_a)
    var length2_b = coutTextLength2(text_b)
    println("length2_a:${length2_a}")
    println("length2_b:${length2_b}")
}
fun coutTextLength1(text: String): Int {
    return text.length
}
fun coutTextLength2(text: String?): Int {
    return text?.length ?: 0
//    if(text != null) {
//        return text.length
//    }else {
//        return 0
//    }
}