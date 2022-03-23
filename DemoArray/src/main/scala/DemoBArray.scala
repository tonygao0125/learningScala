object DemoBArray {
  def main(args: Array[String]): Unit = {
    var marks = Array(58, 55, 23, 100, 21, 56, 77, 90)

///// foreach and map///////////////////////////////////////////
    //Option 1 -- using for loop
    for (mark <- marks) {
      println(mark)
    }
    //Option 2 -- using foreach
    //for each of the elements in array // foreach iterate through all the "mark"
    marks.foreach(println)

    var totalMarks = 0
    var averageMarks = 0
    // => arrow is function arrow, used both in function type signatures as well as anonymous function terms
    // "+" operator is actually method

    marks.foreach(mark=> totalMarks= totalMarks.+(mark))
  //marks.foreach(mark=> totalMarks += mark)
  //marks.foreach(totalMarks +=_) // short hand notation
    averageMarks = totalMarks / marks.length
    println(s"Sum of total marks is $totalMarks and average mark is $averageMarks")

    // 1. foreach, you can get multiple outputs, example: marks.foreach(println)
    // 2. foreach, you can also get one final output, example: marks.foreach(mark=>totalMarks+=mark)
    // 3. map, you will always get multiple output
    // 4. If you want to do same operation on each element of an Array --> Use Map (Note: You can also do with
    // foreach, but it will be slow)
    // map - do operations on elements in array in parallel, whereas foreach work on element one by one.
    var newMarks = marks.map(mark=>mark + 10)
    var newMarks2 = marks.map(_+20)    //short hand notation: using _, even we don't need mark
    println("newMarks are " + newMarks.mkString(", "))
    println("newMarks2 are " + newMarks2.mkString(", "))
    // use "for...yield" instead of "map", yield only works with for, cannot with foreach.
    val newMarks3 = for (mark <- marks) yield (mark + 20)
    println("newMarks3 are " + newMarks3.mkString(", "))

  }

}
