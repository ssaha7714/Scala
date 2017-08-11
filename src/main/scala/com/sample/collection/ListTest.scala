package com.sample.collection

/**
  * Created by RSAdmin on 7/21/2017.
  */
object ListTest {
  def main(args: Array[String]): Unit = {
    var list = List(1,2,3)
    list = list :+ 4
    println(list(3))

    println(list.hashCode())

    val list1 = List(1, 1, 2, 3, 5, 8)
    println(s"Last--> ${list1.last}")
    println(s"Init--> ${list1.init}")
    println(s"Last--> ${findLast(list1)}")

  }

  def findLast[Int](ls: List[Int]): Int  = {
    ls.last
  }

}
