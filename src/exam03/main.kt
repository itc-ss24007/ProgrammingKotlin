package exam03

fun main() {
    val player = Human(
        name = "勇者",
        maxHp = 100,
        maxMp = 30,
        strength = 20,
        stamina = 15,
        weapon = 10,
        armor = 5
    )
    val slime = Slime()
    println("${slime.name} が現れた！")
    println("${player.name} の攻撃力: ${player.attack}, 防御力: ${player.defense}")
    println("${slime.name} のHP: ${slime.hp}, 攻撃力: ${slime.attack}, 防御力: ${slime.defense}")
    println("--------------------------------------------------")

    println("${player.name} プレイヤーが敵${slime.name}を攻撃")
    val damage = player.attackTo(slime)
    println("${player.name} は ${slime.name} に ${damage} ダメージを与えた！")
    println("${slime.name} の残りHP: ${slime.hp}")
}