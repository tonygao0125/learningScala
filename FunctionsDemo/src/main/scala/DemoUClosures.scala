// Even Number or Odd Number
// Print Even or Print Odd

object DemoUClosures {
  def main(args: Array[String]): Unit = {
    println(evenOrOdd(isEven, 2))
    println(evenOrOdd(isEven, 3))
    println(evenOrOdd(isEven, 4))
    println(evenOrOdd(isEven, 5))
    println(evenOrOdd(isEven, 6))

  }
  // Function call by name
  def evenOrOdd(f: Int=> Boolean, x: Int) = {
    var evenFlag = f(x)
    if (evenFlag) {
      "Even Number"
    }
    else {
     "Odd Number"
    }
  }


//  def isEven (x: Int): Boolean= {
//    x % 2 == 0
//  }
  var div = 2
  var isEven = (x: Int)  => x % div == 0
//  var isEven: Int=>Boolean = (x: Int)  => x % 2 == 0
}
