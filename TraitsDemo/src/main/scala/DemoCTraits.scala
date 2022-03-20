abstract class Vehicle {                          // Abstract Class
  def category()                                  // Method "category" is not implemented.
}                                                 // Abstract Class doesn't support multiple inheritance


trait FourWheelerC {
  def tyres(): Unit = {
    println("4 Tyres is present in Four Wheeler")
  }
}


trait CarC {                                        // keyword trait
  var x = 1000
  val t = 4
  def engine(): Unit ={                            // body is present for engine() method
    println(s"Engine is $x cc in Car")
  }
  def break()                                     // body is not present for break method. It must be implemented in
                                                  // the class that is extending trait Car.
  def tyres(): Unit ={
    println("4 Tyres is present in Car")
  }
}

class MercedesC extends Vehicle with FourWheelerC with CarC {           // keyword is extends and with

  def break() ={                                   // unimplemented break() is implemented here
    println("Disk Breaks in Mercedes")
  }

  override def tyres(): Unit = super.tyres()          // if same method "tyres()" is implemented in multiple traits
                                                      // it will executed from trait on right side
                                                      // And override def...= super... keyword must be present
  def category() = {
    println("It is Mercedes")
  }

  x = 2000                                          // x value override
  override val t = 6                                // must use override keyword for val
  override def engine(): Unit = {                   // override super/parent class CarC method engine()
    println(s"Engine of Mercedes is $x cc.")       // class with lower level of hierarchy will be executed.
  }

}
object DemoCTraits {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesC
    m1.break()
    m1.engine()
    m1.tyres()
  }
}
