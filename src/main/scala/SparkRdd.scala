import org.apache.spark.{SparkContext, SparkConf}

object SparkRdd {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("SparkRdd").setMaster("local[4]")
    val sc = new SparkContext(conf)

    val movieData = sc.textFile("/user/hduser/datasets/Movie-data-set.txt",3)

    val movieData_1 = movieData.map(line => line.split(";"))

    val movieData_2 = movieData_1.map(m => (m(0),(m(2),m(7))))

    //val movieData_3 = movieData_2.reduceByKey(case (prev, next) => if (prev._2 > next._2) prev else next )

    movieData_2.saveAsTextFile("/user/hduser/output/sparkrddAssiggnmet")

  }

}
