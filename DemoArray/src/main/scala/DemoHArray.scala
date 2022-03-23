import scala.collection.mutable.ArrayBuffer

object DemoHArray {
  def main(args: Array[String]): Unit = {
    var marks = new ArrayBuffer[Int]()                   // Array without fixed size
    marks += 10
    marks += 6
    marks += 3
    marks.foreach(print)
    println()

    marks += 5                                        //append element
    marks.foreach(print)
    println()

    marks.append(7)                                   //append element, append directly to marks
    marks.append(7)
    marks.foreach(print)
    println()

    var marksnew = 0+:marks:+8                        //prepend and append element but doesn't affect marks
    marksnew.foreach(print)
    println()

    marks ++= Array(3,3,3,4,5,6)                      //append an array
    marks.foreach(print)
    println()

    marks -= 6                                        //remove the element from the left, the left most 6  was removed
    marks.foreach(print)
    println()
  }
}
