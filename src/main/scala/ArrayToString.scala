/**
  * Created by ssaha7714 on 23/07/17.
  */
object ArrayToString {

  def main(args: Array[String]): Unit = {
    val array = Array("Hello", "world", "it's", "me")

    val string = array.mkString(" ")
    println(string)
  }
}
