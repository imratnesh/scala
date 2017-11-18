import java.io._
import scala.io.Source
import scala.util.matching.Regex
object UrlPattern 
{
var addChar :String = ""
def main (args : Array[String])
{
val writer = new PrintWriter(new File("result1.txt"))
var Res: List[String]=List()
try
{

val pattern = "(\\s)(/.+)(\\sH)".r

Source.fromFile("start.txt").foreach
{
check
}
//print (addChar.toString)
val Urls =(pattern findAllIn addChar.toString).matchData.toList
//println(Urls(0).group(2))
//Urls.productIterator.foreach{ i =>println("Value = " + i.group(2) )}
val i=0
for(i<-0 to Urls.length-1)
{
writer.write("Url no. :"+i+"  |	"+Urls(i).group(2)+" |\n")
}

//val get = (pattern1 findAllIn addChar.toString)
//writer.write("No. of GET request:- "+get.length+ "\n")

writer.close()
}
catch
{
case ex: FileNotFoundException =>
{
println("File exception")
}
case ex: IOException=>
{
println("IO exception")
}
}
}

def check(x: Char) : Char=
{
//print(x)
// addChar = ""
addChar += x.toString
//print (addChar.toString)
x
} 

}