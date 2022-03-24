object DemoGAnonymousFunctions {
  def main(args: Array[String]): Unit = {
    var listOfNumbers: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    listOfNumbers.foreach(num =>
      if (divisibleByThree(num)) println(s"$num can be divided by 3.")

      else println(s"$num is not divisible by 3.")
    )

  // use with Filter - Anonymous function inside the Filter
    var divisibleByThreeOutput = listOfNumbers.filter((x: Int) => x % 3 == 0: Boolean): List[Int] //return a list
    // var divisibleByThreeOutput = listOfNumbers.filter(x => x % 3 == 0) // data type can be skipped
    // var divisibleByThreeOutput = listOfNumbers.filter(_% 3 == 0)       // shorthand notation wildcard _
    println(divisibleByThreeOutput)
  }
  // Traditional Way
//  def divisibleByThree (x: Int) = {
//    x % 3 == 0
//  }

  // Anonymous function
   var divisibleByThree = (x: Int) => (x % 3 == 0)   //return boolean
   var divisibleByThree2: Int=>Boolean = (x: Int) => (x % 3 == 0) : Boolean   // if we want to specify data type

}
