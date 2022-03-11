


object ImplicitClassDemo {
  def main(args: Array[String]): Unit = {

    // NOTE: THE implicit CANNOT BE USED AT THE PACKAGE LEVEL. YOU NEED TO PUT IMPLICIT OBJECT/CLASS INSIDE ANOTHER
    // OBJECT THAT YOU CAN THEN IMPORT WHERE YOU NEED THE IMPLICITS
    // https://stackoverflow.com/questions/29973350/implicit-modifier-cannot-be-used-for-top-level-objects
    implicit class StringFunc(s:String) {
      def nthChar(n: Int) = s.substring(n, n+1)
    }

  /*
   *** How it works ***
   since aString is a string, so it will first go to search for built-in string functions, if the function is not
   available, then it will proceed to search if there any implicit class that define such function aString.nthChar()
   */
    var aString = "Hello World!"
    println(aString.nthChar(4))
    println(aString.nthChar(3))

  }

}
