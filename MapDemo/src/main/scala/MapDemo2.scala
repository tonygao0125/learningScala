object MapDemo2 {
  def main(args: Array[String]): Unit = {
    var cars = Map("Mercedes"-> "High Range", "BMW"-> "High Range", "Toyota"-> "Mid Range",
      "Jaguar"-> "High Range", "Nano"-> "Low Range", "Mercedes"-> "Low Range")

    // Accessing elements in a Map using foreach, Map(key)
    cars.keys.foreach { key => println("The key of cars is " + key +
      " and the value is " + cars(key))}     // Map(key) can access the value of corresponding key
    // using foreach and case()
    cars.foreach{case(carName, carRange) => println(s"Key is cars is $carName, and Value is $carRange")}

    // check if present or not
    println(cars.contains("BMW"))

    // check any car has the value equals to "Mid Range"
    println(cars.valuesIterator.exists(value => value.equals("Mid Range")))
    println(cars.valuesIterator.exists(value => value.contains("Mid Range")))

    // Additional Define Map Method to return default value if the key is not included in the Map
    var cars2 = Map("Mercedes"-> "High Range", "BMW"-> "High Range", "Toyota"-> "Mid Range",
      "Jaguar"-> "High Range", "Nano"-> "Low Range", "Mercedes"-> "Low Range").withDefaultValue("Out of Map")
    println(cars2("AnyKeyNotInMap"))

    // getOrElse to return default value if the specific key not present
    println(cars.get("abc"))
    println(cars.getOrElse("abc","I am not able to get - Null"))
    println(cars.getOrElse("Mercedes", "I am not able to get - Null"))

  }
}
