// Copyright Ratnesh Kushwaha
import java.io._
import scala.io.Source
import scala.util.matching.Regex
object LogPattern 
{
var addChar :String = ""
def main (args : Array[String])
{
val writer = new PrintWriter(new File("result.txt"))
try
{
val pattern1 = "GET\\s".r
val pattern2 = "POST\\s".r
//Source log file start.txt
Source.fromFile("start.txt").foreach
{
x=> addChar +=x.toString
}
//writer.write((pattern findAllIn addChar.toString).mkString(","))
val get = (pattern1 findAllIn addChar.toString)
val post = (pattern2 findAllIn addChar.toString)
writer.write("No. of GET request:- "+get.length+ "\n")
writer.write("No. of POST request:- "+post.length)
writer.close()
}
catch
{
case ex: FileNotFoundException =>
{println("File exception")}
case ex: IOException=>
{println("IO exception")}
}
}
def check(x: Char) : Char=
{//print(x)
// addChar = ""
addChar += x.toString
//print (addChar.toString)
x}
}