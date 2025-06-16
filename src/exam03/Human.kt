package exam03

class Human(name: String,
            maxHp: Int,
            maxMp: Int,
            val strength: Int,  // 攻撃力の基礎値
            val stamina: Int,   // 防御力の基礎値
            val weapon: Int,    // 武器の攻撃力
            val armor: Int      // 防具の防御力
             )
    : Character(name,maxHp,maxMp){
      override val attack: Int
          get() = strength +weapon
      override val defense: Int
          get() = stamina +armor
}