package Function

fun run(num:Int = 2,letter:Char = 'X'){
    println("The paremeter in function $num and $letter")
}



fun running(num:Int= 5, latter: Char ='x'){
    print("parameter in function definition $num and $latter")
}

fun main() {
    run(3)
    running(latter = 'z')
}
//The paremeter in function 3 and X
//parameter in function definition 5 and z

