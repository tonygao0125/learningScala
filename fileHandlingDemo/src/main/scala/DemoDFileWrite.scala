import java.io.{File, FileWriter, PrintWriter, BufferedWriter}

object DemoDFileWrite {
  def main(args: Array[String]): Unit = {
    var output_dir1 = System.getProperty("user.dir")+ "/src/main/scala/outputFile1.txt"
    println("the current working directory is: " +  output_dir1)
    var output_dir2 = System.getProperty("user.dir")+ "/src/main/scala/outputFile2.txt"
    var output_dir3 = System.getProperty("user.dir")+ "/src/main/scala/outputFile3.txt"


    // --------------------option 1- using PrintWriter---------------------------------
    // step 1: Create instance of File
    val outFile1 = new File(output_dir1)
    // step 2: Create instance of PrintWriter(File instance)
    val outWriter1 = new PrintWriter(outFile1) // we can also use output_dir instead of outFile1, but pathname and File different
    // step 3: write into file
    outWriter1.write("Hello Hello Hello")
    outWriter1.write("China Singapore Russia")
    // step 4: Close file
    outWriter1.close()                         // remember to close after write
    // step 5 : check Error is needed for PrintWriter method
    println("Error is: " + outWriter1.checkError()) // if got error in writer -> true

    // --------------------option 2- using FileWriter---------------------------------
    // step 1: Create instance of File
    val outFile2 = new File(output_dir2)
    // step 2: Create instance of FileWriter(File instance)
    val outWriter2 = new FileWriter(outFile2)
    // step 3: write into file
    outWriter2.write("Hello Hello Hello\n")
    outWriter2.write("China Singapore Russia\n")
    // step 4: Close file
    outWriter2.flush()      // optional
    outWriter2.close()

    // --------------------option 3- using BufferedWriter---------------------------------
    // step 1: Create instance of File
    val outFile3 = new File(output_dir3)
    // step 2: Create instance of FileWriter(File instance)
    val outWriter3 = new FileWriter(outFile3)
    // step 3: Create instance of BufferedWriter(FileWriter instance)
    val bufferedWriter3 = new BufferedWriter(outWriter3)
    // step 4: write into file
    bufferedWriter3.write("Hello Hello Hello\n")
    bufferedWriter3.write("China Singapore Russia\n")
    // step 5: Close file
    bufferedWriter3.flush()     // optional
    bufferedWriter3.close()

    /*
    Difference:
    1. Exception Handling:
    - PrintWriter => Error handling using checkError method
    - FileWriter + BufferedWriter => Can use try catch block

    2. Flushing the data
    - PrintWriter => Costly/Slow, it flush
    - FileWriter + BufferedWriter => Less Costly/Fast, You have to flush manually OR it will be flush when you close it.
    - FileWriter is more in favored.
     */
  }
}
