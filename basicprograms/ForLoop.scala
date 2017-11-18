import scala.util.control._

object ForLoop {
def main (args : Array[String])
{
var a=0
var b=0
val numList1 = List(1,2,3,4,5)
val numList2 = List(10,11,12,13,14,15)

val loop1 = new Breaks()
val loop2 = new Breaks 
loop1.breakable
{for(a<-numList1
  if(a>2); if a!=4)
{
println(a)
loop2.breakable{
for(b<-numList2){
println(b)
if(b==12)
{
println("loop2 break ")
loop2.break;
}
}}}}
}}