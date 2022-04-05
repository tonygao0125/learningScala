// Read from Command Line by using the package "scala.io._"
object DemoACommandLine {
  def main(args: Array[String]): Unit = {

    //1. Read from Command Line using "scala.io.StdIn.readLine()"
    println("Enter you name")
    var name = scala.io.StdIn.readLine()
    println("Hello " + name)

    println("Enter your Phone Number")
    var number = scala.io.StdIn.readLine()
    println("Your Phone number is " + number)

    //2. Read from Command Line using "Console.readLine()" (Deprecated/obsolete)
//    println("Hello " + name + ", What is your Age?")
//    var age = Console.readLine()
//    println("Age is " + age)
  }
}
