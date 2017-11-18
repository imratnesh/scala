 object MyClass
{
//println(1+2)

private def sqr(x:Int): Int= x*x

def sumOfSquare(a:Int, b:Int):Int= sqr(a)+sqr(b)


def main (args: Array[String])
{
println(sumOfSquare(4,6))
}
}
