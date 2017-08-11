package com.sample.companion

/**
  * Created by RSAdmin on 7/24/2017.
  */
object Employee {
  private  var age:Int = 10

  def apply: Employee = new Employee()
}

class Employee{
  import Employee._
  def showAge(){
    println("Age is " + age)
  }
}