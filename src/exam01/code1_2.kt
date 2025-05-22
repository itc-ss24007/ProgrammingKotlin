package exam01

/**
 * 映画館の入場料を計算するプログラム
 * シニアー＞一般ー＞子供の順で人数を入力して
 * 一人当たりの料金は　シニア：１３００円　一般：２０００円　子供：１０００円
 * ただし、１０名以上の倍は、各２００円割引
 */
fun main() {
    println("シニアー＞一般ー＞子供の順で人数を入力してください")
    val nums = readln().split(" ").map { it.toInt() }
    val p1 = nums[0]
    val p2 = nums[1]
    val p3 = nums[2]
    val p = p1 + p2 + p3
    val pr1 = 1300
    val pr2 = 2000
    val pr3 = 1000
    val total = p1 * pr1 + p2 * pr2 + p3 * pr3
    val result = if (p<10) {
        total
    }else{
        total-200*p
    }
    println(result)
}