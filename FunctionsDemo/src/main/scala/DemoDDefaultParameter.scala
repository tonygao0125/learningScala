object DemoDDefaultParameter {
  def div (x: Int = 5, y: Int = 1): Double={
    println("value of x is : " + x)
    println("value of y is : " + y)
    return (x / y.toDouble)               //return keyword is redundant in scala
  }

  def main(args: Array[String]): Unit = {
    println(div (2, 3))

    println(div (2, 0))

    println(div(2))                               // x takes the value 2, second parameter take default value

    println(div(y= 2))
  }

}
