// Map operation
object MapDemo3 {
  def main(args: Array[String]): Unit = {
    var cars = scala.collection.mutable.Map("Mercedes"-> "High Range", "BMW"-> "High Range", "Toyota"-> "Mid Range",
      "Jaguar"-> "High Range", "Nano"-> "Low Range", "Mercedes"-> "Low Range")

    // 1. map
    cars.values.map(value => println("the string length of " + value + " is " + value.toString.length))

    // 2. mapValues is deprecated, it returns MapView (not computed)
    //var newCars = cars.mapValues(value => value.toString.length)
    //println(newCars)

    // 3. transform is also deprecated. Can use "Use mapValuesInPlace instead
    cars.transform((carName, carRange) => carRange.toString.length.toString) // still Map[String, String]
    println(cars)

    // 4. sortedMap - Store the data in Sorted order
    var sortedCars = scala.collection.SortedMap("Mercedes"-> "High Range", "BMW"-> "High Range", "Toyota"-> "Mid Range",
      "Jaguar"-> "High Range", "Nano"-> "Low Range", "Mercedes"-> "Low Range")
    println(sortedCars)

    // 5. ListMap - Preserves the sequence of insertion
    var ListMapCars = scala.collection.immutable.ListMap("Mercedes"-> "High Range", "BMW"-> "High Range",
      "Toyota"-> "Mid Range", "Jaguar"-> "High Range", "Nano"-> "Low Range", "Mercedes"-> "Low Range")
    println(ListMapCars)

    // 6. LinkedHashMap - preserve the sequence of insertion and always append from the bottom
    var ListMapCars2 = scala.collection.mutable.LinkedHashMap("Mercedes"-> "High Range", "BMW"-> "High Range",
      "Toyota"-> "Mid Range", "Jaguar"-> "High Range", "Nano"-> "Low Range", "Mercedes"-> "Low Range")

    ListMapCars2 += ("no1" -> "number 1")
    ListMapCars2 += ("no2" -> "number 2")
    ListMapCars2 += ("no3" -> "number 3")
    println(ListMapCars2)

    // 7. HashMap - where data are stored as hashes, no guarantee sequence
    var HashMapCars = scala.collection.mutable.HashMap("Mercedes"-> "High Range", "BMW"-> "High Range",
      "Toyota"-> "Mid Range", "Jaguar"-> "High Range", "Nano"-> "Low Range", "Mercedes"-> "Low Range")
    println(HashMapCars.getClass)
  }
}
