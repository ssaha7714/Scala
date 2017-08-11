package com.sample.collection

/**
  * Created by ssaha7714 on 20/07/17.
  */
object OddEven {
  def main(args: Array[String]): Unit = {
    val (odd,even) = (1 to 100) partition(_%2!=0)
    println(odd)
    println(even)

  }
}
