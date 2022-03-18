import scala.util.{Failure, Success, Try}

/* This Try Success and Failure is Scala feature, not available in Java */

object DemoBTrySuccessFailure {
  def main(args: Array[String]): Unit = {

    // Success
    val a = Try(10 / 5)
    a match {
      case Success(value) => println(value)         //if get the value successfully, print the value
      case Failure(exception) => println(exception)
    }

    // Failure
    val b = Try(10 / 0)
    b match {
      case Success(value) => println(value)
      case Failure(exception) => println(exception)
    }

    // Defined exception handling
    val c = Try(10 / 0)
    b match {
      case Success(value) => println(value)
      case Failure(exception) => errorHandlingFunction(exception)
    }
  }

  def errorHandlingFunction(exception: Throwable) = {
    println(exception)
    if (exception.toString.equals("java.lang.ArithmeticException: / by zero")){
      println("hello, arithmetic exception had occurred")
    }
  }


}
