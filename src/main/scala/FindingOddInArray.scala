import scala.util.control.Breaks

object FindingOddInArray {

  def main(args: Array[String]): Unit = {


    val myArray = Array(9, 3, 9, 3, 9,7,7,9,15) // 3 3 7 9 9 9 9
    println("Odd in the array is : " + solution(myArray))

    def solution(a: Array[Int]): Int = {
      // write your code in Scala 2.12
      val b = a.sorted
      b.foreach(l => println(l))

      if (b.distinct.length == 1 || b.length == 1)
        return b.distinct(0)

      var index: Int = b.length-1
      var j = 0
      val loop = new Breaks
      loop.breakable {
        while (j < b.length - 1) {
          println("j :" + j)
          println("j+1 :" + (j + 1))
          if ((j + 1 <= b.length) && (b(j) == b(j + 1))) {
                j += 2
              }
          else if ((j + 2 <= b.length) && (b(j+1) == b(j + 2))) {
            index = j
            loop.break()
          }


        }
      }
      return b(index)

    }


  }


}
