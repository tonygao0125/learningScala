/* To demonstrate Class and Object:
1. Class is collections of variables and methods
2. Object is instance of Class

Access level in scala:
* public - can access anywhere (By Default - if we don't specify keyword, it's public)
* private - can only access in the class it is defined
* protected - can access in class it is defined as well as in subclass extending the given class using inheritance.(discuss
in detail when we study inheritance.

*/

class Car{
  var roadTax = 100                   //this variable is public by default, so we can overwrite it's value.

  private var topClassExtraCost = 0   // if we defined this variable as private or protected, then it can only be used
                                      // inside this class

  protected var ticket = 50   //only accessible inside this class or subclass extending this class using inheritance

  def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax + ticket  //method is function defined inside class
  //method with side effect
  def check_private3() = topClassExtraCost
  def check_private() ={  // define a method returning private variable,
    topClassExtraCost = 10    //change value by mistake
    // the value of topClassExtraCost was changed anywhere in this class once being reassigned value
    // the changing of value is a side effect of method
    // this changing takes effect once this method being called
    topClassExtraCost       // then it's a walk around to access private level
  }
  def check_private2() = topClassExtraCost
  // the check_private2 method also return the reassigned value of topClassExtracost
}
// use sub-class to inherit the class Car
class smallerCar extends Car {
  print(ticket)              // protected can be accessed by the subclass extending the class defined it. (inheritance)
  print(roadTax)             // public can access anywhere
  //print(topClassExtraCost) // private not accessible outside the Class defined it.
}


object demoClassObject {

  def main(args: Array[String]): Unit = {

    println("Hello abc")

    printer("Hello World") // call the function printer (function vs method)

    var bmw = new Car            // create an new object bmw -> an instance of a class.
    println(bmw.roadTax)          // Can access all the variables and methods inside the class - Car


    var audi = new Car
    audi.roadTax = 200
    println("audi's road tax is " + audi.roadTax + ", but bmw's road tax remained " + bmw.roadTax) // call variables

    var result = bmw.cost(10000) // call the method cost from class Car
    println("total cost of this bmw is: " + result) //here the topclassextracost was not changed since the corresponding
    //method with side effect yet to be called.

    println("check topclassextracost: "+ bmw.check_private())  //enable to check the private level variable
    println("check topclassextracost2: "  + bmw.check_private2()) //both check_private2/3 return the changed value
    println("check topclassextracost3: "  + bmw.check_private3()) // the changing of value is a side effect of method
  }

  def printer(text: String) = println(text) // THIS IS FUNCTION NOT METHOD
}
