// To demonstrate Functions

object helloWorld {
  def main(args: Array[String]): Unit = { //unit means returning nothing

    print("Hello World!")
    print("Hello World!")
    println("Hello World!") //println print from new line

    var result = add_2(2, 3)
    println("Addition of 2 and 3 is: " + result)
  }

  def add(x: Int, y: Int): Int = {
    var z = x + y
    return z
  }

  def add_2(x: Int, y: Int): Int = {
    var z = x + y
    z                                    // Not mandatory to specify the return keyword
  }

  def add_3(x: Int, y: Int) = {    // Not mandatory to specify the return data type,it's auto interpreted
    var z = x + y
    z
  }

//  def add_4(x: Int, y: Int) = {       // IF SPECIFY RETURN KEYWORD THEN MUST SPECIFY RETURN TYPE. OTHERWISE ERROR
//    var z = x + y
//    return z
//  }

  def add_5 (x:Int, y:Int) = x + y //if single line, bracket is not mandatory. And return type/keyword not mandatory

}