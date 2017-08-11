package com.sample.companion

import scala.collection.immutable

/**
  * Created by RSAdmin on 7/24/2017.
  */
object TestCompanion {
  def main(args: Array[String]): Unit = {
    val obj:Employee = new Employee
    val e = Employee
    obj.showAge()
  }
}
