object MyRange extends App {
  // Defining the Range
  val mySimpleRange = 1 to 5
  mySimpleRange.foreach(println(_))

  // Defining the Range using Until
  val mySimpleRangeU = 1 until  5
  mySimpleRangeU.foreach(println(_))

  // using the Step
   val myStepRange = 0 to 100 by 10
   myStepRange.foreach(println(_))

   println("***********************")
   val myAlphaRange = 'a' to 'z'
    myAlphaRange.foreach(println(_))

  println("***********************")

   val myAlphaStepRange = 'a' to 'z' by 2
  myAlphaStepRange.foreach(println(_))

  // Range Conversion to Collection
  val myOrgRange = 1 to 10

  val myRangeList = myOrgRange.toList
  println(myRangeList.mkString(" ,"))

  val myRangeSeq = myOrgRange.toSeq
  println(myRangeSeq.mkString(" ,"))

  val myRangeSet = myOrgRange.toSet
  println(myRangeSet.mkString(" ,"))

  val myRangeArray = myOrgRange.toArray
  println(myRangeArray.mkString(" ,"))






}
