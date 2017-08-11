package com.sample.caseclass

/**
  * Created by RSAdmin on 8/9/2017.
  */
object TestCaseClass {
  def main(args: Array[String]): Unit = {
    val vehicles = List(Volvo("V100", 2010), Ford("Fiesta", 2016))

    vehicles.foreach{ _ match {
      case Volvo(_,_) => println("Volvo Car")
      case Ford(_,_) => println("Ford Car")
      }
    }

    val volvo = Volvo("V100", 2010)

  }
}
