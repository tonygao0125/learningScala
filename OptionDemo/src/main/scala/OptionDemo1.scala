// Scala Option[ T ] is a container for zero or one element of a given type. An Option[T] can be
// either Some[T] or None object, which represents a missing value.
// For instance, the get method of Scala's Map produces Some(value) if a value corresponding to a given key
// has been found, or None if the given key is not defined in the Map.
object OptionDemo1 {
  def main(args: Array[String]): Unit = {

    //1. define a Int type Option
    var option1: Option[Int] = Some(10)
    var option2 = Some(11)                // if don't specify the Option class type, then it's Some type by default
   // Define none option
    var noneOption: Option[String] = None
    var noneOption2  = None
    println(option1.getClass)
    println(option2.getClass)
    println("class of noneOption " + noneOption.getClass +  " and " +
            "class of noneOption2 " + noneOption2.getClass)

    //2. Change existing option to None
    var option3: Option[Int] = Some(12) // option3 defined as either Some or None
    option3 = None                     // Can re-assign
    println(option1.getClass)
    // option1: Option[Int] = None    // ERROR ! But cannot re-assign with data type

    var option4 = Some(12)           // option4 defined as Some
    //option4 = None        // ERROR ! Because Some cannot be None
    //option4 : Option[Int] = None // ERROR !

    //3. Check if Empty
    println(option1.isEmpty)
    option1 = None            // change to None
    println(option1.isEmpty)

    // Application of Options in Map, get() method
    val Cars = Map("Mercedes"->"High Range", "BMW"->"High Range", "Suzuki"->"Mid Range", "Jaguar"->"Low Range")
    println(Cars.get("Mercedes"))       // if the element is present in Map, it returns Some
    println(Cars.get("Audi"))           // if the element is not present in Map, it returns None


    // Define a function to remove Some/None (converts into String), it returns String object
    def removeSome(x: Option[String]) : String= {
      x match {
        case Some(y:String) =>  y
        case None =>   "Not Found"
      }
    }
    println(removeSome(Cars.get("Jaguar")))
    println(removeSome(Cars.get("Audi")))

  }
}
