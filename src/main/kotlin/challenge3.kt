fun main(args: Array<String>) {
    println("Input your digit: ")
    var no:Int = readln()!!.toInt()
    if (no % 2 == 0 ){
        println("This is an even number")
    }else{
        println("This is an odd number")
    }
}