object DemoMFunctionByName {
  def main(args: Array[String]): Unit = {
    println("Main Function: " + exec(time()))

  }
  def time(): Long = {
    println("Inside the time function")
    return System.nanoTime()
  }

  // function by name
  def exec(t: => Long): Unit = {
    println("Inside exec function")
    println("Time: " + t)                        // time() won't be evaluated until name t is called
    println("Exiting from time function")
    return t
  }
}

/* Function by Name
1. It will first execute the OUTSIDE function "exec()" and then execute the INSIDE function "time()" every time
t is being referred.
2. Since OUTSIDE function "exec()" got executed first, it calls INSIDE function "time()"using the
REFERENCED VARIABLE t, it is called as "Function by Name".
 */