// Program no 3 : Default parameters in constructor

class demoClass2(val a:Int = 99, val b:Double = 88.88, val c:String= "Hello Scala") { // Class with passing parameter
  val x = a
  var y = b
  val z = c

  def addNumber() ={
    x + y
  }
  println(s"x - ${x} and y - ${y} and z - ${z}")

}

object ConstructorDemo2 {
  def main(args: Array[String]): Unit = {

    val demoObject1 = new demoClass2(5, 7.2, "Hello World!") //if don't pass any parameter, it takes default parameters

    val demoObject2 = new demoClass2()  //don't pass parameters, it takes default parameters

    val demoObject3 = new demoClass2(25)  //if only pass one parameter, it takes as the first position parameter

    val demoObject4= new demoClass2(25, 26.1)  // takes the passing parameters according to the positions

    val demoObject5 = new demoClass2(a =10, c = "Hello Hello")  // if need to pass parameters optionally, then need specify keywords

  }
}
