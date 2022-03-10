class DemoClassA{
  val x = 2
  val y = 5.5

  def addValue() = x + y

  println(s"x = ${x}, y = ${y}")
}


object SingletonDemo {
  def main(args: Array[String]): Unit = {

    val demoObjectA1 = new DemoClassA
    println(demoObjectA1.x, demoObjectA1.y)
    val result = demoObjectA1.addValue()
    println(result)
  }
}
