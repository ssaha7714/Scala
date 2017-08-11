package com.sample.collection

/**
  * Created by ssaha7714 on 23/07/17.
  */
object ListConcat {

  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3)
    val list2 = List(3,5,6)

    val list3 = List.concat(list1,list2)
    println(list3)

    val list4 = List(1,2,3)
    val list5 = List(3,5,6)

    val list6 = list4 ++ list5
    println(list6)

    val list7 = List.range(1,10)

    println(list7)

    val list8 = List.range(1,10,3)

    println(list8)

  }
}
