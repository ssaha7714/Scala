package com.sample.collection

/**
  * Created by RSAdmin on 7/24/2017.
  */
object ListFilter {

  def main(args: Array[String]): Unit = {
    // Using Filter method
    val nums = List(5, 1, 4, 3, 2)
    val newNums = nums.filter(_ > 2)
    println(newNums)
    println(nums.filter(_ % 2 == 0).sorted);
    // Using sorted method
    val b = List("banana", "pear", "apple", "orange").sorted
    println(b)

    // Using sortWith
    val c = List(10, 5, 8, 1, 7).sortWith(_ > _)
    println(c)

    // Define your own Sort method

    val listOfString = List("banana", "pear", "apple")
    val newList = listOfString.sortWith(sortByLength)
    println(newList)
  }

  def sortByLength(x:String, y:String): Boolean =
    x.length>y.length

}
