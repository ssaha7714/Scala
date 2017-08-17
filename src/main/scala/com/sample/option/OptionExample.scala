package com.sample.option

/**
  * Created by RSAdmin on 8/16/2017.
  */
object OptionExample {

  case class Address (city: String, state: String, zip: String)

  class User(email: String, password: String) {
    var firstName = None: Option[String]
    var lastName = None: Option[String]
    var address = None: Option[Address]
  }

  def main(args: Array[String]): Unit = {
    // populate the object
    val u = new User("al@example.com", "secret")
    u.firstName = Some("Al")
    u.lastName = Some("Alexander")
    u.address = Some(Address("Talkeetna", "AK", "99676"))

    // print the object information
    println(s"First Name: ${u.firstName.getOrElse("not assigned")}")
    println(s"Last Name:  ${u.lastName.getOrElse("not assigned")}")
    u.address.foreach { a =>
      println(a.city)
      println(a.state)
      println(a.zip)
    }
  }
}
