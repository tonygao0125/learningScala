import scala.collection.mutable.ArrayBuffer

object ArrayTest {
  def main(args: Array[String]): Unit = {
    // first way
    var num: Array[Int] = new Array[Int](3) // Declare an Array, name is num, length is 3.
    println(num.mkString(","))              // Check the initial value is (0, 0, 0)
    num(0) = 25
    num(1) = 35
    num(2) = 50
    println(num.mkString(","))

    // second way
    val num2: Array[Int] = Array[Int](25, 35, 50) // or simply: var num2 = Array(25, 35, 50)
    println(num2.mkString(","))

    // Array is mutable in terms of element, but the length/size cannot change
    num2(1) = 40
    println(num2.mkString(","))

//    num2 += 60                  //add/delete element in num2 (change the size of array num2) is not allowed.
//    println(num2.mkString(",")) // error

    val num3 = ArrayBuffer(10, 20 ,30)  // declare an ArrayBuffer
    num3 += 40                          // The size of ArrayBuffer can change
    println(num3.mkString(","))

    // Array of String
    var str = new Array[String](3)
    println(str.mkString(","))          // null by default

    // Array of Double
    var dou = new Array[Double](3)
    println(dou.mkString(", "))          // 0.0 by default

    // Array of Any ( mix of different data types)
    val anything = Array[Any](1, 3, "hello")
    println(anything.mkString(", "))
  }
}
