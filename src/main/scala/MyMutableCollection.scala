import scala.Array.ofDim
import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, HashMap, ListBuffer, Queue}

object MyMutableCollection extends App {

  println("************Array************")
  // ways of declaration of the Array
  val myArray: Array[String] = Array("Kiran", "Swathi", "Prabhu", "Acharya")
  myArray.foreach(println(_))
  println(myArray.mkString(", "))

  // Initializing the Array with its Capacity
  val myArraywithCapacity: Array[Int] = new Array(10)
  val myArraywithoutCapacity: Array[Int] = Array()
  println(myArraywithoutCapacity.length)

  // Using the Type Inference
  val b = new Array[Int](50)
  val c = Array(1, 2, 3)

  // Using the Range to Initialize the Array
  val e = Range(10, 100)
  val f = Range(2, 10, 1)
  val h = (1 to 10).toArray[Int]
  println(e)

  // Multidemensional Array
  val myMultiDimArray = Array.ofDim[Int](5, 5)

  println("************Operations on Array************")
  // Copy An Array
  val myArray5 = Array(1, 2, 3)
  val myArray6 = new Array[Int](myArray5.length)
  Array.copy(myArray5, 0, myArray6, 0, myArray5.length)
  println(myArray6.mkString(","))

  // Concatenation : Need to import the Array Package
  val myConcatArray = Array.concat(c, myArraywithCapacity)
  val myArray7 = myArray6.clone()

  // Looping on Array
  val myArray8 = Array(1, 2, 3, 4, 5)
  for (a <- myArray8)
    println(a)

  //Comparing an Array
  val myComparision1 = Array(1, 2, 3, 4, 5)
  myComparision1(1) = 5
  val myComparision2 = Array(1, 2, 3, 4, 5)
  // To be Done

  println("************Array Buffer************")
  // Array Buffer is Useful/faster to add Elements at the end
  val myArrayBuffer: ArrayBuffer[String] = ArrayBuffer("Kiran", "Swathi", "Prabhu", "Acharya")
  val myArrayBuffer1: ArrayBuffer[String] = ArrayBuffer[String]()

  // Addition of Elements Using +=
  myArrayBuffer1 += "my First Element"
  myArrayBuffer1 += "my Second Element"
  println(myArrayBuffer1.mkString(" # "))

  // Addition of List Elements Using ++=
  myArrayBuffer1 ++= List("Third Element", "Fourth Element")
  println(myArrayBuffer1.mkString(" # "))

  // Removing of Elements Using -=
  // Removing of List Elements Using ++=

  // Empty Sized Buffer
  val myArraybufferEmpty: ArrayBuffer[Int] = ArrayBuffer.empty[Int]

  println("************Array Stack************")
  // Seeems to be Removed from the 2.13.0

  println("************ListBuffer ************")
  val myListBuffer: ListBuffer[String] = ListBuffer()
  myListBuffer += "Swathi"
  myListBuffer += "Prabhu"
  println(myListBuffer.mkString(" § "))
  myListBuffer ++= List("Third Element", "Fourth Element")
  println(myListBuffer.mkString(" § "))
  myListBuffer -= "Prabhu"
  println(myListBuffer.mkString(" § "))
  myListBuffer --= List("Third Element", "Fourth Element")
  println(myListBuffer.mkString(" § "))

  val myEmptyListBuffer: ListBuffer[Int] = ListBuffer.empty
  myEmptyListBuffer.addOne(1)
  myEmptyListBuffer += 2
  println(myEmptyListBuffer.mkString(" § "))

  println("************Map ************")
  var myMap: Map[Int, String] = Map[Int, String]()
  myMap += (1 -> "Prabhu")
  myMap += (2 -> "Swathi")
  myMap += (3 -> "Prabhu")

  println(myMap.mkString(" § "))
  var myMap1: Map[Int, String] = Map.empty[Int, String]
  myMap1 += (4 -> "Acharya")

  myMap ++= myMap1
  println(myMap.mkString(" § "))
  myMap -= (3)
  println(myMap.mkString(" § "))
  myMap --= myMap1.keys
  println(myMap.mkString(" § "))

  println("************Hash Map ************")

  var myHashMap: HashMap[Int, String] = HashMap[Int, String]()
  myHashMap += (1 -> "Prabhu")
  myHashMap += (2 -> "Swathi")
  myHashMap += (3 -> "Prabhu")

  println(myHashMap.mkString(" € "))
  var myHashMap1: HashMap[Int, String] = HashMap.empty[Int, String]
  myHashMap1 += (4 -> "Acharya")

  myHashMap ++= myHashMap1
  println(myHashMap.mkString(" § "))
  myHashMap -= (3)
  println(myHashMap.mkString(" § "))
  myHashMap --= myHashMap1.keys
  println(myHashMap.mkString(" § "))

  println("************Queue ************")

  val myQueue: Queue[Int] = Queue[Int]()
  myQueue += 1
  myQueue += 6
  myQueue += 3
  println(myQueue.mkString(","))
  myQueue.enqueue(4)
  println(myQueue.mkString(","))
  myQueue.dequeue()
  println(myQueue.mkString(","))

  println("************Priority Queue ************")
  // Lazy to Implement

  println("************ Set/HashSet/SortedSet/TreeSet/LinkedHashSet/BitSet ************")
  // Lazy to Implement as its Same as of Immutable Set





}
