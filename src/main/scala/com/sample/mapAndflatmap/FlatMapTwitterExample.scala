package com.sample.mapAndflatmap

/**
  * Created by RSAdmin on 8/16/2017.
  */
object FlatMapTwitterExample {
  def main(args: Array[String]): Unit = {
    val chars = 'a' to 'd'
    val perms = chars flatMap { a =>
      chars flatMap { b =>
        if (a != b) Seq("%c%c".format(a, b))
        else Seq()
      }
    }

    println(perms)
  }
}
