// nested function

object DemoPNestedFunction {
  def main(args: Array[String]): Unit = {
    //function inside main function (function inside a function)
    //    def printHello(msg: String) = {
    //      println("Hello " + msg)
    //    }
    val printHello = (msg: String) => println("Hello " + msg)

    printHello("World")
    printHello("India")

  }
}
