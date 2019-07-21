
object CollectionInScala {
  def main(args: Array[String]): Unit = {

    val myArray : Array[Int]= new Array[Int](20)
    val myArray1 = Array(10,20,45)
    myArray(7)= 10
    println(myArray.length)
    println(myArray1.length)

  val myRange = 1 to 10
    println(myRange.length)

  val myMap = Map ("India" -> "Delhi" ,"France"->"Paris")
    println("My Map:"+ myMap.keys)

    println(myFunction(10,20))
    myRfunction("Hello There we just getting started")

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


}

