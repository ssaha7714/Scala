package com.sample.collection

/**
  * Created by ssaha7714 on 20/07/17.
  */
object ArrayExample {
  def main(args: Array[String]): Unit = {
    // Crete an Array
    val arr = Array(1,2,3) // Val is Immutable
    // Print the Array
    println("Printing Array Elements..")
    arr.foreach(x=>println(x))

    /**
      * The above code snippet is same as below
      */
    // Print the Array - Approach 2
    println("Printing Array Elements..")
    arr.foreach(println)


    arr.update(0,5)
    println("Printing Array Elements.. After Update")
    arr.foreach(println)

    println("Adding new elements to the Array")

   // arr = arr :+ 23 // This line is gining error beacuse we have used val not var

    println("Printing Array Elements.. After Adding new element")
    arr.foreach(println)
  }

}
