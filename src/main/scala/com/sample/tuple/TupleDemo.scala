package com.sample.tuple

/**
  * Created by RSAdmin on 8/11/2017.
  */
object TupleDemo {

  def main(args: Array[String]): Unit = {
    tupleDemo(1,1,2)
  }

  def tupleDemo(expr: Any) =
    expr match {
      case (a, b, c) => println("matched "+ a + b + c)
      case _ => println("Not a tuple")
    }
}
