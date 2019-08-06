object MyPatternMatch extends App {
  // Pattern Matching
  val myFood = "Piz"

  // Type 1
  myFood match {
    case "Roti" => println("Its the Roti")
    case "Pizza" => println("Its the Pizza")
    case _ => println("Oh I am not Sure What you Eat")
  }
  // Type 2
  val myMatch = myFood match {
    case "Roti" | "Chicken" => "Its the Roti"
    case "Pizza" => "Its the Pizza"
    case _ => "Oh I am not Sure What you Eat"
  }
  println(s"My Type of Food is : $myMatch")

  // Type 3
  val myMatch2 = myFood match {
    case "Roti" | "Chicken" => "Its the Roti"
    case food if (food.contains("Piz")) => "Its the Pizza"
    case _ => "Oh I am not Sure What you Eat"
  }
  println(s"My Type of Food is 1 : ${myMatch2}")

  // Type 4 Type Inference matching
  val myFoodRange : Any = 152487.2148798
  val myType = myFoodRange match {
    case ran: Int => "Int"
    case ran: Double => "Double"
    case ran: Long => "Long"
    case ran: String => "String"
    case ran: Short => "Short"
    case ran: Byte => "Byte"
  }
  println(s"My Price Type : $myType")


}
