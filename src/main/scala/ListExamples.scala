/**
  * Created by ssaha7714 on 21/07/17.
  */
object ListExamples {
  def main(args: Array[String]): Unit = {
    // Declaring a List using Var so that it can be modified.
    var list = List(1,2,3)

    // create a variable range
    var range = 100 to 110


    // Add the range contents in the List
    list = list ++ range

    println(list)


  }
}
