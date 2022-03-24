object DemoJFunctionCallByName {
  def main(args: Array[String]): Unit = {
    printValue(increment, 2)        // pass a function as a parameter to another function
    printValue(decrement, 2)        // pass decrement() function to m
  }
  def printValue (m:Int => Int, x: Int) = { //increment() is function m here, pass no parameter so " "=> Int
    println("Addition value is " + m(x))
  }
  def increment(y: Int) = {
    println("Value of y is " + y)
    var z = y + 1
    println("Value of y after incrementing is " + z)
    z
  }

  def decrement(y: Int) = {
    println("Value of y is " + y)
    var z = y - 1
    println("Value of y after decrementing is " + z)
    z
  }
}
