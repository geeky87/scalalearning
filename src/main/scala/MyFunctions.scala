/*
Declaring a Function in Scala

 def functionName(parameters:typeofparameters):returntypeoffunction={
//statements to be executed
}

Without =   Means it doesnt return

scala> def sayhello(){
          | println("Hello")
        | }
sayhello: ()Unit

scala> def sum(a:Int,b:Int)
          | {
          | println(a+b)
          | }
sum: (a: Int, b: Int)Unit
scala> sum(2,5)

With = means it retruns some type

scala> def func():Int={
             | return 7
             | }
func: ()Int

scala> def sum(a:Int,b:Int):Int={
    | return a+b
    | }

 */
object MyFunctions extends App {

  // Simple Function
  def myfavoriteFood(): String = {
    "White Pasta"
  }

  val whatIsMyFavorite = myfavoriteFood()
  println(s"My Food is : ${whatIsMyFavorite}")

  // Function Without Parenthesis
  def myfavoriteFood1 = "Yummy Pulav"
  println(s"My Food is : ${myfavoriteFood1}")

  // Function Without Return Type
  def myNoReturnTypeFunction () : Unit = {
    println("Printing Something as it has no Return Type")
  }
  myNoReturnTypeFunction()

  // Function With Paramater
   def multiply(x :Int,y:Int): Long={
     x*y
   }
   println(s"Result of multiply Function: ${multiply(100,2541)}")

  // Function With the Default Value
  def multiplydef(x :Int,y:Int = 785): Long={
    x*y
  }
  println(s"Result of multiply Default Function: ${multiplydef(180)}")

   // Default with Option Type
   def multiplydefOption(x :Int,y:Int = 785,z :Option[Int]=None): Long={
     z match {
       case Some(e) => x*y*e
       case None=> x*y
     }
   }
  println(s"Result of multiply Option Default Function: ${multiplydefOption(180)}")




  // Unnamed Function
  val myUnnamedFunction = (x: Int) => x * x
  println("My Function output is :" + myUnnamedFunction(10))
  println("My Factorial Function output for 6 is :" + myFactorial(6))
  println("My Named Function output is below:" + myNamedArgs(y = 9, x = 10))
  println("My Varaible Number of Args output :" + myVaribaleNumArgs(20, 200, 700))
  println("My Varaible Higher Order Function output :" + myHigherOrderFunction(2, 20, 70))

  // recursive Function
  def myFactorial(x: Int): Int = {
    if (x == 1)
      return 1
    x * myFactorial(x - 1)
  }

  // Named Arguments
  def myNamedArgs(x: Int, y: Int): Unit = {
    println("x is assigned with : " + x + "Y is assigned with : " + y)

  }

  // Varible Number of Arguments
  def myVaribaleNumArgs(args: Int*): Int = {
    var sum = 0
    for (a <- args)
      sum += a
    return sum
  }

  // Higher Order Function
  def myHigherOrderFunction(args: Int*): Unit = {
    val sal = args.toList
    val myDoubleSal = (x: Int) => x * x * x
    val myDoubleList = sal.map(myDoubleSal(_))

  }


}
