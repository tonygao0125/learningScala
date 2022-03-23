object DemoCArray {
  def main(args: Array[String]): Unit = {

    //reduceLeft
    var marks:Array[Int] = Array(21, 25, 39, 58, 79, 64, 52, 94, 34)
    var avg = marks.reduceLeft((x, y) => {
      println(s"x is $x and y is $y, result is ${(x+y)/2}")          // operations in between the computing
      (x+y)/2                                  // return the avg: Int, otherwise type mismatch error
      })
    println(avg)                                // print the avg

    var avg2 = marks.reduceLeft(_/2+_/2)        // short hand notation
    println(avg2)

    //examples of reduceLeft
    var totalMarks = marks.reduceLeft(_+_)
    println("Total Marks is " + totalMarks)

    var maxMarks = marks.reduceLeft((x, y) => x.max(y))
    println("Max Marks is " + maxMarks)

    //shorthand notation
    //var minMarks = marks.reduceLeft(_.min(_))
    var minMarks = marks.reduceLeft(_ min _)         // the dot and round bracket can be skipped.
    println("Min Marks is " + minMarks)
  }
}
