/* can use "scalac CaseClassDemoA.scala" to compile this file and generate java file, then use "javap <generated
java file>" to check the auto generated classes.
 */

case class Car (name: String, model: String){  //by default constructor variable name and model are val if no specifying
  var carName = name    // variable carName
  val carModel = model  // value carModel

  def printDetails(): Unit = {
    println(s"Car Name is: ${carName} and Car Model is: ${carModel}")
  }
}

object CaseClassDemoA {

  def main(args: Array[String]): Unit = {
    val bmw = Car("BMW", "550")  // 1. for case class object. NO NEED TO WRITE "new", since "apply" method is auto generated
    bmw.printDetails()
    bmw.carName = "B.M.W" //change value of carName for object bmw
    //bmw.name = "B.M.W"  // 2. constructor parameter is val by default(name is val by default), therefore mutator method is not generated to change the name
    println("print the name of the car: " + bmw.name)
    bmw.printDetails()

    bmw match {case Car(a, b) => println(a, b)}  // 3. There is unapply method, used for matching

    // 4. Autogenerate copy method
    val mercedes  = bmw.copy(name = "mercedes") // Make a bmw copy - mercedes with name "mercedes" but model remain same
    mercedes.printDetails()

    // 5. equals and hashcode method : auto-generated behind the scene
    println(bmw == mercedes) // we can directly compare 2 object by ==. not equal here, returns false as the name are different.

    // 6. toString method is auto-implemented
    println(bmw) // doesn't show object id (hash value code), instead toString method was auto-implemented (for case class only)
    println(bmw.toString) // same as above
  }
}
