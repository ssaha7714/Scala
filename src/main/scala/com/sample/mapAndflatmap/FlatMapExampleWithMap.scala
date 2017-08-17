package com.sample.mapAndflatmap

/**
  * Created by RSAdmin on 8/16/2017.
  */
object FlatMapExampleWithMap {
  def main(args: Array[String]): Unit = {
    val map = Map(1 -> "one", 2 -> "two", 3 -> "three")

    val vectorFlatMap = 1 to map.size flatMap(map.get)
    println(vectorFlatMap)

    val vectorMap = 1 to map.size map(map.get)
    println(vectorMap)

  }
}
