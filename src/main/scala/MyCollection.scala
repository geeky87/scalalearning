import Array._
import scala.collection.mutable
import scala.collection.immutable.{HashMap, ListMap, ListSet, Queue, TreeMap}

object MyCollection {
  def main(args: Array[String]): Unit = {

    // ways of declaration of the Array
    val a : Array[Int] = new Array[Int](10)
    val l : Array[Int] = Array()
    val b = new Array[Int](50)
    val c = Array(1,2,3)

    val e = Range(10,100)
    val f = Range(2,10,1)

    // Multidemensional Array
    val k = ofDim[Int](3,3)

    // Concatenation : Need to import the Array Package
    val d = Array.concat(c,a)

    // Operation on the Array
    val myArray : Array[Int]= new Array[Int](20)
    val myArray1 = Array(10,20,45)
    myArray(7)= 10
    println(myArray.length)
    println(myArray1.length)

    // tuples examples
    val t = Tuple3("1",2010.5451,"Kiran")
    t.productIterator.foreach(i => println("value :"+ i) )

    // Iterators
    val myIterator =Iterator(1,2,3)
     while (myIterator.hasNext)
       println(myIterator.next())

    //***************************************************
    // Immutable List
    val myLList : List[Int] = List(1,2,3)
    println("Head of my List is :"+ myLList.head)
    println("Tail of my List is :"+ myLList.tail)
    println("First Element of my List is :"+ myLList(0))

    // Appending
    val myLList2 : List[Int] = myLList:+5
    println(s"My Appended List Tail is ${myLList2.tail}   ")

    val myLList3 :List[Any] = myLList::myLList2
    println(s"My Two List Appended List Tail is ${myLList3}   ")

    val myLList4 :List[Any] = myLList:::myLList2
    println(s"My Two List Appended in diffrent Way List is ${myLList4}   ")

    // Empty List
    val emptyList : List[String] = List.empty [String]

    // Filling the List
    val myFilledList = List.fill(8)("We can Do it")
    myFilledList.foreach(i=> println(i))

    // Immutable List Set :  is Similar to List except it doesnt Maintains the Order and no Positional access
    val myListSet : ListSet[String] = ListSet("Kiran","Swathi","Acharya","Prabhu","Prabhu")
    myListSet.foreach(println(_))

    // Immutable ListMap
      val myListMap : ListMap[Int, String] = ListMap (1-> "Kiran",2-> "Swathi")
       myListMap.foreach(println(_))

    // Immutable Map
    // + to add element add the End
    // ++ to add the To list
    // - is to remove the element from the end
    val myMap : Map[Int, String] = ListMap (1-> "Kiran",2-> "Swathi")
    myMap.foreach(println(_))

    // Immutable HashMap
    val myHashMap : HashMap[Int, String] = HashMap (1-> "Kiran",2-> "Swathi")
    myHashMap.foreach(println(_))

    // Immutable TreeMap
    val myTreeMap : TreeMap[Int, String] = TreeMap (1-> "Kiran",2-> "Swathi")
    myTreeMap.foreach(println(_))

    // Immutable Queue
    val myQueue : Queue[String] = Queue ("Kiran","Swathi","Acharya","Prabhu")
    myQueue.foreach(println(_))

    // Immutable Sequence
    val mySequence : Seq[String] = Seq ("Kiran","Swathi","Acharya","Prabhu")
    println(mySequence)

    // Immutable Set : Doesn't allow Duplicates
    val mySet : Set[String] = Set ("Kiran","Swathi","Acharya","Prabhu","Prabhu","Acharya")
    val mySet1 : Set[String] = Set ("Kiran","Swathi","Acharya","Prabhu","Prabhu","Acharya","Maddy","Jevu")
    println(mySet)

     // Set Opearation are possible Such as Intersection and Diffrence
     val mySet2 : Set[String] = mySet & mySet1 // intersection
     println(mySet2)

     val mySet3 : Set[String] = mySet1 &~ mySet // Diffrence
    println(mySet3)
    // Stacks

    var myStack = mutable.Stack[Int]()

    myStack.push(1)
    myStack.push(2)
    myStack.push(3)

    myStack.foreach(i => println(i))

    // LinearSeq

    //var myLinearSeq = mutable.LinearSeq

  /*
    var a =1041
    var myArray2 : Array[Int]= new Array[Int](32)

    if(a < 0 )
      myArray2(0) = 0
    var mod : Int = 0
    var i = 0
    while (a > 0)
    {
      mod = a % 2
      myArray2(i) = mod
      a = a/2
      i+=1
      }
    var j = 0
   while (j < myArray2.length){
        println(myArray2(j))
        j=j+1
  }
    var k =0
    var m =0
    var flag =0
    var l =0
    var len =0
    var kflag =0
    while (l< myArray2.length){
      if (myArray2(l)==1 & flag == 0 || kflag == 0)
      {
        k = l
        flag = 1
        kflag == 1
      }
      else if (myArray2(l)==0 & flag == 1)
      {
       flag = 2
      }
      else if (myArray2(l)==1 & flag == 2 & kflag == 1)
      {
        m = l
        flag = 0
        kflag == 0
      }
      if (len < (m-k))
          len = m-k
        l=l+1
       }

    print("Length is :" + len)

  }

  def myFunction (a :Int, b : Int) :Int = {
    val c = a*b
    return c
  }

  def myRfunction (a :String) :Unit = {
    println(a)
  }
*/


}
}

