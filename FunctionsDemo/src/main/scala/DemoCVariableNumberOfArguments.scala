// Variable number of Arguments in a Function

object DemoCVariableNumberOfArguments {
  def printMultipleTimes(n:Int, args:String*) ={  // String* means you are define Array[String]
    for (arg<- args){
      println(arg * n)
    }
  }

  def main(args: Array[String]): Unit = {
    printMultipleTimes(3, args= "Hello", "World", "India")
  }

}
