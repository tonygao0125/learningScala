/*How the class & objects work behind the scene, what is concstructor.

Whenever we create an object for a class, it internally calls the constructor. What the constructor do is creating the instance of class, which is object. There are two types of contructors:
1. Primary constructor
 * For a given class, it can only/ must have one primary constructor but multiple auxiliary constructors (optional)
2. Auxiliary constructor
*/


// Program no 1: Primary constructor

class demoClass{
  val x = 3       // var can change value mutable; val cannot change value, immutable.
  val y = 2

  def addNumber() ={
    x + y
  }
  println(s"x - ${x} and y - ${y}")

  val z = addNumber()
  println(s"z - ${z}")
}

object ConstructorDemo {
  def main(args: Array[String]): Unit = {
    println("Hello World!")

    var demo1 = new demoClass // Creating an object - instance of class - Constructor: Will execute everything in class

  }
}
