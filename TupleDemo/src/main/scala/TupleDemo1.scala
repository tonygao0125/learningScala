object TupleDemo1 {
  def main(args: Array[String]): Unit = {
    // 1. Define a tuple
    val tuple1 = (1, "String Data", 2.3)    //Define a tuple, tuple can contains different data types.
    println("The tuple1 is " + tuple1 + " ,  it's class is " + tuple1.getClass)

    // 2. Define a tuple - Another approach, specify the correct number of elements
    val tuple2 = new Tuple5(1, "String data", 2.3, "k", "%#$@")  // Tuple5 indicates a 5 elements Class
    println(tuple2)

    // 3. Define a tuple with 5 elements(Tuple5 instance object) - with keyword arguments
    // instance constructor: new Tuple5(_1: T1, _2: T2,  _3: T3, _4: T4, _5: T5)
    val tuple2_full = new Tuple5(_1 =1, _2="String data", _3=2.3, _4="K", _5= "%#$@")
    println(tuple2_full)

    // 4. Access elements in tuple3
    val tuple3 = (1, "String Data", 2.3 , 5 , 5.6)
    println("the first element of tuple3 is " + tuple3._1)
    println("the third element of tuple3 is " + tuple3._3)

    // 5. Access elements in Tuple using "productIterator" method
    tuple3.productIterator.foreach(i => println("Value is " + i))

    // 6. convert tuple into single String
    println(tuple3.toString())

    // 7. swap method for Tuple2 - swap the 2 elements
    val tuple_2 = (1, "String data")
    println(tuple_2.swap)
  }
}
