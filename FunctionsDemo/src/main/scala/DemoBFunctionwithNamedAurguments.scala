// Functions with Named Arguments
object DemoBFunctionwithNamedAurguments {
  def sum(x:Int, y: Int): Int ={
    println("Value of x is " + x)
    println("Value of y is " + y)
    return (x+y)
  }
  def main(args: Array[String]): Unit = {
    var z = sum(2, 3)
    var z2 = sum(x=2, y=3)
    println("without keyword aruguments: " + z)
    println("with keyword aruguments: " + z2)

  }
}
