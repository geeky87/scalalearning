import MyFunctions.myVaribaleNumArgs
import sun.plugin2.main.client.DisconnectedExecutionContext

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
  println(s"My Food is : $whatIsMyFavorite")

  // Function Without Parenthesis
  def myfavoriteFood1 = "Yummy Pulav"

  println(s"My Food is : $myfavoriteFood1")

  // Function Without Return Type
  def myNoReturnTypeFunction(): Unit = {
    println("Printing Something as it has no Return Type")
  }

  myNoReturnTypeFunction()

  // Function With Paramater
  def multiply(x: Int, y: Int): Long = {
    x * y
  }

  println(s"Result of multiply Function: ${multiply(100, 2541)}")

  // Function With the Default Value
  def multiplydef(x: Int, y: Int = 785): Long = {
    x * y
  }

  println(s"Result of multiply Default Function: ${multiplydef(180)}")

  // Default with Option Type to NotHave NullPointerException
  def multiplydefOption(x: Int, y: Int = 785, z: Option[Int] = None): Long = {
    z match {
      case Some(e) => x * y * e
      case None => x * y
    }
  }

  println(s"Result of multiply Option Default Function: ${multiplydefOption(180)}")

  // Implicit Parameters to the Function
  implicit val z = 150

  def multiplyImplicit(x: Int, y: Int)(implicit z: Int): Long = {
    x * y * z
  }

  println(s"Result of multiply Implicit Function: ${multiplyImplicit(100, 2541)}")
  // Pass Through Implcit
  println(s"Result of multiply Pass Through Implicit Function: ${multiplyImplicit(100, 2541)(250)}")

  // Implicit Function -- To be done

  // Defining the Function That Takes Generic Parameters
  def myGenericParamFun[T](discount: T): Unit = {
    discount match {
      case d: Double => print("Oh No its double")
      case a: Int => print(" oh Ya its Int")
      case _ => print("Oh No you dint Send Good Data type")
    }

  }

  println(s"Result of Generic Parameter Type Function: ${myGenericParamFun(100)}")
  println(s"Result of Generic Parameter Type Function: ${myGenericParamFun(100.7845)}")

  // Defining the Polymorphic Function That Takes Generic Parameters and Returns Generic Type
  def myPolyMorphicFun[T](discount: T): List[T] = {
    discount match {
      case d: Double => print("Oh No its double")
        List[T](discount)
      case a: Int => print(" oh Ya its Int")
        List[T](discount)
      case _ => print("Oh No you dint Send Good Data type")
        List[T](discount)
    }
  }

  println(s"Result of Polymorphic Function: ${myPolyMorphicFun(100)}")
  println(s"Result of Polymorphic Function: ${myPolyMorphicFun(100.7845)}")

  //Function As Symbols
  class MyAgeCalc {
    val age = 29

    def +(a: Int) = {
      age + a
    }
  }

  val myAge = new MyAgeCalc
  println(s"My Age for Next Year Would be :${myAge + 1} ")


  // Unnamed Function
  val myUnnamedFunction = (x: Int) => x * x
  println("My Unnamed Function  output is :" + myUnnamedFunction(10))

  val myUnnamedFunction2 = (x: Int) => {
    val inter = x * x
    inter * 10
  }
  println("My Unnamed Function 2 output is :" + myUnnamedFunction2(10))


  // recursive Function
  def myFactorial(x: Int): Int = {
    if (x == 1)
      return 1
    x * myFactorial(x - 1)
  }

  println("My Factorial Function output for 6 is :" + myFactorial(6))

  // Named Arguments
  def myNamedArgs(x: Int, y: Int): Unit = {
    println("x is assigned with : " + x + "Y is assigned with : " + y)

  }

  println("My Named Function output is below:" + myNamedArgs(y = 9, x = 10))

  // Varible Number of Arguments
  def myVaribaleNumArgs(args: Int*): Int = {
    var sum = 0
    for (a <- args)
      sum += a
    sum
  }

  println("My Varaible Number of Args output :" + myVaribaleNumArgs(20, 200, 700))
  val vararg = Array[Int](200, 588, 777)
  println("My Varaible Number of Args output :" + myVaribaleNumArgs(vararg: _*))

  // Higher Order Function
  def myHigherOrderFunction(age: Int)(f: Int => Int): Int = {
    val newAge = age + 10
    f(newAge)
  }

  println("My Higher Order Function output :" + myHigherOrderFunction(100) { age => age / 10 })
  println("My Higher Order Function output :" + myHigherOrderFunction(100)(myVaribaleNumArgs(_)))


  // Call by Name and Call by Value


}
