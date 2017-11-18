object Extractor {
def main(args :Array[String])
{
println(apply("ratnesh","yahoo.com"))
println(unapply("ratnesh@yahoo.com"))
}
def apply(user : String, domain : String) :String = user +"@"+domain

def unapply(email : String) :String = {
 
 val split = email.split("@")
 if(split.length != 2)
 "Invalid email"
 else
 "user " + split(0)
}
}