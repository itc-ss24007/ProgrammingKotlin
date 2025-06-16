package exam03

import kotlin.math.max
import kotlin.random.Random

abstract class Character(
    val name:String,//
    val maxHp:Int,//HPの最大値
    val maxMp:Int//MPの最大値

) {
    var hp:Int = maxHp //HPの現在値
    protected set //継承クラスからのみ書き換え可能
    var mp:Int = maxMp//MPの現在値
    protected set

    abstract val attack:Int//攻撃力
    abstract val defense:Int//防御力

    open fun attackTo(target:Character):Int {
        val damage = target.attacked(this.attack)
        return damage//与えたダメージ
    }
    open fun attacked(power:Int):Int {
        val randomNum = Random.nextInt(28,37)
        val damage = ((power*0.5 - this.defense*0.25)*(randomNum/32)).toInt()
        this.hp =max(this.hp-damage,0)
        return damage//受けたダメージ
    }
}