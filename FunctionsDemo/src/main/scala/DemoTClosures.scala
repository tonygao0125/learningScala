// Closures: Variables are defined outside function definition

object DemoTClosures {
  def main(args: Array[String]): Unit = {
    println(multiplier(5))
  }
//  def multiplier(x: Int) : Int ={
//    x * 10
//  }
  var factor = 10
  val multiplier = (x: Int) => x * factor
  // if variable (eg: factor) is defined outside the function body, it is called as Closure
  // if variable used inside function body (eg factor) is neither an input parameter nor defined inside
  // function body


  // NOTE: BELOW FUNCTION IS NOT CLOSURE, since the variable is defined inside function body
  var multiplier2 = (x: Int) =>{
    var factor2 = 1
    x* factor2
  }
}
