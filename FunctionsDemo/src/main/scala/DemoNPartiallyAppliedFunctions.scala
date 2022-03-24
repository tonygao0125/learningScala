// Note: Without partially applied function
import java.util.Date

object DemoNPartiallyAppliedFunctions {
  def main(args: Array[String]): Unit = {
    var date = new Date()                  // Create an object for Class Date()
    val logWithDate = log(date, _:String)  // This is " partially applied function ", _ is the parameter that
                                            // is expected by partially applied function

//    log(date, "Hello 1")
    logWithDate("Hello 1")

    Thread.sleep(2000)
//    log(date, "Hello 2")
    logWithDate("Hello 2")
    Thread.sleep(2000)
    logWithDate("Hello 3")
  }

  def log(date: Date, msg: String) = {
    println(msg + date)
  }
}
