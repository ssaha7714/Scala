import scala.collection.mutable.ArrayBuffer

/**
  * Created by ssaha7714 on 23/07/17.
  */
object MutableArray {

  def main(args: Array[String]): Unit = {
    var array = ArrayBuffer[String]()
    array+="Ram1"
    array+="Ram2"
    array+="Ram3"

    array.foreach(x=>println(x))

    println(array.length)
  }
}
