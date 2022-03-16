import scala.util.control.Breaks

object DemoCForLoop {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 10) {             // include 10
      println(s"the value of i is $i")
    }

    for (i <- 1 until 10) {          // exclude 10
      println("value of i is " + i)
    }

    // Nested for loop - general
    println("=" * 30 + "Nested for loop" + "=" * 30)
    for (i <- 1 to 10) {
      for (j <- 1 to 10) {
        println ("Value of i is " + i + " value of j is " + j)
      }
    }
    // Nested for loop - Scala (equivalent to above result)
    for (i <- 1 to 10; j <- 1 to 10) {
      println ("Value of i is " + i + " value of j is " + j)
    }

    // List - similar to Arrays. List is immutable i.e. cannot change value once defined. However, arrays is mutable.
    println("============================for loop and list============================")
    var numbersList1 = List (1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // list in scala is immutable
    // access the element of list with for loop
    for (i <- numbersList1) {
      println("value of i is " + i)
    }

    println("============================for loop and list with filter============================")
    var numbersList2 = List (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // only print the even numbers
    for (i <- numbersList2 if i%2 == 0; if i != 4) { // filter the list with condition
      println("even value i is " + i)
    }

    println("============================for loop and list with filter with YIELD============================")
    var numbersList3 = List (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // only print the even numbers
    var evenNumberList = for (i <- numbersList3 if i%2 == 0) yield i  //yield similar to return in other lang
    println(evenNumberList) // List(2, 4, 6, 8, 10)
    // get a list evenNumberList from numberList3 since list is immutable, we define another list

    // break statement - introduced from scala 2.8
    // different from other lang, scala implement break as object instead of key word
    var numbersList4 = List (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val breakObject = new Breaks; //import scala.util.control.Breaks package automatically

    breakObject.breakable {
      for (i <- numbersList4) {
        println("value of i is " + i)

        if (i == 4)
        {
          println("I am breaking at 4")
          breakObject.break  // this break must be included inside breakObject.breakable
        }
      }
    }
    // infinite loop (AVOID!!)
    var i = 5
    while (i < 10 ) {
      println("value of i is using until" + i) //forgot write i += 1
    }
  }


}
