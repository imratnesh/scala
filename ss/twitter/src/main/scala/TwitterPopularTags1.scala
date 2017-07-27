import org.apache.spark.streaming.Seconds
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.StreamingContext._
import org.apache.spark.SparkContext._
import org.apache.spark.streaming.twitter._
import org.apache.spark.SparkConf

/**
 * Calculates popular hashtags (topics) over sliding 10 and 60 second windows from a Twitter
 * stream. The stream is instantiated with credentials and optionally filters supplied by the
 * command line arguments.
 *
 * Run this on your local machine as
 *
 */
object TwitterPopularTags1 {

def main(args: Array[String])
{
	val consumerKey ="DEEgNef5qExOWUMk23RXw"
	val consumerSecret ="mjACE8BuW0TzdKYUSPDk66kJNdOhPi5Qi3iziDt8"
	val accessToken ="54131303-5GZwF3oMVRs3slIHBckoAclY9TNUCJyXDr15ZYJG5"
	val accessTokenSecret ="rvL1y2qXHlMwZ6saFAUUkANUcJ0aevZFydY0FR6iHKDTu"

    //StreamingExamples.setStreamingLogLevels()

    
    // Set the system properties so that Twitter4j library used by twitter stream
    // can use them to generat OAuth credentials
    System.setProperty("twitter4j.oauth.consumerKey", consumerKey)
    System.setProperty("twitter4j.oauth.consumerSecret", consumerSecret)
    System.setProperty("twitter4j.oauth.accessToken", accessToken)
    System.setProperty("twitter4j.oauth.accessTokenSecret", accessTokenSecret)

    val sparkConf = new SparkConf().setAppName("TwitterPopularTags")
    val ssc = new StreamingContext(sparkConf, Seconds(2))
    val stream = TwitterUtils.createStream(ssc, None)
	 ssc.checkpoint("C:\\Users\\Ratnesh Kushwaha\\spark_scala\\ck")
    val hashTags = stream.flatMap(status => status.getText.split(" ").filter(_.startsWith("#")))
	
   val counts = hashTags.map(tag => (tag, 1))
    .reduceByKeyAndWindow(_ + _, _ - _, Seconds(60 * 5), Seconds(2))

	//counts.print()
	

    val sortedCounts = counts.map { case(tag, count) => (count, tag) }
    .transform(rdd => rdd.sortByKey(false))
    sortedCounts.foreach(rdd =>
    println("\nTop 10 hashtags:\n" + rdd.take(10).mkString("\n")))


    ssc.start()
    ssc.awaitTermination()
  }
}
