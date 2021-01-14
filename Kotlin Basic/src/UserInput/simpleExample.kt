package UserInput

/*
Kotlin Input
Kotlin has standard library function readLine() which is used for reads line of string input from standard input stream.
It returns the line read or null. Let's see an*/

fun main() {
    println("Enter Your Name")
    val name = readLine()
    println("Enter Your Age")
    val age = readLine()!!.toInt()

    println("Your name is $name and your age is $age")

}
