fun main(args:Array<String>) {
    println("Enter your marks: ")
    var marks:Int = readln()!!.toInt()
    if (marks<=29){
        println("E")
    }else if (marks<=39){
      println("D")
    }
    else if (marks<=59){
        println("B")
    }
    else if (marks<=70){
        println("B+")
    }
    else if (marks<=100){
        println("A")
    }
    else{
        println("Marks are not in our scope sorry")
    }
}