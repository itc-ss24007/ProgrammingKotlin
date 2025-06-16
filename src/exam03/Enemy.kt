package exam03

open class Enemy(
    name: String,
    maxHp: Int,
    maxMp: Int,
    private val baseAttack: Int,
    private val baseDefense: Int
) : Character(name, maxHp, maxMp) {

    override val attack: Int
        get() = baseAttack

    override val defense: Int
        get() = baseDefense
}

