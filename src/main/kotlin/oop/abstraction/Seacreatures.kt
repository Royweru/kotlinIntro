package oop.abstraction

abstract  class Seacreatures(val name: String) {
    abstract fun makeSound()

    fun describe(){
        println("makes sound $name ")
    }
}

class Whale(name: String):Seacreatures(name){
    override fun makeSound() {
        println("A whale makes the sound $name")
    }
}

class Shark(name: String):Seacreatures(name){
    override fun makeSound() {
        println("A shark makes the sound $name")
    }
}

fun main(args: Array<String>) {
    val creature1:Seacreatures = Whale("blup blup")
    val creature2:Seacreatures = Shark("whi whi")

    creature1.describe()
    creature1.makeSound()

    creature2.describe()
    creature2.makeSound()
}