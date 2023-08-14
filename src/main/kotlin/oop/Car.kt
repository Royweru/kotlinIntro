package oop

class Car(owner:String, make:String,model:String,price:Int) {
    init {
        println("$owner owns a car and The Make is $make and the Model is $model and the price is $price")
    }
}

fun main(args: Array<String>) {
    var owner1 = Car("Wangechi","toyota","vitz",4444)
    var owner2 = Car("Sandra","bmw","3series",30000)
    var owner3 = Car("Derick","mercedes","amg gle 63",108000)

}