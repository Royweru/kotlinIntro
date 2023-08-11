fun main(args: Array<String>) {
    println("Enter your first number: ")
    var y:Int = readln()!!.toInt()
    println("Enter your second number: ")
    var z:Int = readln()!!.toInt()

    for (x in y..z){
        if(x % 3 == 0 && x % 5==0){
            println("$x is FizzBuzz")

        }
        else if (x % 3 == 0){
            println("$x is Fizz")
        }
        else if (x % 5 ==0){
            println("$x is Buzz")
        }else{
            println(x)
        }
    }
}