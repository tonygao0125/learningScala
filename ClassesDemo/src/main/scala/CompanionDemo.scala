class CompanionDemo{
  var x = 5 // variable of Companion class

  def getValue() = {
    println(s"Value of x is: ${x}, and value of y is: ${CompanionDemo.y}") // access variable in companion object
  }
}

object CompanionDemo {
  var y = 2.2 // variable of Companion object


  def main(args: Array[String]): Unit = {
    val objectForCompanionDemoClass = new CompanionDemo
    println(s"Value of x when retrieved from companion object is ${objectForCompanionDemoClass.x}") // access variable in class using created object
    println(s"Value of y when retrieved from companion object is ${y}")

    objectForCompanionDemoClass.getValue()
    objectForCompanionDemoClass.getValue
  }

}
