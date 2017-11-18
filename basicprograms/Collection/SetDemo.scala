object SetDemo
{
def main (args : Array[String])
{
var empty: Set[Int] = Set()

println(empty.isEmpty)
var Set1:Set[Int] = Set(4,86,7,34,91,3)
var Set2:Set[Int] = Set(4,14,6,7,3,98,24,15)
var newSet = Set1.++(Set2.take(5))
var i:Int =25
println(newSet.filter(x=>x<25))

println(Set1.&(Set2).product)
println(Set1.max)
println(Set2.takeRight(2))
}
//def f(x: Int): Boolean =
//{
//def f(x:Int)= if(x<25)true else false
//}
}