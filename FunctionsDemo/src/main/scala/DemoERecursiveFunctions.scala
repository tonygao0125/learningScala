object DemoERecursiveFunctions {

  def factorial (n: Int): Int={
    if (n<= 1)
      1
    else
      n * factorial(n-1)                            // Recursive functions. Calls itself
  }

  def main(args: Array[String]): Unit = {
    var result = factorial(5)
    println(result)
  }
}
