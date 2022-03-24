object DemoKFunctionCallByNameCalculator {
  def main(args: Array[String]): Unit = {
    println(calculator(add, 5, 2))
    println(calculator(sub, 5, 2))
    println(calculator(mul, 5, 2))
    println(calculator(div, 5, 2))
    println(calculator(rem, 5, 2))
  }
  def calculator (m:(Int, Int) => Int, x: Int, y: Int) = {
    m(x, y)
  }
//  def add(x: Int, y: Int) = {
//    x + y
//  }
  var add: (Int, Int)=> Int = (x: Int, y: Int) => x + y      // data type is optional
  var sub = (x: Int, y: Int) => x - y
  var mul = (x: Int, y: Int) => x * y
  var div = (x: Int, y: Int) => x / y
  var rem = (x: Int, y: Int) => x % y
}
