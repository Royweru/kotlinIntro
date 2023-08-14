fun main(args: Array<String>) {
    println("Enter your first number: ")
    var num1:Int = readln()!!.toInt()
    println("Enter your second number: ")
    var num2:Int = readln()!!.toInt()
    printResult(num1,num2)

}


fun printResult(first: Int,second: Int){
    var result = addNums(first, second)
    println("Your sum is $result")
}
fun addNums(first:Int,second:Int):Int{
    return first + second
}