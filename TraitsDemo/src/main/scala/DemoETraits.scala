/* Value Class: Cannot allocate runtime object, i.e., when we created object m1 = Mercedes(5) we cannot change
to Mercedes(6) since Value Class has only 1 val parameter which is 5 here, cannot change*/
// Value class always has ONLY 1 PARAMETER WITH TYPE AS VAL
// You cannot extend a Value Class : e.g., class Demo extends MercedesE

// Benefits of Value Class
//1. Less initialization
//2. Better performance
//3. Less Memory usage

// Use Cases: Performance and Memory Optimization.

// VALUE CLASS CANNOT EXTEND A TRAIT, BUT CAN EXTEND UNIVERSAL TRAIT. THAT'S WHY YOU HAVE A UNIVERSAL TRAITS
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
