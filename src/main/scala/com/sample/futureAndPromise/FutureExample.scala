package com.sample.futureAndPromise

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scala.util.Random

/**
  * Created by RSAdmin on 8/16/2017.
  */
object FutureExample{

  def main(args: Array[String]): Unit = {
    println("1 - starting calculation ...")

    val f = Future {
      sleep(Random.nextInt(500))
      42
    }


    println("2- before onComplete")
    f.onComplete {
      case Success(value) => println(s"Got the callback, meaning = $value")
      case Failure(e) => e.printStackTrace
    }

    // do the rest of your work
    println("A ..."); sleep(100)
    println("B ..."); sleep(100)
    println("C ..."); sleep(100)
    println("D ..."); sleep(100)
    println("E ..."); sleep(100)
    println("F ..."); sleep(100)


    // Compose

    val oa: Option[String] = Some("a")
    val ob: Option[String] = Some("b")

    val oab : Option[String] = for{
      a <- oa
      b <- ob
    } yield a+b

    println(oab)

  }

  def sleep(duration: Long) { Thread.sleep(duration) }
}
