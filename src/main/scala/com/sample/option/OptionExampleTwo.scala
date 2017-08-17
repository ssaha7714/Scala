package com.sample.option

/**
  * Created by RSAdmin on 8/16/2017.
  */
object OptionExampleTwo {

  /**
    * Lets Create a method which will return Option
    */

  def toInt(value:String): Option[Int] = {
    try {
      Some(Integer.parseInt(value))
    }catch {
      case e: Exception => None
    }
  }

  def main(args: Array[String]): Unit = {
    val x = toInt("1").getOrElse(0)
    println(x)

    val xx = toInt("A")
    println(xx)

    val xxx = toInt("1")

    xxx match {
      case Some(y) => println(y)
      case None    => println("WTF!")
    }

  }

  def divideXByY(x: Int, y: Int): Either[String, Int] = {
    if (y == 0) Left("Dude, can't divide by 0")
    else Right(x / y)
  }
}
