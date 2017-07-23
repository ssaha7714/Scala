/**
  * Created by ssaha7714 on 23/07/17.
  */
object MergeList {
  def main(args: Array[String]): Unit = {
    val a = List(1,2,3)
    val b = List(4,5,6)
    val c = a:::b

    c.foreach(println)
    c.foreach(x => println(x))

  }
}
