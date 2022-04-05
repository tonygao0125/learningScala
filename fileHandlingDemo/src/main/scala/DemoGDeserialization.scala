// Read serialized data
import java.io._

@SerialVersionUID(15L)
class Animal1(name: String, age: Int) extends Serializable {
  override def toString = s"Animal($name, $age)"
}

case class Person1(name: String)

// or fork := true in sbt
class ObjectInputStreamWithCustomClassLoader(
                                              fileInputStream: FileInputStream
                                            ) extends ObjectInputStream(fileInputStream) {
  override def resolveClass(desc: java.io.ObjectStreamClass): Class[_] = {
    try { Class.forName(desc.getName, false, getClass.getClassLoader) }
    catch { case ex: ClassNotFoundException => super.resolveClass(desc) }
  }
}

object DemoGDeserialization extends App {
  val fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/scala/sampleSerial.txt")
  val ois = new ObjectInputStreamWithCustomClassLoader(fis)

  val animal = ois.readObject
  val person = ois.readObject
  ois.close
  println(animal)
  println(person)
}