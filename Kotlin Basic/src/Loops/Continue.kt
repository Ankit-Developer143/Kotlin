package Loops

fun main(args: Array<String>) {
    labelname@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2) {
                continue@labelname
            }
            println("this is below if")
        }
    }
}

/*
i = 1 and j = 1
this is below if
i = 1 and j = 2
this is below if
i = 1 and j = 3
this is below if
i = 2 and j = 1
i = 3 and j = 1
this is below if
i = 3 and j = 2
this is below if
i = 3 and j = 3
this is below if
*/
