object DemoBWhileLoop {
  def main(args: Array[String]): Unit = {
    var x = 1
    // while
    while (x<10) {               // x = 1< 10 true, 2, 3, 4, 5, 6,7, 8, 9, 10<10 false
      println("value of x is " + x)
      x += 1
    }
    // do ... while
     do {               // x = 1< 10 true, 2, 3, 4, 5, 6,7, 8, 9, 10<10 false
      println("value of x is " + x)
      x += 1
    } while (x<10)
    // Difference:
    // 1. "while" will check condition at the start, whereas do while will check condition at end
    // 2. "do-while" will execute the code at least once even if the condition is not satisfied.
  }
  }
