# learningScala

### Commen data type in Scala
|Data Type |Default Value |Size |
|---       |---           |---  |
|Boolean	 |False	        |True or false |
|Byte      |0	            |8 bit signed value (-27 to 27-1) |
|Short	   |0	            |16 bit signed value(-215 to 215-1) |
|Char	     |'\u0000'	    |16 bit unsigned Unicode character(0 to 216-1) |
|Int	     |0	            |32 bit signed value(-231 to 231-1) |
|Long	     |0L	          |64 bit signed value(-263 to 263-1) |
|Float	   |0.0F	        |32 bit IEEE 754 single-precision float |
|Double	   |0.0D	        |64 bit IEEE 754 double-precision float |
|String	   |Null	        |A sequence of characters |

---
## Day11 - Execptional Handling
### Definition
*One of the effective means to **handle the runtime errors** so that the regular flow of the application can be preserved.*

- An exception is an unwanted or unexpected event, which occurs during the execution of a program i.e at run time, that disrupts the normal flow of the program’s instructions.
- Exceptions can be caught and handled by the program. When an exception occurs within a method, it creates an object. This object is called the exception object. It contains information about the exception such as the name and description of the exception and the state of the program when the exception occurred.
- Exceptional Handling 
![alt text](https://qph.fs.quoracdn.net/main-qimg-f8158a86d1c25835cb09137a955295d3-pjlq)

### Reasons
- Invalid user input
- Device failure
- Loss of network connection
- Physical limitations (out of disk memory)
- Code errors
- Opening an unavailable file

### Example
1. Read a file, however
  - File Not Fould
  - File Is Corrupted
2. Divide a/b, however denominator b=0, lead to Arithmetic issue. 

### Scala vs Java
Exception Handling in Java is very similar to Scala. But Java have two types exceptions: checked and unchecked exception; **Scala only has unchecked expression**. 
- <ins> Checked exception </ins>: Mandatory to check this kind of expression at compile time so they are also called compile time exceptions. E.g., File/Class Not Found. 
  - ClassNotFoundException
  - IOException
  - SQLException
- <ins> Unchecked exception </ins>: Not checked by the compiler, also called runtime exceptions. Exmaple: a program is ok to be compiled so checked exeption pass, but when run, it throws arithmetic error. Then, it's unchecked exception.
  - ArithmeticException
  - ArrayStoreException
  - ClassCastException

### When come across an exception, either we can make a throw or handle it.

- Throw exception - Pass the exception to the main/another program. 

- Handle - 3 ways to handle:
  1. Try...Catch... (traditional way)
  2. Try (with predifined Class)...Success/Failure...
  3. Catch object 

---
## Day12 - Traits, Value Class & Universal Traits
### Definition
- Traits encapsulates methods and fields definition. 
- Trait is very similar to class, it's defined by key word - trait. 
- Cannot create the object intance for trait.
- It's only used for inheritance purpose.
- **In class, one child class cannot extends multiple parent classes. However, in trait, one child class can extends multiple traits.**

### Example 1
```
trait xyz {
      var x = 10
      def add() = {1 + 2}
      };
      
class xyz1 extends xyz   // create a child class xyz1 inherit the trait xyz, whatever available in trait will be available in xyz1. 
```

### Example 2
***Traits can have unimplemented methods, but unimplemented methods should be implemented in the class extending the given trait***
```
trait Car {
  def engine()= {println("1000cc")}
  def wheel()                             // wheel() here is unimlemented method
  def breaks()                            // breaks() here is unimlemented method
}

class mercedes extends Car{
  def engine()= {println("2000cc")}.       // overwrite the method in parent class if the method body was already present
  def wheel()= {print("wheels")}           // wheel() body must be implemented in the child class extends the trait
  def breaks()= {print("Disk brekas")}     // breaks() boydy must be implemented in the child class extends the trait
}
```

### Example 3
***Multiple inheritance from trait***
```diff
trait Vehicle{
  def breaks()= {print("a")}
}

trait Car{
  def breaks()= {print("b")}
}

class Mercedes extends Vehicle with Car {
!  override def breaks(): Unit = super.breaks()      // if same methods present for multiple trait, then the child class extending them must have
                                                     // override...super... statement. And, the trait extended lastly will be executed (Car here).
}

object DemoExample3 {
  def main(args: Array[String]): Unit = {
    val car1 = new Mercedes
+   car1.breaks()                                    // The breaks() method from trait Car will be executed here
}
}

+ In multiple inheritance case, Mercedes class inherit the breaks method from the last trait.
```
### Value Class and Universal Traits
***Refer to the example below***
#### <ins> Features of Value Class </ins>
1. Value Class: Cannot allocate runtime object, i.e., when we created object m1 = Mercedes(5) we cannot change
to Mercedes(6) since Value Class has only 1 val parameter which is 5 here, cannot change
2. Value class always has ONLY 1 PARAMETER WITH TYPE AS VAL
3. You cannot extend a Value Class : e.g., class Demo extends MercedesE

#### <ins> Benefits of Value Class </ins>
1. Less initialization
2. Better performance
3. Less Memory usage
4. Use Cases: Performance and Memory Optimization.

```diff
+ // VALUE CLASS CANNOT EXTEND A TRAIT, BUT CAN EXTEND UNIVERSAL TRAIT. THAT'S WHY YOU HAVE A UNIVERSAL TRAITS
trait CarE extends Any {       // universal trait extends ""Any". "Any" is first level Class (root of Scala class hierarchy)
  def print() {println(this.getClass)}  // "this" will call members(variables/methods) associated with the current object of the class
}
class MercedesE(val x:Int) extends AnyVal with CarE{              //MercedesE is Value Class here
  // var y =1 ---> Cannot define any variables in a value class. Can only define methods
  def hello = {
    println("Hello")
  }
}

object DemoETraits {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesE(5)
    m1.print()
    m1.hello
  }
}
```
## Arrays
### Definition
- Collection of same data type elements.
- Use case: Instead of creating multiple variables, we can simply creating array.


### Example
- collection of Integer Array: (1, 2, 3, 4, 5)
- collection of String Array: ("abc", "def", "ghi)

```diff
// Delcaration of Array
var num: Array[Int] = new Array[Int](3)         // 1st way
var num = new Array[Int](3)                     // 2nd way 
// Store Integer in Array, assign value.
! / Scala is pure object oriented programming language, everthing is implemented as function/method, so it always have a round bracket to access element
num(0) = 25
num(1) = 35
num(2) = 50

//Another way to create num Array
var num = Array(25, 35, 50)

```
- num: name of array
- Array: Array
- Int: data type
- new: key word of creating an object
- Array: name of class
- Int: data type
- 3: length of array

### Array vs ArrayBuffer
- ***An Array is mutable in that its elements can change, but its size/length can’t change.***
- ***To create a mutable, indexed sequence whose size can change, use the ArrayBuffer class.***
```diff
    import scala.collection.mutable.ArrayBuffer

    val num2: Array[Int] = Array[Int](25, 35, 50) // or simply: var num2 = Array(25, 35, 50)
    println(num2.mkString(","))
@@  // Array is mutable in terms of element, but the length/size cannot change @@
    num2(1) = 40
    println(num2.mkString(","))
    
-   num2 += 60                  //add/delete element in num2 (change the size of array num2) is not allowed.
-   println(num2.mkString(",")) // error

+   val num3 = ArrayBuffer(10, 20 ,30)  // declare an ArrayBuffer 
+   num3 += 40                          // The size of ArrayBuffer can change
    println(num3.mkString(","))
```
### foreach vs map
- <ins> foreach </ins> iterates over a collection(list/array) and performs some operations with side effect to each element (such as saving each one to database)
- <ins> map </ins> transforms each element of that list/array in parallel and return another list/array with same size. 

```diff
    var marks = Array(58, 55, 23, 100, 21, 56, 77, 90)
    var totalMarks = 0 ; var averageMarks = 0; 
 
    //for each of the elements in array // foreach iterate through all the "mark"
    marks.foreach(println)
    // => arrow is function arrow, used both in function type signatures as well as anonymous function terms
    // "+" operator is actually method

   marks.foreach(mark=> totalMarks += mark)
  //marks.foreach(totalMarks +=_) // short hand notation
    averageMarks = totalMarks / marks.length
    println(s"Sum of total marks is $totalMarks and average mark is $averageMarks")

    // 1. foreach, you can get multiple outputs, example: marks.foreach(println)
    // 2. foreach, you can also get one final output, example: marks.foreach(mark=>totalMarks+=mark)
    // 3. map, you will always get multiple output
    // 4. If you want to do same operation on each element of an Array --> Use Map (Note: You can also do with
    // foreach, but it will be slow)
    // map - do operations on elements in array in parallel, whereas foreach work on element one by one.
    var newMarks = marks.map(mark=>mark + 10)
    var newMarks2 = marks.map(_+20)    //short hand notation: using _, even we don't need mark
    println("newMarks are " + newMarks.mkString(", "))
```
---
## Day-14 ~16 Functional Programming
### Definition of Functions
Groups of statements for performing secific tasks, it is used to easy readability and reuse the code for multiple times.

### Method vs Function
- Method is defined inside class with name, signature and bytecode. Always need an object instance to call the methods. 
- Function is defined independent of class, it may or may not have name (anonymous function). In Scala, even operators can be defined as functions.

### How to define a function
```diff
def functionName([args/parameters]):[return type] = {

Function Body

return [variable]
}
```
### Recursive Function
```diff
object DemoERecursiveFunctions {

  def factorial (n: Int): Int={
    if (n<= 1)
      1
    else
      n * factorial(n-1)                            // Recursive functions. Calls itself
  }

  def main(args: Array[String]): Unit = {
    var result = factorial(5)
    println(result)
  }
}

```
### Anonymous Function
- Functions without a name and def keyword.
- First Class Function... Pass Function as parameter and define function values
```diff
object DemoFAnonymousFunctions {
  def main(args: Array[String]): Unit = {
    println("The increments function output is " + increments(5))
    printHelloWorld()
    add(2, 3)
  }

  //Example 1: Anonymous Function with 1 input parameter and 1 output parameter
  // Using function value/ Anonymous functions
  var increments = (x: Int)=> x +1            // define an anonymous function as a variable

  //Example 2: Anonymous Function with 0 input parameter and 0 output parameter
  // Using function value/ Anonymous functions
  var printHelloWorld = () => println("hello world")

  //Example 3: Anonymous Function with 2 input parameters and 1 output parameter
  var add = (x: Int, y: Int) => print(s"The sum is ${x+y}")
}
```

### Function call by Function
- Function as a parameter of another function

```diff
object DemoIFunctionCallByName {
  def main(args: Array[String]): Unit = {
    printValue(increment())        // pass a function as a parameter to another function
    printValue(decrement())        // pass decrement() function to m
  }
  def printValue (m: => Int) = { //increment() is function m here, pass no parameter so " "=> Int
    println("Addition value is " + m)
  }
  def increment() = {
    var y = 2
    println("Value of y is " + y)
    var z = y + 1
    println("Value of y after incrementing is " + z)
    z
  }

  def decrement() = {
    var y = 2
    println("Value of y is " + y)
    var z = y - 1
    println("Value of y after decrementing is " + z)
    z
  }
}

object DemoJFunctionCallByName {
  def main(args: Array[String]): Unit = {
    printValue(increment, 2)        // pass a function as a parameter to another function
    printValue(decrement, 2)        // pass decrement() function to m
  }
  def printValue (m:Int => Int, x: Int) = { //increment() is function m here, pass no parameter so " "=> Int
    println("Addition value is " + m(x))
  }
  def increment(y: Int) = {
    println("Value of y is " + y)
    var z = y + 1
    println("Value of y after incrementing is " + z)
    z
  }
  def decrement(y: Int) = {
    println("Value of y is " + y)
    var z = y - 1
    println("Value of y after decrementing is " + z)
    z
  }
}
```
### Function by Name
```
object DemoMFunctionByName {
  def main(args: Array[String]): Unit = {
  
    println("Main Function: " + exec(time()))     
  }
  def time(): Long = {
    println("Inside the time function")
    return System.nanoTime()
  }

  // function by name
  def exec(t: => Long): Unit = {
    println("Inside exec function")
    println("Time: " + t)                        // time() won't be evaluated until name t is called.  // 1st Reference
    println("Exiting from time function")
    return t                                      // 2nd Reference
  }
}
```
- It will first execute the OUTSIDE function "exec()" and then execute the INSIDE function "time()" every time
t is being referred.
- Since OUTSIDE function "exec()" got executed first, it calls INSIDE function "time()"using the
REFERENCED VARIABLE t, it is called as "Function by Name".

### Partically Applied Function
- Scala, like many other functional languages, allows developers to apply functions partially. What this means is that, when applying a function, a developer does not pass in all the arguments defined by the function. But provides only for some of them, leaving remaining parameters to be passed later.
- Once you have provided the required initial parameters, what you get back is a new function whose parameter list only contains those parameters from the original function that were left blank.
- We have reduced a method that used to accept multiple arguments to a function that accepts only a single argument, thus making it easier for consumers to use the method.
- We can safeguard our code by exposing only a partially applied function so that no one else can pass in incorrect arguments by mistake.
- These arguments which are not passed to function we use underscore ( _ ) as placeholder.
```diff
object DemoOPartiallyApplidFunctions {
  def main(args: Array[String]): Unit = {
//    fourWheeler("Mercedes", "Car", 200000)
    car("Mercedes") //Only need to pass partial parameter, i.e., vehicleName here.
  }
  // 3. Partially applied function
  val car = fourWheeler(_:String, "Car", 200000) // placeholder underscore

  // 2. Normally implemented function (defined by anonymous function)
  val fourWheeler = (vehicleName: String, vehicleType: String, vehicleCost: Int) => {
    println("Vehicle Name is : " + vehicleName +
            "Vehicle Type is: " + vehicleType +
            "Vehicle Cost is: " + vehicleCost)
    }
```
### Currying Function
Currying transforms a function that takes multiple parameters into a chain of functions, each taking a single parameter.
#### Syntax
- ***def strcat(s1: String)(s2: String) = s1 + s2***
- ***def strcat(s1: String) = (s2: String) => s1 + s2***
```diff
// Scala program add two numbers
// using Currying function
  
object Curry
{
    // transforming the function that 
    // takes two(multiple) arguments into 
    // a function that takes one(single) argument.
    def add2(a: Int) = (b: Int) => a + b;                    // Currying function
  
    // Main method
    def main(args: Array[String])
    {
        println(add2(20)(19));
        
        val sum = add2(29)_;                                  // Partially Applied Function
        println(sum(5));  
    }
}
```
