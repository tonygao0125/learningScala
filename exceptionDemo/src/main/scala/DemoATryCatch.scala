import java.io.{FileNotFoundException, FileReader} // a class for reading file
import java.io.IOException

object DemoATryCatch {
  def main(args: Array[String]): Unit = {
    try{
      // try to read this file first, if fail then do catch, case1, case2...
      val f = new FileReader("/Users/tonygao/Documents/GitHub/Udemy_scala/scala_in_depth/sourceCodes/exceptionDemo/src/main/scala/input.txt")
      // there is actually not file - input.txt, so it throw an FileNotFound Exception.

      // create a input.txt so that previous FileReader won't throw exception
      val a = 10 / 2  // this line throw an Arithmetic exception as denominator is 0.
      println(a)

      val array1 = Array(10, 3)
      println(array1(4)) // ArrayIndexOutOfBoundsException. Exception since there are only 2 number, index out of range.
    }
    catch {
      // e is just an identifier, it can be any name, this variable stores an exception-type object in this case, when
      // catch block "catch" an exception that was "thrown" during a "try" block.
      case e: FileNotFoundException => {
        println("File is not Found - Exception Received." + e)
      }
      case a: IOException => {
        println("Error While Reading File - Exception Received.")
      }
      case a: ArithmeticException => {
        println("Arithmetic Error - Exception Received.")
      }
      case _: Exception => {
        println("All the exception cases can be handled by this exception wildcard, if we never want this program fail at all.")
      }
    }
    finally {
        println("This finally block will always be executed irrespective of Exception or not.")
      }

  }
}
