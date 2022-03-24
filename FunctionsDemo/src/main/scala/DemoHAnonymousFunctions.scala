object DemoHAnonymousFunctions {
  def main(args: Array[String]): Unit = {
    var listOfNumbers: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    // use with Map
    var squareOfNumbers = listOfNumbers.map[Int](x => x*x): List[Int] //Anonymous function inside map
    // Another way - replace anonymous function with identifier
    var squareOfNumbers2 = listOfNumbers.map(square)   // data type can be skipped

    // shorthand notation - NOTE: IT DOESN"T WORK HERE, BECAUSE IT EXPECT ONLY 1 _ WILDCARD FOR ONLY 1 INPUT PARAMETER
   // var squareOfNumber3 = listOfNumbers.map(_ * _)  //Does not work since take two _
    var doubleOfNumber = listOfNumbers.map(_ * 2) // shorthand works since only 1 _


    println(s"squareOfNumbers is $squareOfNumbers")
    println(s"squareOfNumbers2 is $squareOfNumbers2")
    println(s"doubleOfNumbers is ${doubleOfNumber}")
  }
  // traditional way
//  def square(x: Int) = {
//    x * x
//  }
  // anonymous function
  var square = (x: Int) => x * x
//var square: Int=>Int = (x: Int) => x * x  // data types are optional
}
