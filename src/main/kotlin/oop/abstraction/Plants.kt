package oop.abstraction

abstract class Plants(val name:String) {
    abstract fun plantae ()

    fun make(){
        println("$name should be grown")
    }
}

class Canabis(name: String):Plants(name){
    override fun plantae() {
        println("$name is the best plant in the world")
    }
}

class Flower(name: String):Plants(name){
    override fun plantae() {
        println("Stop giving $name to your girlfriend")
    }
}

fun main(args: Array<String>) {
    val plant1:Plants = Canabis("canabis")
    val plant2:Plants = Flower("Roses")
}