object DemoLFunctionByValue {
  def main(args: Array[String]): Unit = {
    println("Main Function: " + exec(time()))   //exec the value of time()
  }
  def time(): Long = {
    println("Inside the time function")
    return System.nanoTime()
  }

  def exec(t: Long): Long = {
    println("Inside exec function")
    println("Time: " + t)
    println("Exiting from time function")
    return t
  }
}

/* Function by Value
1. It will first execute the inside function "time()" and then execute the outside function "exec(769998344786652).
2. Since inside the function "time()" got executed first, it calls outside function "exec(769998344786652)"
   using the value 769998344786652, it is called as "Function by Value".
 */