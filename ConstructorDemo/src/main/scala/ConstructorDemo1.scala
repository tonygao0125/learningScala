// Program no 2 : parameterized constructor (Primary constructor)

class demoClass1(val a:Int, val b:Double, val c:String) {      // Class with passing parameter
  val x = a
  var y = b     // retrieve (GET) and change (SET) the content of y because it's a var  >> INTERNALLY SCALA CREATE 2 METHODS - GETTER AND SETTER
  val z = c     //  ONLY retrieve (GET) the content of y because it's a val >> INTERNALLY SCALA CREATE ONLY 1 METHOD - GETTER

  def addNumber() ={
    x + y
  }
  println(s"x - ${x} and y - ${y} and z - ${z}")

}

object ConstructorDemo1 {
  def main(args: Array[String]): Unit = {

    var demoObject1 = new demoClass1(5, 7.2, "Hello World!") // Creating an object - instance of class - Constructor: Will execute everything in class
    var demoObject2 = new demoClass1(6, 8.3, "Hello World Again!")

    // demoObject1.x = 3   - Cannot change the content of x as it's defined as val in the class hence it only has getter method
    demoObject1.y = 7.22  // can change the content of y, as it's defined as var, has getter and setter method.

    println(demoObject1.x, demoObject1.y, demoObject1.z)
    var result = demoObject1.addNumber()
    println(s"result - ${result}")

    println(demoObject2.x, demoObject2.y, demoObject2.z)
    result = demoObject2.addNumber()
    println(s"result - ${result}")

  }
}
