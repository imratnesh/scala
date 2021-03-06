import org.apache.spark._
import org.apache.spark.SparkContext._

object WordCount
{
def main(args: Array[String])
{
val sc = new SparkContext(args(0), "BasicMap", 
				System.getenv("SPARK_HOME"))
//SparkContext sc = System.getenv("SPARK_HOME");
val file = sc.textFile(args(1)) 
val words = file.flatMap(_.split(" ").map(_,1)
				.reduceByKey(_+_))
words.saveAsTextFile(args(2))
}
}