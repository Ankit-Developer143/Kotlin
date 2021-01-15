package Function

/*function is a interralated block of code which perform a specific task
function is used to break program into sub-module
it make reusebility of code
It's Two Type
1) Standard library Function
2) user defined function
*/

//Standard library function
fun main(args: Array<String>) {
    println("this is user defined function")
    sum()

}
//User defined function
fun sum() {
    var a = 2
    var b = 2
    var sumof = a+b
    println("The sum of $a and $b is $sumof")
}

//this is user defined function
//The sum of 2 and 2 is 4
