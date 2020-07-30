class Rational(a:Int, b:Int)
{
	def numer = a;
	def denom = b;

	def sub(x:Rational) = new Rational(numer*x.denom - x.numer*denom, denom*x.denom)
}

object Question2
{
	def main(args:Array[String])
	{
		val i = new Rational(3,4);
		val j = new Rational(5,8);

		//print(i.sub(j).numer);
		//print("/");
		//println(i.sub(j).denom);

		println("");
		val x = new Rational(i.sub(j).numer, i.sub(j).denom)
		val y = new Rational(2,7);

		print(x.sub(y).numer);
		print("/");
		println(x.sub(y).denom);
	}
}