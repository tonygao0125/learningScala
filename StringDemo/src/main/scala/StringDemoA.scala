object StringDemoA {
  def main(args: Array[String]): Unit = {
    var greetings = "Hello Wolrd! "             // Data type String is not defined. Auto interpreted.
    println(greetings)
    var greetingsNew: String = "Hello China!"   // Data type String is defined
    println(greetingsNew)

    //Method to get length of String (Access Method - Any method (eg. length() used to get information of an object
    var lengthOfString = greetings.length()
    println("Length of String greetings: Hello World! is " + lengthOfString)

    // concat method
    var var1 = "Hello "
    var var2 = "World "
    println(var1 + var2)       // usual approach, can use + operator, "+" is actually method as well behind the scene
    println(var1.concat(var2)) // call concat() method , simple

    println((var1 + var2).charAt(6))  // To get character at a given index
    // Equals Method

    var varA  = "Hello World!"
    var varB  = "Hello World!"
    println(varA.equals(varB))  // check if two strings are same or not, true/false
    println(varA == varB)       // Same as equals. But does one additional step. It first checks varA and varB are not null

    var varC = null             // null value
    println(varC == null)       // check if null
    println(varC)

    var varD = ""
    println("if varD is empty? " + varD.isEmpty)  // isEmpty method, same as (varD == "")

    // String Formatting
    var nameOfCar = "Mercedes"
    var costOfCar = 500000
    var mileageOfCar = 8.5

    // printf - %s: String, %d: Int, %f: Float
    printf("Name of Car is %s and Cost of Car is %d and mileage of Car is %f", nameOfCar, costOfCar, mileageOfCar)
    println("")
    // Multi Line Strings  - Note: Use 3 double quote, and use of '|' symbol and others along with stripMargin function

    var multiLineString =
      """Hello
         World
         How
         Are
         You
         ?
        """.stripMargin
    println(multiLineString)



    var multiLineStringA =
      """Hello
        |World
        |How
        |Are
        |You
        |?
        """.stripMargin    //This stripMargin method was auto-generated in IDE.
    //the "|" escape the space in front of the pipe "|" sign, it's called "stripMargin" (margin in front are stripped)
    println(multiLineStringA)


    var multiLineStringB =
      """Hello
        $World
        $How
        $Are
        $You
        $?
        """.stripMargin('$')  //can specify the sign for escape, instead of '|'
                             // MUST USE SINGLE QUOTE because 单引号表示：char字符 双引号表示：string字符
    println(multiLineStringB)

    // String Interpolation  - widely used
    // 1. 's' String Interpolator
    var name = "Modi"
    println("Hello " + name)              // Using string concat / +

    println(s"Hello $name, how are you?") // Using s interpolator, widely used. More preferred than printf %s ...

    // 2. 'f' Interpolator
    name = "PM Modi"
    var salary = 20000.2
    println(f"Name is $name%s and salary is $salary%8.2f and designation is PM.")
    //%s %f data type are optional for 'f' interpolator, BUT NOT applicable to 's' interpolator

    // 3. raw Interpolator - Same as s interpolator but does not perform escaping. escaping - \n, \t
    println(s"This is \n s interpolator")
    println(raw"This is \n raw interpolator")



  }

}
