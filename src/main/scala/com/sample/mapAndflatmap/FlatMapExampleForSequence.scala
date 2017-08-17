package com.sample.mapAndflatmap

/**
  * Created by RSAdmin on 8/16/2017.
  */
object FlatMapExampleForSequence {
  def main(args: Array[String]): Unit = {
    val fruits = Seq("apple", "banana", "orange")

    println(fruits.map(_.toUpperCase()))

    println(fruits.flatMap(_.toUpperCase()))

    // Other way round

    val mapResult = fruits.map(_.toUpperCase)
    val flattenResult = mapResult.flatten

    println(flattenResult)


    val strings = Seq("1", "2", "foo", "3", "bar")
    strings.map(toInt)
    val map = strings.map(toInt)
    println(map)

    val flatMap = strings.flatMap(toInt)
    println(flatMap)

    val sum = strings.flatMap(toInt).sum
    println(sum)


  }

  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      // catch Exception to catch null 's'
      case e: NumberFormatException => None
    }
  }
}
