object DemoAArrays {
  def main(args: Array[String]): Unit = {
    var marks = Array(58, 55, 23, 100, 21, 56, 77, 90)

    // loop
    for (mark <- marks) {           // <- used in iteration
      println(mark)
    }

    // Average marks
    var totalMarks = 0
    var averageMarks = 0

    for (mark <- marks) {                             //Scala way
      totalMarks = totalMarks + mark
    }
    averageMarks = totalMarks / marks.length
    println("Average of marks in Scala way is " + averageMarks);

    var totalMarks2 = 0 ; var averageMarks2 = 0;
    for (i <- 0 to (marks.length - 1)) {        // or (i<- marks.indices) or (i <- 0 until marks.length)
      totalMarks2 = totalMarks2 + marks(i)
    }
    averageMarks2 = totalMarks2 / marks.length
    println("Average of marks in Java way is " + averageMarks)

  }
}
