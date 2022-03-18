import scala.util.control.Exception.catching

object DemoCCatching {
  def main(args: Array[String]): Unit = {
    val catchException = catching(classOf[ArithmeticException], classOf[ArrayIndexOutOfBoundsException]).
      withApply(e => println("Exception has occurred." + e))

    val a = catchException(10 / 5)  // no print and does nothing since ArithmeticException no occurred.
    println(a)                     // output the value as normal

    val b = catchException(10 / 0)  // output ArithmeticException occurred.
    println(b)                      // print empty as 10/0 is empty

    val c = catchException((10 : Float) / (8: Float))// output ArithmeticException occurred.
    if (c.!=()){
      println(c)
    }

    val arrayx = Array("a", "b", "c")
    catchException(arrayx(3))      // arrayx(3) returns ArrayIndexOutOfBoundsException "catch" by catching() and throw
  }

}
