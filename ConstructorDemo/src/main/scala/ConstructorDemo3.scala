// Program no 4 : Auxiliary constructors

class demoClass3(val a:Int= 1, val b:Double = 2.2, val c:String = "tony") {
  val x = a
  var y = b
  val z = c

  println(s"Primary constructor says: x - ${x} and y - ${y} and z - ${z}")

  def addNumber() ={
    x + y
  }

  def this() {    // this is keyword for auxiliary constructor
    this(99, 88.88, "Hello Scala ")  // pass the auxiliary constructor parameters.
    println("I came into Auxiliary constructor with 0 parameters")
  }

  def this(a: Int) {
    this(a, 88.88, "Hello Scala ")
    println("I came into Auxiliary constructor with 1 parameters")
  }

  def this(a: Int, b:Double) {
    this(a, b, "Hello Scala ")
    println("I came into Auxiliary constructor with 2 parameters")
  }
}

object ConstructorDemo3 {
  def main(args: Array[String]): Unit = {
    val demoObject1 = new demoClass3(5, 7.2, "Hello World!") //if passing parameters it execute primary constructor
    val demoObject2 = new demoClass3() // if no passing parameters, it executes auxiliary constructor with 3 parameters
    val demoObject3 = new demoClass3(7) // if no passing parameters, it executes auxiliary constructor with 2 parameters
    val demoObject4 = new demoClass3(3, 5.71) // if no passing parameters, it executes auxiliary constructor with 1 parameters

  }
}
