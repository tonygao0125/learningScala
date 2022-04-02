object MapDemo1 {
  def main(args: Array[String]): Unit = {
    var cars = Map("Mercedes"-> "High Range", "BMW"-> "High Range", "Toyota"-> "Mid Range",
                  "Jaguar"-> "High Range", "Nano"-> "Low Range", "Mercedes"-> "Low Range")

    println(cars)           // 1. Key must be unique but value need not be unique
                            // 2. If same keys assigned with different value, the key take the latest value
    println(cars.getClass)        // By default, the map created will be immutable

    // 3. Add new key-value pairs (NOTE: IF cars DEFINED AS VAL, THEN WE CANNOT ADD ELEMENTS)
    cars += ("Suzuki"-> "Mid Range")
    cars.+=("Audi" -> "High Range")
    println(cars)

    // define a mutable map
    val cars1 = scala.collection.mutable.Map("Mercedes"-> "High Range", "BMW"-> "High Range", "Toyota"-> "Mid Range",
      "Jaguar"-> "High Range", "Nano"-> "Low Range", "Mercedes"-> "Low Range")
    cars1 += ("Suzuki"-> "Mid Range")
    println(cars1)          // even if cars1 is val, we can still add elements if car1 is mutable Map

    /*
    - In immutable Map, += operator (method) will return a new Map object. And new object can only be saved
      if the object is of type var
    - In mutable Map, += operator (Method) will modify the existing Map object. Hence it will  work on
      both var and val
     */

    // 4. Some methods of Map
      // keys - unique thus it returns a Set
    println("The keys of the cars are: " + cars.keys)
      // values - it returns iterable
    println("The values of the cars are: " + cars.values)

      // isEmpty
    println("Is it empty ? " + cars.isEmpty)

      // Create an empty Map
    var emptyMap = Map()
    var emptyStringMap: Map[String, String] = Map()  // with type
    println("Is empty map empty? " + emptyMap.isEmpty)
    // Append Map
    emptyStringMap += ("c" -> "letter c")
    println("emptyStringMap is: "+ emptyStringMap)

    // Merge Map
    var NewStringMap = emptyStringMap ++ Map("a" -> "letter a", "b" -> "letter b")
    println("NewStringMap is: " + NewStringMap)

    // return maximum key
    println("max key is: " + cars.max)
    // return minimum key
    println("min key is: " + cars.min)

    // return first and the rest map
    println("first map is: " + cars.head)
    println("rest map are: " + cars.tail)

    // remove elements
    cars -= "Toyota"              // for remove only need to specify the
    println("After removing key value of Toyota: " + cars)

    cars --= Set("Audi", "Mercedes")  // A new map
    //cars -= ("Audi", "Mercedes")
    println("After removing more elements" + cars)

    // Methods for mutable Map
    println(cars1)
    cars1.put("d", "letter d")  // add element
    println(cars1)

    cars1.remove("d")  // remove element
    println(cars1)

    // get method: returns the value of specific key
    println(cars.get("Suzuki"))
    println(cars1.get("Toyota"))

  }
}
