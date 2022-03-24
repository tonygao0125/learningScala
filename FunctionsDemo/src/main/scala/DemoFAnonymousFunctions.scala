// Anonymous Functions - Functions without a name and def keyword

object DemoFAnonymousFunctions {
  def main(args: Array[String]): Unit = {
    println("The increments function output is " + increments(5))
    printHelloWorld()
    add(2, 3)
  }

  //Example 1: Anonymous Function with 1 input parameter and 1 output parameter
  // Using function value/ Anonymous functions
  var increments = (x: Int)=> x +1            // define an anonymous function as a variable

  //Example 2: Anonymous Function with 0 input parameter and 0 output parameter
  // Using function value/ Anonymous functions
  var printHelloWorld = () => println("hello world")

  //Example 3: Anonymous Function with 2 input parameters and 1 output parameter
  var add = (x: Int, y: Int) => print(s"The sum is ${x+y}")
}
