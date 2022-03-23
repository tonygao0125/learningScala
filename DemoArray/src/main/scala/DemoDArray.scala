//we can also do the same operations in DemoCArray with reduceRight, but normally reduceLeft more widely used

object DemoDArray {
  def main(args: Array[String]): Unit = {

    //reduceLeft
    var marks:Array[Int] = Array(21, 25, 39, 58, 79, 64, 52, 94, 34)
    var avg = marks.reduceRight((x, y) => {
      println(s"x is $x and y is $y, result is ${(x+y)/2}")          // operations in between the computing
      (x+y)/2                                  // return the avg: Int, otherwise type mismatch error
    })
    println(avg)                                // print the avg

    var avg2 = marks.reduceRight(_/2+_/2)        // short hand notation
    println(avg2)

  }
}
