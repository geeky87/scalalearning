import Array._
import scala.collection.mutable

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

    // List
    val myLList : List[Int] = List(1,2,3)
    println("Head of my List is :"+ myLList.head)
    println("Tail of my List is :"+ myLList.tail)

    val myFilledList = List.fill(8)("We can Do it")
    myFilledList.foreach(i=> println(i))


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

