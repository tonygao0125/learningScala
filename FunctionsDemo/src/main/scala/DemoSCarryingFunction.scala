object DemoSCarryingFunction {
  def main(args: Array[String]): Unit = {
    val str1 = "Hello"
    val str2 = "World"

//    println("str1, str2 : " + printSomething(str1, str2))
    println("str1, str2 : " + printSomething(str1)(str2))
    println("bye + str2 : " +  byeFunction(str2))
  }
  val byeFunction = printSomething("Bye": String)(_: String)   // partially applied function
// 1st way
//  def printSomething(str1: String, str2: String): String = {
//    str1 + " " + str2
//  }

// 2nd way
//  def printSomething2(str1: String)(str2: String): String = {
//    str1 + " " + str2
//  }

// 3rd way
  def printSomething(str1: String) = (str2: String) => str1 + " " + str2
}

/*
Use of Currying function:
Function Chaining (result you get is chain of functions)
Function currying (separate parameters in different brackets) + partially applied function (i,e., use _)
 */
