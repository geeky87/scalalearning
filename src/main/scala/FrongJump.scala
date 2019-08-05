import scala.util.control.Breaks

object FrongJump {

  def main(args: Array[String]): Unit = {
  print("Hey Wassup solution is "+ solution(1,5,2))
  }

  def solution(x: Int, y: Int, d: Int): Int = {
    // write your code in Scala 2.12
    val loop = new Breaks
    var i = 0
    var sum :Int = x
    val prev_sum = 0
    loop.breakable{
      while( sum <= y){
        sum =sum+d
        i+=1
      }
  return i

  }


}
