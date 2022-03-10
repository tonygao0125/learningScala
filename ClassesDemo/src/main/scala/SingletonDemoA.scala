// program 2 : singleton, can only have one object, so it's call singleton object

object DemoClassB{ //1st Note: Instead of class, this is object
  val x = 2
  val y = 5.5

  def addValue() = x + y

  println(s"x = ${x}, y = ${y}")
}

object DemoClassB1{
  val x =5
}

object SingletonDemoA {
  def main(args: Array[String]): Unit = {

    //val demoObjectB1 = new DemoClassB // 2nd Note: cannot create object for a object DemoClassB
    println(DemoClassB.x, DemoClassB.y) // 3rd Note: this is access the variables of object
    val result = DemoClassB.addValue()  // 4th Note: this is access the method/function of object
    println(result)

    print(DemoClassB1.x)
  }
}
