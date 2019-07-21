import scala.util.control.Breaks

object MyLoops {
  def main(args: Array[String]): Unit = {
    val loop = new Breaks
    val myArray = Range(1,10)
    loop.breakable
    {
      for (a <- myArray)
        {
          println(a)
         if (a==3)
           loop.break()
        }

    }


  }
}
