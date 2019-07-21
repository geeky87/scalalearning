object MyStringFunction {

  def main(args: Array[String]): Unit = {

  println("charAt Function :" + "Whats is going on".charAt(0))
    println("compareTo Function :" + "Whats is going on".compareTo("Whats is going on "))


   val myName : String = "Hey whats my Name"
    val myBytesArray : Array[Byte] = myName.getBytes()
    println("getBytes  Function : ")
    for (i <- myBytesArray)
       println(i)

    val myRepeatedName : String = "Hey is this the way you treat me"




  }


}
