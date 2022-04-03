object TupleDemo2 {
  def main(args: Array[String]): Unit = {
    // Define a List with Tuple elements
    val carList = List(("Mercedes", "High Range"), ("Suzuki", "Mid Range"), ("Jaguar", "High Range"),
                        ("BMW", "High Range"))
    println(carList)
    carList.foreach {
      case("Jaguar", range) => println("Car is Jaguar and the range is " + range)
      case("Suzuki", range) => println("Car is Suzuki and the range is " + range)
      case _ =>           //means in other cases do nothing // or written as "case (_, _) => ()"
    }

    /*
    NOTE: TUPLE IS NOT MUCH USED. INSTEAD OF TUPLE MOST PEOPLE WILL USE CASE CLASS.
     */
    // For Example
    val student1 = (1, "abc") // define a tuple for student object, but it's difficult to understand what is abc

    // If we use case Class: easier for ppl to understand what's the object and arguments
    case class Student(rollNo: Int, firstName: String, lastName: String)
    val student2 = Student(2, "Jim", "Green")
    println(student2)

  }
}
