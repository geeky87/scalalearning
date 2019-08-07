class MyClass(fName : String,lName : String ) {

  def myNameis = println(s"My Name is $fName $lName")
}

// Companion Object which can be used as factory of Getting the Objects
object MyClass{
  def apply(fName: String, lName: String): MyClass = new MyClass(fName, lName)
}


object myOops extends App{

 val kiran = new MyClass("Kiran","Acharya")
 kiran.myNameis
  val swathi = MyClass("Swathi","Prabhu")
  swathi.myNameis
}

// Implementation of the Inheritance

abstract class Donut (name : String) {

  def print () : Unit
}

class MyDonut (name : String) extends Donut(name){
  override def print(): Unit = println("My Donut is from Krispy Creme")
}

object MyDonut {
  def apply(name: String): MyDonut = new MyDonut(name)
}

// Creation of the Traits
trait car {
  def driving(name : String)  : Unit
  def ignition(name : String)  : Unit
  def breaking(name : String)  : Unit
}

class Mycar extends car {
  override def breaking(name: String): Unit = println("Hey  I am Stopping the Car")
  override def ignition(name: String): Unit = println("Hey  I am Starting the Car")
  override def driving(name: String): Unit = println("Hey  I am Driving the Car")
}

