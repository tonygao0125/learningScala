trait Car {                                        // keyword trait

  def engine(): Unit ={                            // body is present for engine() method
    println("Engine is 1000 cc")
  }
  def break()                                     // body is not present for break method. It must be implemented in
                                                  // the class that is extending trait Car.
  def tyres()
}

class Mercedes extends Car{                       // keyword is extend

  def break()={                                   // unimplemented break() is implemented here
    println("Disk Breaks")
  }
  def tyres={
    println("4 Tyres")
  }
}

object DemoATraits {

  def main(args: Array[String]): Unit = {
    val m1 = new Mercedes
    m1.break()
    m1.tyres
    m1.engine()
  }


}
