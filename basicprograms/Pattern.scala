object Pattern
{
def main (args: Array[String])
{
println(matchTest(1))
println(matchTest("two"))
println(matchTest(5))
}
def matchTest (x: Any) : Any =x match
{
case 1 => "One"
case "two" => 2
case _ => "Many"
}
}