object DemoAIfElse {

  def main(args: Array[String]): Unit = {
    val x = 4
    if (x > 5) {
      println("x is greater than 5")
    } else {
      println("x is less than or equal to 5")
    }
    if (x == 1) {
      println("x is equal to 1")
    } else if (x == 4) {
      println("x is equal to 4")
    } else {
      println("x is less than or equal to 5")
    }

  }

}
