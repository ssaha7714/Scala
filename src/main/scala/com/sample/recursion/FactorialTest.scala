package com.sample.recursion

import scala.annotation.tailrec

/**
  * Created by RSAdmin on 7/30/2017.
  */
object FactorialTest {

  def main(args: Array[String]): Unit = {
  println(factorial(-1))
  }

  def factorial(x:Int) : Int = {
    @tailrec
    def loop(acc:Int, value: Int): Int={
      if(value==0)
        acc
      else
        loop(acc*value,value-1)
    }
    loop(1,x)
  }
}
