object DemoQNestedFunction {
  def main(args: Array[String]): Unit = {
    printHello("World")
    printHello("Singapore")

  }
  def printHello(str: String): Unit ={

    def printSomeThing(str1: String, str2: String) = {
      println(str1 + " " + str2)
    }
    printSomeThing("Hello", str)
  }

}
