/* Regular expression in Scala was adopted from Java; and Java's RE was adopted from Perl.
 1. Need to "import scala.util.matching.Regex" package
 2. You have to create an object of Class Regex
   * Method 1 - val pattern = new Regex("whatever you want to match")
 3. Or you can use r method/function that is defined in Regex Class and it calls the constructor.
   * Method 2 - val pattern = "whatever you want to match".r
 */

import scala.language.postfixOps
import scala.util.matching.Regex
object RegEx {
  def main(args: Array[String]): Unit = {
    val pattern = new Regex("Hello")
    var StringToFind = "Hello, how are you? Hello Again"

    println(pattern findFirstIn StringToFind)                 // return only the first matching "hello"
    println(pattern findFirstIn(StringToFind))                // "." is optional
    println(pattern.findFirstIn(StringToFind))

    println(pattern findAllIn StringToFind)                   // return iterator
    println((pattern findAllIn StringToFind).mkString(" , ")) //mkString(<separator>) is a method for iterator type data

    val pattern1 = "Hello".r
    println((pattern1 findAllIn(StringToFind)).mkString(" | "))

    var StringToFind2 = "My name is Gao Shuai and age is 30 and study in standard 7."
    val pattern2 = "[0-9]+".r    // to find all the numbers between 0 to 9. "+" infers to find one or more numbers.
    println((pattern2 findAllIn StringToFind2).mkString(" ,"))
    var x = (pattern2 findAllIn StringToFind2).toArray  // also can use toArray() method to convert it to array
    println(x(0) + ',' +  x(1))

    var StringToFind3 = "I'm Tony, you can also write as tony."
    val pattern3 = "(T|t)ony".r
    println((pattern3 findAllIn(StringToFind3)).mkString(" , "))

    // 2. Using Regular expression with getOrElse Function
    var StringToFind4 = "Hello World, how are you? Hello world Again"
    val pattern4 = "word".r
    println(pattern4 findFirstIn StringToFind4 getOrElse("No Match Found")) //cannot find word
    // however this getOrElse cannot be used in conjunction with findAllIn

    // 3. Using RE with foreach statement
    var StringToFind5 = "Hello, can you hear me, hello?"
    val pattern5 = "(H|h)ello".r
    pattern5 findAllIn StringToFind5 foreach(item => println(item))         // foreach matched item, print that item

    // 4. Intermediate level of RE examples
    var StringToFind6 = "Hello i am Able to do it, abl11 able able0"
    val pattern6 = "abl[ae]\\d+".r                          // "abl" + 'a' or 'e' + at least one number.
    println((pattern6 findAllIn StringToFind6).toArray.mkString(" , "))

    var pattern7 = "(-)?(\\d+)(\\.\\d*)?".r // "-" is optional + 1 or more digit + (decimal or 0/more digits) optional
    // "?" - It is used to match zero or one appearance of the foregoing expression.
    // "\\d" - first \ escape the second \, otherwise \d itself will be an escape
    var StringToFind7 = "-1.5 divide by 5 is 3 is wrong"
    println(pattern7.findAllIn(StringToFind7).mkString(" , ")) // -1.5  5  and 3 all are matched


    // 5. Advanced level of RE - extracting the value from matched regular expression
    var pattern7(sign, integerPart, decimalPart) = "-1.23"     // pattern7 was defined above
    println(sign, integerPart, decimalPart)

    for (pattern7(sign, integer, decimal) <- pattern7 findAllIn(StringToFind7)) {
      println(s"Sign is $sign, integerPart is $integer, and decimalpart is $decimal.")
    }
  }
}