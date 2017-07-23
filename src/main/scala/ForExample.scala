/**
  * Created by ssaha7714 on 23/07/17.
  */
object ForExample {

  def main(args: Array[String]): Unit = {
    val names = Vector("Bob", "Fred", "Joe", "Julia", "Kim")
    for(name <- names if name startsWith("J")) println(name)
  }
}
