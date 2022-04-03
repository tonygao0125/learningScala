object IteratorDemo {
  def main(args: Array[String]): Unit = {
    // Define a iterator
    var iterator1 = Iterator[String]("Hello World", "Hello India", "Hello Singapore", "Hello China")
    println(iterator1)
    // next() gives the next element
    println(iterator1.next())           // World
    println(iterator1.next())           // India
    println(iterator1.next())           // Singapore
    println(iterator1.next())           // China
    // println(iterator1.next())
    // If no element in Iterator next() will give error. Instead first check using hasNext()
    println(iterator1.hasNext)

    // max and min
    // iterator1.max give an error because we've gone through iterator1 to the end already
    var iterator2 = Iterator[String]("Hello World", "Hello India", "Hello Singapore", "Hello China")
    println(iterator2.max)
    //iterator2.min        // gives ERROR!
    // once the a method is used on the iterator, then it's gone through iterator to end. iterator1 becomes empty

    // we must refine the iterator (reset the index to 0), before using the method again
    var iterator3 = Iterator[String]("Hello World", "Hello India", "Hello Singapore", "Hello China")
    println(iterator3.length)
    println(iterator3.min)
    println(iterator3.length)       // iterator3 becomes empty after using a method on it.

    // Buffer Iterator - buffer the data into memory
    var iterator4 = Iterator[String]("Hello World", "Hello India", "Hello Singapore", "Hello China")
    var bufferedIterator4 = iterator4.buffered
    println(bufferedIterator4.head)         // additional head method
    println(bufferedIterator4.head)
    println(bufferedIterator4.next())
    println(bufferedIterator4.next())
    println(bufferedIterator4.next())
    println(bufferedIterator4.next())
    println(bufferedIterator4.length)           // becomes empty

    // duplicate
    var iterator5 = Iterator[String]("Hello World", "Hello India", "Hello Singapore", "Hello China")
    var iterator6 = iterator5.duplicate
    println(iterator6.getClass)     // duplicate of the iterator creates Tuple2(_1:iterator, _2:iterator)
    println(iterator6._1.next())    // iterator6._1 and _2 are both iterators
    println(iterator6._2.next())


  }
}
