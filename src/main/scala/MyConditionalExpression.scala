object MyConditionalExpression extends App {

  val myAge = 10
  val myNextAge = 25

  if (myAge == 15)
    print("I am good Boy")
  else if (myAge == 10 && myNextAge == 30)
    println("Seems to be in Trouble")
  else
    println("I am am good guy")

  val myResult = if (myNextAge == 25) 30

  print("my Result is :" + myResult)

}
