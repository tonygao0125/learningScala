trait FourWheelerB {
  def tyres(): Unit = {
    println("4 Tyres is present in Four Wheeler")
  }
}


trait CarB {                                        // keyword trait

  def engine(): Unit ={                            // body is present for engine() method
    println("Engine is 1000 cc in Car")
  }
  def break()                                     // body is not present for break method. It must be implemented in
  // the class that is extending trait Car.
  def tyres() ={
    println("4 Tyres is present in Car")
  }
}

class MercedesB extends FourWheelerC with CarB {                       // keyword is extends and with

  def break() ={                                   // unimplemented break() is implemented here
    println("Disk Breaks in Mercedes")
  }

  override def tyres(): Unit = super.tyres()          // if same method "tyres()" is implemented in multiple traits
}                                                     // it will executed from trait on right side
                                                      // And override def...= super... keyword must be present

object DemoBTraits {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesB
    m1.break()
    m1.engine()
    m1.tyres()
  }
}
