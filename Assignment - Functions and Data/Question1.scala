class Rational(x:Int, y:Int)
{
	def numer = x;
	def denom = y;

	def neg(x:Rational) = new Rational(-numer, denom);
}

object Question1
{
	def main(args:Array[String])
	{
		val i = new Rational(3,4);

		print(i.neg(i).numer);
		print("/");
		println(i.neg(i).denom);
	}
}