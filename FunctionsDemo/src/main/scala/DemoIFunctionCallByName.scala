object DemoIFunctionCallByName {
  def main(args: Array[String]): Unit = {
    printValue(increment())        // pass a function as a parameter to another function
    printValue(decrement())        // pass decrement() function to m
  }
  def printValue (m: => Int) = { //increment() is function m here, pass no parameter so " "=> Int
    println("Addition value is " + m)
  }
  def increment() = {
    var y = 2
    println("Value of y is " + y)
    var z = y + 1
    println("Value of y after incrementing is " + z)
    z
  }

  def decrement() = {
    var y = 2
    println("Value of y is " + y)
    var z = y - 1
    println("Value of y after decrementing is " + z)
    z
  }
}
