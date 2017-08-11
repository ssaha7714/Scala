package com.sample.collection

/**
  * Created by RSAdmin on 8/11/2017.
  */
object ListLength {

  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 5)
    println(length(l))
    println(length(l))

    println(sumOfInt(l))

    val ll = List(List(1,2,3), List(4, 5, 6), List(7, 8, 9, 10))
    val z = ll.flatMap(x => x)
    println(z)

    println(aggregate(ll, List.empty[Int])((a, b) => a.foldRight(b)(_ :: _)))

    println(s"sdasds ${aggregate(ll, List.empty[Int])(concatListOther)}")
    println(concatListOther(List(1,2,3), List(4, 5, 6)))

    println(List(1, 2, 3) :+ 4)

    println(reverse(l))


  }

  def reverse[A](l: List[A]): List[A] = {
    def aux(l1: List[A], acc: List[A]): List[A] = l1 match {
      case Nil => acc
      case h :: t => aux(t, h :: acc)
    }

    aux(l, List.empty[A])
  }

  def concatList(l1: List[Int], l2: List[Int]): List[Int] = l1 match {
    case Nil => l2
    case h :: t => concatList(t, h :: l2)
  }

  def concatListOther(l1: List[Int], l2: List[Int]): List[Int] = {
    l2 match {
      case Nil => l1
      case h :: t => concatListOther(l1 :+ h, t)
    }
  }

  //def length[A](list: List[A]): Int = list.foldRight(0)((_, b) => 1 + b)

  def length[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: t => 1 + length(t)
  }

  def aggregate[A](list: List[A], baseValue: A)(f: (A, A) => A): A = list match {
    case Nil => baseValue
    case h :: t => f(h, aggregate(t, baseValue)(f))
  }

  def sumOfInt(l:List[Int]): Int ={
    //aggregate(l,0)(_ + _)
    aggregate(l,0)((a:Int,b:Int)=> a+b)
  }



}
