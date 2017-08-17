package com.sample.futureAndPromise

/**
  * Created by RSAdmin on 8/16/2017.
  */
object EitherLeftRightExample {

  def main(args: Array[String]): Unit = {
    val result = divideXByY(15,0)
    println(result)

    result match {
      case Left(x) => println(x)
      case Right(x) => println(s"Result is $x")
    }
  }

  /**
    * A simple function to demonstrate how to declare that a function returns
    * an Either, and code that returns a Left or Right.
    */
  def divideXByY(x: Int, y: Int): Either[String, Int] = {
    if (y == 0) Left("Dude, can't divide by 0")
    else Right(x / y)
  }


}
