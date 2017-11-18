class Rational(n:Int,d:Int){
 require(d!=0)
 val numer = n
 val denom = d
 override def toString = numer+ "/"+ denom
 def add(that :Rational):Rational =
 new Rational(
 numer*that.denom +that.numer*denom,denom*that.denom
)
def main (args :Array[String])
{
val c = new Rational(4,2)
}
}