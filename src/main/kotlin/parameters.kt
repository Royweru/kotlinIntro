fun main(args: Array<String>) {
   printSum(3,6)
}


fun printSum(num1: Int,num2: Int){
    var result = addnums(num1,num2)
    println(result)
}
fun addnums(num1:Int, num2:Int):Int{
    var sum = num1 + num2
    return sum
}