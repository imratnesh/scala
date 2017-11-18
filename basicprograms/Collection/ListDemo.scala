object ListDemo
{
def main (args : Array[String])
{
//var fruit1: List[String] =List()
val fruit2: List[String] = List("apples", "orange", "pears")
var fruit1= "apple" :: ("papaya" :: ("orange" :: Nil))

var fruits =List.concat(fruit1,fruit2)

println(fruits.isEmpty)
//fruits = List.concat(fruit1,fruit2)
println(fruits)
fruits = fruit1.::: (fruit2.tail)
println("head n tail::: "+fruits)

var f =fruit1 + ("banana")
println(fruits.distinct.takeRight(2))
}
}