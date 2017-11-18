object TupleDemo
{
def main(args : Array[String])
{
var t = Tuple2(1,"gate")

println(t._2)
println(t.swap)
var t1 = Tuple4(1,'f',"hello",2.0)

t1.productIterator.foreach
{
i=>println( i)
}

}

}