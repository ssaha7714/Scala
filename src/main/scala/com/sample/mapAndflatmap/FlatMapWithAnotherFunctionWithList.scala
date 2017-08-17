package com.sample.mapAndflatmap

/**
  * Created by RSAdmin on 8/16/2017.
  */
object FlatMapWithAnotherFunctionWithList {

  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    val changedListUsingMap = list.map(x=>g(x))
    println(changedListUsingMap)
    val changedListUsingFlatMap = list.flatMap(x=>g(x))
    println(changedListUsingFlatMap)


  }

  def g(value:Int) = List(value-1, value, value+1)
}
