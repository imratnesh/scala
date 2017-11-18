import scala.util.matching.Regex

object TestPattern
{
def main (args : Array[String])
{
val pattern = "[\\w]+".r
val str ="Scala is Scalable and cool"

println ((pattern findAllIn str).mkString(","))

//println(patter find str)
}
}