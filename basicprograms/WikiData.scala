// Copyright Ratnesh Kushwaha
import java.io._
import scala.io.Source
import scala.util.matching.Regex
object WikiData 
{
var addChar :String = ""
def main (args : Array[String])
{
val writer = new PrintWriter(new File("result3.txt"))
try
{
writer.write("Hello1")
val title = "title \\s".r
val username = "<username>(.*?)<username>".r
val id ="<id>(.*?)<id>".r

//Source log file start.txt
val sc = Source.fromFile("wiki.txt");
for(lines <- sc.getLines)
print(lines)

writer.write("Hello")
writer.write((title findAllIn addChar.toString).mkString(","))
//val titles = (title findAllIn addChar.toString)
//val post = (pattern2 findAllIn addChar.toString)
//writer.write(titles.length+ "\n")
//writer.write("No. of POST request:- "+post.length)
writer.close()
}
catch
{
case ex: FileNotFoundException =>
{println("File exception")}
case ex: IOException=>
{println("IO exception")}}}
def check(x: Char) : Char=
{//print(x)
// addChar = ""
addChar += x.toString
//print (addChar.toString)
x}}