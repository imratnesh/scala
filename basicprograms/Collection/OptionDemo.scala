object OptionDemo
{
def main (args: Array[String])
{var city: Map[String,String] = Map ("MP"->"Bhopal","Maharashtra"->"Mumbai", "Goa"->"Panji")

println(city.get("Goa"))
println(city.get("MP"))
println(showCapital(city.get("Maharashtra")))
println(showCapital(city.get("Gujarat")))

var product:List[Int] = List(0,2,4,6)
var z:Option[List[Int]] = Some(product)
println(z.productArity)

}
def showCapital(x: Option[String]) = x match {
case Some(s)=> s
case  none=> '?'

}}
