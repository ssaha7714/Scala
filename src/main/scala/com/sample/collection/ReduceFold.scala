package com.sample.collection

/**
  * Created by RSAdmin on 8/11/2017.
  */
object ReduceFold {

  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3)
    println(sum(l))
    println(len(l))
  }

  def sum(l: List[Int]): Int = l.reduceLeft(_ + _)

  def merge(l1: List[Int], l2: List[Int]): List[Int] = l2.foldLeft(l1)((a, b) => b :: a)

  def sumF(l: List[Int]): Int = l.foldLeft(0)(_ + _)
  def len(l: List[Int]): Int = l.foldRight(0)((a, b) => a + 1)

}
