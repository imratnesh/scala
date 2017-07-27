name := "Tweets"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.0.2"

libraryDependencies += "org.twitter4j" % "twitter4j-core" % "3.0.3"

libraryDependencies += "org.twitter4j" % "twitter4j-stream" % "3.0.3"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.1.0" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.1.0" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-streaming-twitter" % "1.2.0" 

libraryDependencies += "org.twitter4j" % "twitter4j-stream" % "3.0.3" 

unmanagedBase <<= 
baseDirectory {base => base/"lib"} 

resolvers += "Akka Repository" at "http://repo.akka.io/releases/" 