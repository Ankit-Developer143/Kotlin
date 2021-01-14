fun main() {
    var sum:Int = 0
    var input:String
    do{
        print("Enter an Integer")
        input = readLine()!!
        sum +=input.toInt()

    }while (input != "0")
        println("sum = $sum")

}
