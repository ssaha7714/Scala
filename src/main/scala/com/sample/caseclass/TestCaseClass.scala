package com.sample.caseclass

/**
  * Created by RSAdmin on 8/9/2017.
  */
object TestCaseClass {
  def main(args: Array[String]): Unit = {
    val vehicles = List(Volvo("V100", 2010), Ford("V100", 2010),Other("V100", 2010))

    vehicles.foreach{ _ match {
      case Volvo(_,_) => println("Volvo Car")
      case x if(x.isInstanceOf[Other]) => println("Other Car")
      case _ =>  println("Ford Car")
      }
    }

    val volvo = Volvo("V100", 2010)

  }
}
