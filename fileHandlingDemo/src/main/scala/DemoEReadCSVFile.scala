object DemoEReadCSVFile {
  def main(args: Array[String]): Unit = {
    val sampleCSVFile = System.getProperty("user.dir") + "/src/main/scala/sampleCSVFile.csv"

    val lines = scala.io.Source.fromFile(sampleCSVFile).getLines()
    //lines.foreach(line => println(line))

    for (line <- lines) {
      if (line != "name,address,age")
      {
        val Array(name: String,address: String,age: String) = line.split(',')
        println("Name is " + name +
                ". Address is " + address +
                ". Age is " + age + ".")
      }
    }

  }
}
