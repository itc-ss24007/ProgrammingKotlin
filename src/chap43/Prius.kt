package chap43

class Prius(color:String):Car(color) {
    override fun letEngineWork(){
        println("ブルルーン！")
        fuel -= 0.5
    }
}