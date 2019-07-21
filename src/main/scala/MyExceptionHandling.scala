import java.io.IOException

object MyExceptionHandling {
  def main(args: Array[String]): Unit = {

    try{

      throw new Exception("I am just like that throwing the eception")

    }
    catch {
      case e:IOException => print(e.getMessage)
      case _ :Throwable => println("dont worry I catched it")



    }
    finally {
      println("Yes at last i am the one who save you")

    }

  }


}
