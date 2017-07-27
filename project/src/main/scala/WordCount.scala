//import org.apache.spark.SparkContext
import org.apache.spark._
import org.apache.spark.SparkContext._

object WordCount{
def main(args: Array[String]){
//val sc = new SparkContext(args(0), "BasicMap", //System.getenv("SPARK_HOME"))

  val conf = new SparkConf().setAppName("WordCount")
//val spark = new SparkContext("localhost:8484", "BasicMap", //System.getenv("SPARK_HOME"))
    
val sc = new SparkContext(conf)

val file = sc.textFile(args(0)) 
val words = file.flatMap(_.split(" "))
					.map((_,1)).reduceByKey(_ + _)
words.saveAsTextFile(args(1))
sc.stop()
}
}