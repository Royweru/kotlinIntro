package oop.abstraction

abstract  class Seacreatures(val name: String) {
    abstract fun makeSound()

    fun describe(){
        println("$name makes sound")
    }
}

class Whale(name: String):Seacreatures(name){

}