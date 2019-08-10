import Array._
import scala.collection.mutable
import scala.collection.immutable.{BitSet, HashMap, HashSet, ListMap, ListSet, Queue, SortedSet, TreeMap, TreeSet}


object MyImmutableCollection extends App {

  //***************************************************
  // Immutable Collections
  //***************************************************
  // List
  val myLList: List[Int] = List(1, 2, 3)
  println("Head of my List is :" + myLList.head)
  println("Tail of my List is :" + myLList.tail)
  println("First Element of my List is :" + myLList(0))

  // Appending
  val myLList2: List[Int] = myLList :+ 5
  println(s"My Appended List Tail is ${myLList2.tail}   ")

  val myLList3: List[Any] = myLList :: myLList2
  println(s"My Two List Appended List Tail is $myLList3   ")

  val myLList4: List[Any] = myLList ::: myLList2
  println(s"My Two List Appended in diffrent Way List is $myLList4   ")

  // Empty List
  val emptyList: List[String] = List.empty[String]

  // Filling the List
  val myFilledList = List.fill(8)("We can Do it")
  myFilledList.foreach(i => println(i))

  // Immutable List Set :  is Similar to List except it doesnt Maintains the Order and no Positional access
  val myListSet: ListSet[String] = ListSet("Kiran", "Swathi", "Acharya", "Prabhu", "Prabhu")
  myListSet.foreach(println(_))

  // Immutable ListMap
  val myListMap: ListMap[Int, String] = ListMap(1 -> "Kiran", 2 -> "Swathi")
  myListMap.foreach(println(_))

  // Immutable Map
  // + to add element add the End
  // ++ to add the To list
  // - is to remove the element from the end
  val myMap: Map[Int, String] = ListMap(1 -> "Kiran", 2 -> "Swathi")
  myMap.foreach(println(_))

  // Immutable HashMap
  val myHashMap: HashMap[Int, String] = HashMap(1 -> "Kiran", 2 -> "Swathi")
  myHashMap.foreach(println(_))

  // Immutable TreeMap
  val myTreeMap: TreeMap[Int, String] = TreeMap(1 -> "Kiran", 2 -> "Swathi")
  myTreeMap.foreach(println(_))

  // Immutable Queue
  val myQueue: Queue[String] = Queue("Kiran", "Swathi", "Acharya", "Prabhu")
  myQueue.foreach(println(_))

  // Immutable Sequence
  val mySequence: Seq[String] = Seq("Kiran", "Swathi", "Acharya", "Prabhu")
  println(mySequence)

  // Immutable Set : Doesn't allow Duplicates
  val mySet: Set[String] = Set("Kiran", "Swathi", "Acharya", "Prabhu", "Prabhu", "Acharya")
  val mySet1: Set[String] = Set("Kiran", "Swathi", "Acharya", "Prabhu", "Prabhu", "Acharya", "Maddy", "Jevu")
  println(mySet)

  // Set Opearation are possible Such as Intersection and Diffrence
  val mySet2: Set[String] = mySet & mySet1 // intersection
  println(mySet2)

  val mySet3: Set[String] = mySet1 &~ mySet // Diffrence
  println(mySet3)


  // Immutable Hash Set
  val myHashSet: HashSet[String] = HashSet("Hey Whats up", "Maga Whats going", "with your HashSet", "with your HashSet")
  println(myHashSet)

  // Immutable Tree Set
  val myTreeSet: TreeSet[String] = TreeSet("Hey Whats up", "Maga Whats going", "with your HashSet", "with your HashSet")
  println(myTreeSet)

  // Ordering the Tree Set
  object AlphabetOrdering extends Ordering[String] {
    override def compare(x: String, y: String): Int = x.compareTo(y)
  }

  val myTreeSet1: TreeSet[String] = TreeSet("Kiran", "Swathi", "Acharya", "Prabhu", "Prabhu", "Acharya", "Maddy", "Jevu")(AlphabetOrdering)
  println(myTreeSet1)

  // Immutable SortedSet
  val mySortedSet: SortedSet[String] = SortedSet("Kiran", "Swathi", "Acharya", "Prabhu", "Prabhu", "Acharya", "Maddy", "Jevu")
  println(mySortedSet)

  // Immutable BitSet
  val myBitSet: BitSet = BitSet(2, 5, 6, 7, 8, 9, 6, 5, 1, 2, 5, 4)
  println(myBitSet)

  // Immutable Stack is been deprecated

  // Immutable Streams  I was Lazy to Read to Implement

  // Immutable Vector
  val myVector: Vector[String] = Vector("Kiran", "Swathi", "Acharya", "Prabhu", "Prabhu", "Acharya", "Maddy", "Jevu")
  println(myVector)



}

