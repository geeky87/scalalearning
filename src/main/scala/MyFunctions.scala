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
object MyFunctions {

  def main(args: Array[String]): Unit = {

    val myUnnamedFunction = (x: Int) => x * x
    println("My Function output is :" + myUnnamedFunction(10))

    println("My Factorial Function output for 6 is :" + myFactorial(6))
    println("My Named Function output is below:" + myNamedArgs(y = 9, x = 10))

    println("My Varaible Number of Args output :" + myVaribaleNumArgs(20,200,700))

    println("My Varaible Higher Order Function output :" + myHigherOrderFunction(2,20,70))

  }

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
   def myHigherOrderFunction (args : Int *): Unit = {
   val sal = args.toList
   val myDoubleSal = (x : Int) => x * x * x
   val myDoubleList = sal.map(myDoubleSal(_))

   }




}
