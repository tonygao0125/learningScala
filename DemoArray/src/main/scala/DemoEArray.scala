// Multi dimension Array
import scala.Array._          //must import Array package if we want to use multi-dimensional class

object DemoEArray {
  def main(args: Array[String]): Unit = {

    var matrixEg = ofDim[Int](3,3)

    for (row <- 0 to 2) {
      for (col <- 0 to 2) {
        matrixEg(row)(col) = col +3
        print(matrixEg(row)(col))
      }
      println("")
    }

    //create a diagonal array
    var digmatrixEg = ofDim[Int](5,5)

    for (row <- 0 to 4) {
      for (col <- 0 to 4) {
        if (row==col) {digmatrixEg(row)(col) = 1}
        else {digmatrixEg(row)(col) = 0}
        print(digmatrixEg(row)(col))
      }
      println("")
    }



//    for (row <- 0 to 2) {
//      for (col <- 0 to 2) {
//        print(matrixEg(row)(col) )
//      }
//      println(" ")
//    }

  }
}
