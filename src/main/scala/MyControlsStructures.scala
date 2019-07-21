object MyControlsStructures {
  def main(args: Array[String]): Unit = {
    println("My Month is :"+calcMonth(7))

  }

  def calcMonth (x : Int) : String = x match
    {
      case 1 => "Jan"
      case 2 => "Feb"
      case 3 => "Mar"
      case 4 => "Apr"
      case 5 => "May"
      case 6 => "Jun"
      case 7 => "Jul"
      case _ => "Its in the future"

    }


}

