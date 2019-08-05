object RotationOfArray {
  def main(args: Array[String]): Unit = {

    val some = Array(3, 8, 9, 7, 6)
    val l = 2

    solution(some,l).foreach(e => print(" "+ e))

    def solution(a: Array[Int], k: Int): Array[Int] = {
      // write your code in Scala 2.12
      if ((k==0) || (k == a.length ) || (a.distinct.length == 1))
       return a
      else
      {
        var i =0
        val b : Array[Int] = new Array[Int](a.length)
        while (i < a.length )
          {
            println((i + k) % a.length)
            b((i + k) % a.length) =a(i)
            i+=1
          }
        return b
      }

    }







  }


}
