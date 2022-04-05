  import java.io.FileOutputStream
  import java.io.ObjectOutputStream

  @SerialVersionUID(15L)
  class Animal(name: String, age: Int) extends Serializable {
    override def toString = s"Animal($name, $age)" //To override method in scala override keyword is required.
  }

  case class Person(name: String) extends Serializable

  object DemoFserialization extends App {
    val fos = new FileOutputStream(System.getProperty("user.dir") + "/src/main/scala/sampleSerial.txt")
    val oos = new ObjectOutputStream(fos)

    val Animal1 = new Animal("Dvorak", 12) // Create Animal object instance
    val Person1 = Person("Dijkstra")                    // Create Person object instance
    oos.writeObject(Animal1)                            // Write Animal1 object as serialized data
    oos.writeObject(Person1)                            // Write Person1 object as serialized data
    oos.close
  }

