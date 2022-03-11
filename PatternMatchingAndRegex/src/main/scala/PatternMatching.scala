// pattern match, case class

case class Car(name:String, cost:Int) { // NoteA: by default name and cost are val, immutable.

}


object PatternMatching {
  def main(args: Array[String]): Unit = {

    //1.
    println(matchPattern1(1))                // matchPattern1
    println(matchPattern1(4))                // matchPattern1
    //2.
    println(matchPattern2(1))                // matchPattern2
    println(matchPattern2("Three"))          // matchPattern2
    println(matchPattern2("Hello"))          // matchPattern2

    //3. Using case class in pair with pattern matching
    val mercedes = new Car("Mercedes", 500000)       // name and cost are val by default
    val bmw = Car("BMW", 700000)                                  // keyword "new" is not mandatory for case class
    val jaguar = Car("Jaguar", 1000000)
    for (car <- List(mercedes, bmw, jaguar)) {
      car match{
        case Car("BMW", 700000) => println("Car is BMW, Waow!")
        case Car("Mercedes", 500000) => println("Car is Mercedes, Congrats!")
        case Car(name, cost) => println("Car is " + name + " Cost is " + cost + ". That's Great!")
      }
    }
  }
  //1. Int data type for input and String data type for output parameters
  def matchPattern1(x:Int): String = x match {
    case 1 => "One"
    case 2 => "Two"
    case _ => "None of above"
  }

  //2. Any data type for input and output parameters
  def matchPattern2(x:Any) = x match {
    case 1 => "One"
    case 2 => "Two"
    case "Three" => 3
    case "Four" => 4
    case _ => "None of above"
  }

}
