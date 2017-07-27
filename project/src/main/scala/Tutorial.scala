	import spark._
    import spark.streaming._
    import StreamingContext._
    import TutorialHelper._
    object Tutorial {
    def main(args: Array[String]) {
	
	val consumerKey ="DEEgNef5qExOWUMk23RXw"
	val consumerSecret ="mjACE8BuW0TzdKYUSPDk66kJNdOhPi5Qi3iziDt8"
	val accessToken ="54131303-5GZwF3oMVRs3slIHBckoAclY9TNUCJyXDr15ZYJG5"
	val accessTokenSecret ="rvL1y2qXHlMwZ6saFAUUkANUcJ0aevZFydY0FR6iHKDTu"



    StreamingExamples.setStreamingLogLevels()

    
    // Set the system properties so that Twitter4j library used by twitter stream
    // can use them to generat OAuth credentials
    System.setProperty("twitter4j.oauth.consumerKey", consumerKey)
    System.setProperty("twitter4j.oauth.consumerSecret", consumerSecret)
    System.setProperty("twitter4j.oauth.accessToken", accessToken)
    System.setProperty("twitter4j.oauth.accessTokenSecret", accessTokenSecret)
	
	
    val sparkConf = new SparkConf().setAppName("TwitterPopularTags")
    val ssc = new StreamingContext(sparkConf, Seconds(1))
	
   val tweets = ssc.twitterStream()
	

	    val statuses = tweets.map(status => status.getText())
	    statuses.print()

 		ssc.checkpoint(checkpointDir)
 	   ssc.start()
    }
    }

