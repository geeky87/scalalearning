import scala.util.control.Breaks

object MyLoops extends App {

  // For loop usage in many Ways
  for (myloops <- 1 to 5)
    println("i am in loop" + myloops)

  for (myloops1 <- 1 until 5)
    println("i am in loop" + myloops1)

  val myList = List("Kiran","Swathi","Acharya","Prabhu")
  for (ml <- myList if ml== "Prabhu")
    println("I have found the last Name " + ml)

  val myLastName = for {
    ml1 <- myList
    if (ml1== "Prabhu" || ml1=="Acharya")
  }yield ml1
  println("I have found again the last Name " + myLastName)

  // two Dimensional Array Loop
   val myTwoDimArray = Array.ofDim[String](2,2)
  myTwoDimArray(0)(0) = "Its First Element"
  myTwoDimArray(0)(1) = "Its Second Element"
  myTwoDimArray(1)(0) = "Its Third Element"
  myTwoDimArray(1)(1) = "Its Fourth Element"

    for {
      x <- 0 until 2
      y <- 0 until 2

    }println(s"My Element myTwoDimArray(${(x,y)} : ${myTwoDimArray(x)(y)} ")

  val loop = new Breaks
  val myArray = Range(1, 10)
  loop.breakable {
    for (a <- myArray) {
      println(a)
      if (a == 3)
        loop.break()

    }
  }


}
