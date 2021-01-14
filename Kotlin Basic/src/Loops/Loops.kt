fun main() {
    val marks = arrayOf(10,20,30,40,50)
    for (i in marks) {
        println(i)
    }

//10 20 30 40 50

//The elements of an array are iterated on the basis of indices (index) of array. For example:

      for(item in marks.indices){
          println(item)   //0,1,2,3,4
          println("marks[$item]: "+ marks[item])

          /*marks[0]: 10
          marks[1]: 20
          marks[2]: 30
          marks[3]: 40
          marks[4]: 50*/
      }




}