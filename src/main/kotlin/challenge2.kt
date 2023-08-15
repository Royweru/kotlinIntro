fun main(args: Array<String>) {
    println("Enter your first number: ")
    var first = readln()!!.toInt()
    println("Enter the operator: ")
    var operator = readln()
    println("Enter your second number: ")
    var second = readln()!!.toInt()

    if(operator == "+") {
        var res = first +second
        println(res)
    }else if (operator == "/"){
        var res = first/second
        println(res)
    }else if (operator == "*"){
        var res = first *second
        println(res)
    }else if (operator == "-"){
        var res = first-second
        println(res)
    }else{
        println("Operator is invalid!")
    }

}