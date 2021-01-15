package Function

/*function take parameter as an argument and return value
* (name of parameter and its Type)
* if function does not return anything then  its return type is Unit*/

fun Sum(number1:Int,number2:Int): Int {
    val add = number1+number2
    return add

}
fun main() {
    val Value = Sum(5,4)
    println(Value)
}

//op:-9


