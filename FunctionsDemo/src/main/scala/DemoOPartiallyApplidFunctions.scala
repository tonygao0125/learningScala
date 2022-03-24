object DemoOPartiallyApplidFunctions {
  def main(args: Array[String]): Unit = {
//    fourWheeler("Mercedes", "Car", 200000)
    car("Mercedes") //Only need to pass partial parameter, i.e., vehicleName here.
    car("BMW")
    truck("BMW")
  }
  // 3. Partially applied function
  val car = fourWheeler(_:String, "Car", 200000) // placeholder underscore
  val truck = fourWheeler(_:String, "Truck", 500000)


  // 2. Normally implemented function, anonymous function
  val fourWheeler = (vehicleName: String, vehicleType: String, vehicleCost: Int) => {
    println("Vehicle Name is : " + vehicleName +
            "Vehicle Type is: " + vehicleType +
            "Vehicle Cost is: " + vehicleCost)
    }


  // 1. Normal way
  //  def fourWheeler(vehicleName: String, vehicleType: String, vehicleCost: Int) ={
  //    println("Vehicle Name is : " + vehicleName +
  //            "Vehicle Type is: " + vehicleType +
  //            "Vehicle Cost is: " + vehicleCost)
  //  }
}
