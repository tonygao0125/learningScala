object DemoBFileRead {
  def main(args: Array[String]): Unit = {
    var working_dir = System.getProperty("user.dir")+ "/src/main/scala/sampleData.txt"
    println("the current working directory is: " +  working_dir)
    // read flat file
    println("------------------Option1-------------------")
    scala.io.Source.fromFile(working_dir).foreach(line => print(line))

    println()
    println("------------------Option2-------------------")
    val lines = scala.io.Source.fromFile(working_dir).getLines()
    for(l<- lines) println(l)

  }
}
