
fun printIt(input1: String, input2: String) {
    println("You have entered your name as $input1 and your phone number as $input2.")
}

fun printIt(input1: String, input2: String, input3: String) {
    println("Your business name is $input1, your contact name is $input2 and your phone number as $input3.")
}

fun residential(){
    //Have them input the base and height
    println("Please enter your name:")
    val input = readLine()!!.toString()

    println("Please enter your phone number")
    val input2 = readLine()!!.toString()

    printIt(input, input2)
}

fun business(){
    //Have them input the base and height
    println("Please enter your business name:")
    val input = readLine()!!.toString()

    println("Please enter your Contact name:")
    val input2 = readLine()!!.toString()

    println("Please enter your phone number")
    val input3 = readLine()!!.toString()

    printIt(input, input2, input3)
}

fun main() {
    val option: Array<String> = arrayOf("1. Residential","2. Business")
    var choice = -1
    var loopvar: Int

    while(choice !in 0..option.size - 1){
        loopvar = 0
        println("Are you a Residential or Business Customer? (Enter 1 or 2)")
        while (loopvar < option.size){
            println(option[loopvar])
            loopvar ++
        }
        print("")
        choice = readLine()!!.toInt() - 1

        if (choice !in 0..option.size - 1)
            println("Invalid Entry, try again")
    }
    //reset it all, we have our choice, now let's get the inputs
    when (choice) {
        0 -> residential()
        1 -> business()

        !in 0..1-> println("Not in Range")
        else -> println("Something has gone very wrong!")
    }

}