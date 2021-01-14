fun main() {
    var number:Int
    var input:String
    print("Enter Your Number")
    input = readLine()!!

    number = input.toInt()


    var numberProvided = when(number){
        1 ->"one"
        2 ->"Two"
        3 ->"Three"
        4 ->"Four"
        else ->"invalid number"
    }
    println("You provide $numberProvided")

}

//op:-You provide Three