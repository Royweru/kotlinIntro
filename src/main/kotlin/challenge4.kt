

fun characterCountOccurence(userinput:String, chartag:Char):Int{
    var charCount = 0
    for (x in userinput){
        if (x== chartag){
            charCount += 1
        }
    }
  return charCount
}
fun main(args: Array<String>) {
    println("Enter your user input: ")
    var input:String = readln()!!.toString()
    println("Enter the character you want to know how many times it has been repeated: ")
    var word:Char = readln().single()
   val occurenceTimes = characterCountOccurence(input, word)
    println(" The character appears $occurenceTimes number of times")
}